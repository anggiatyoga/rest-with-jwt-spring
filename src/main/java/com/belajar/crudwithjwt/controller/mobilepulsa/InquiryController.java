package com.belajar.crudwithjwt.controller.mobilepulsa;

import com.belajar.crudwithjwt.model.mobilepulsa.Inquiry;
import com.belajar.crudwithjwt.repository.mobilepulsa.InquiryRepository;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.DatatypeConverter;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

import static com.belajar.crudwithjwt.utils.Utils.convertStreamToString;

@RestController
public class InquiryController {

    @Autowired
    private InquiryRepository inquiryRepository;

    public InquiryController(InquiryRepository inquiryRepository) {
        this.inquiryRepository = inquiryRepository;
    }

    @PostMapping("ppob/inquiry")
    public String inqury(@RequestParam Map<String, String> body) {
        String code = body.get("code");
        String hp = body.get("hp");
        String refId = body.get("ref_id");
        String month = body.get("month");

        String uname = "087773906676";
        String apiKey = "4645e149335884d2";
        String outputJson = "";

        try {

            String url = "https://testpostpaid.mobilepulsa.net/api/v1/bill/check";

            URL obj = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");

            String sign = uname + apiKey + refId;

            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(sign.getBytes());
            byte[] digest = md.digest();
            String myHash = DatatypeConverter.printHexBinary(digest).toLowerCase();
            String data;

            if (code.equals("BPJS")) {
                data =  "{\n" +
                        "  \"commands\"   : \"inq-pasca\",\n" +
                        "  \"username\"   : \"" + uname + "\",\n" +
                        "  \"code\"       : \"" + code + "\",\n" +
                        "  \"hp\"         : \"" + hp + "\",\n" +
                        "  \"ref_id\"     : \"" + refId + "\",\n" +
                        "  \"sign\"       : \"" + myHash + "\",\n" +
                        "  \"month\"      : \"" + month + "\"\n" +
                        "}";
            } else {
                data =  "{\n" +
                        "  \"commands\"   : \"inq-pasca\",\n" +
                        "  \"username\"   : \"" + uname + "\",\n" +
                        "  \"code\"       : \"" + code + "\",\n" +
                        "  \"hp\"         : \"" + hp + "\",\n" +
                        "  \"ref_id\"     : \"" + refId + "\",\n" +
                        "  \"sign\"       : \"" + myHash + "\"\n" +
                        "}";
            }

            OutputStreamWriter out = new OutputStreamWriter(conn.getOutputStream());
            out.write(data);

            out.close();
            outputJson = convertStreamToString(conn.getInputStream());
            System.out.print(data);

            try {
                final JSONObject jsonObject = new JSONObject(outputJson);
                final JSONObject jsonArray = jsonObject.getJSONObject("data");

                long Response_tr_id = jsonArray.getLong("tr_id");
                String Response_code = jsonArray.getString("code");
                String Response_hp = jsonArray.getString("hp");
                String Response_tr_name = jsonArray.getString("tr_name");
                String Response_period = jsonArray.getString("period");
                long Response_nominal = jsonArray.getLong("nominal");
                int Response_admin = jsonArray.getInt("admin");
                String Response_ref_id = jsonArray.getString("ref_id");
                long Response_selling_price = jsonArray.getLong("selling_price");

                inquiryRepository.save(new Inquiry(Response_tr_id, Response_code, Response_hp, Response_tr_name,
                        Response_period, Response_nominal, Response_admin, Response_ref_id, Response_selling_price));

            } catch (JSONException e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return outputJson;
    }
}
