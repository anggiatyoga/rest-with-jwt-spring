package com.belajar.crudwithjwt.controller.mobilepulsa;

import com.belajar.crudwithjwt.model.mobilepulsa.Payment;
import com.belajar.crudwithjwt.repository.mobilepulsa.PaymentRepository;
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
public class PaymentController {

    @Autowired
    private PaymentRepository paymentRepository;

    public PaymentController(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @PostMapping("ppob/payment")
    public String payment(@RequestParam Map<String, String> body) {
        String trId = body.get("tr_id");
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


            String sign = uname + apiKey + trId;

            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(sign.getBytes());
            byte[] digest = md.digest();
            String myHash = DatatypeConverter.printHexBinary(digest).toLowerCase();

            String data =  "{\n" +
                    "  \"commands\"   : \"pay-pasca\",\n" +
                    "  \"username\"   : \"" + uname + "\",\n" +
                    "  \"tr_id\"     : \"" + trId + "\",\n" +
                    "  \"sign\"       : \"" + myHash + "\"\n" +
                    "}";

            OutputStreamWriter out = new OutputStreamWriter(conn.getOutputStream());
            out.write(data);

            out.close();
            outputJson = convertStreamToString(conn.getInputStream());
            System.out.print(data);

            try{
                final JSONObject jsonObject = new JSONObject(outputJson);
                final JSONObject jsonArray = jsonObject.getJSONObject("data");

                long tr_id = jsonArray.getLong("tr_id");
                String code = jsonArray.getString("code");
                String datetime = jsonArray.getString("datetime");;
                String hp = jsonArray.getString("hp");;
                String tr_name = jsonArray.getString("tr_name");;
                String period = jsonArray.getString("period");;
                long nominal = jsonArray.getLong("nominal");
                long admin = jsonArray.getLong("admin");
                String message = jsonArray.getString("message");;
                long selling_price = jsonArray.getLong("selling_price");
                String noref = jsonArray.getString("noref");;
                String ref_id = jsonArray.getString("ref_id");

                paymentRepository.save(new Payment(tr_id, code, datetime, hp, tr_name, period, nominal
                ,admin, message, selling_price, noref, ref_id));

            } catch (Exception e){
                e.printStackTrace();
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
        return outputJson;
    }

}
