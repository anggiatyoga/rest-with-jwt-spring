package com.belajar.crudwithjwt.controller.mobilepulsa;

import com.belajar.crudwithjwt.model.mobilepulsa.TransactionMP;
import com.belajar.crudwithjwt.repository.mobilepulsa.TransactionMPRepository;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.DatatypeConverter;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.belajar.crudwithjwt.utils.Utils.convertStreamToString;

@RestController
public class TopUpMPController {

    @Autowired
    private TransactionMPRepository transactionMPRepository;

    public TopUpMPController(TransactionMPRepository transactionMPRepository) {
        this.transactionMPRepository = transactionMPRepository;
    }

    @PostMapping("ppob/topup")
    public String topupMP(@RequestParam Map<String, String> body) {
        String hpCustomer = body.get("hp");
        String pulsaCode = body.get("pulsa_code");
        String outputJson = "";

        try {

            String url = "https://testprepaid.mobilepulsa.net/v1/legacy/index";

            URL obj = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");

            String uname = "087773906676";
            String pass = "4645e149335884d2";
            Date dNow = new Date();
            SimpleDateFormat ft = new SimpleDateFormat("yyyyMMddhhmmss");
            String refId = ft.format(dNow);
            String sign = uname + pass + refId;

            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(sign.getBytes());
            byte[] digest = md.digest();
            String myHash = DatatypeConverter.printHexBinary(digest).toLowerCase();

            String data =  "{\n" +
                    "  \"commands\"   : \"topup\",\n" +
                    "  \"username\"   : \"" + uname + "\",\n" +
                    "  \"ref_id\"     : \"" + refId + "\",\n" +
                    "  \"hp\"     : \"" + hpCustomer + "\",\n" +
                    "  \"pulsa_code\" : \""+ pulsaCode +"\",\n" +
                    "  \"sign\"       : \"" + myHash + "\"\n" +
                    "}";

            OutputStreamWriter out = new OutputStreamWriter(conn.getOutputStream());
            out.write(data);

            out.close();
            outputJson = convertStreamToString(conn.getInputStream());

            System.out.println(outputJson);

            try {
                final JSONObject jsonObject = new JSONObject(outputJson);
                final JSONObject jsonArray = jsonObject.getJSONObject("data");

                String ref_id = jsonArray.getString("ref_id");
                int status = jsonArray.getInt("status");
                String code = jsonArray.getString("code");
                String hp = jsonArray.getString("hp");
                long price = jsonArray.getLong("price");
                String message = jsonArray.getString("message");
                long balance = jsonArray.getLong("balance");
                long tr_id = jsonArray.getLong("tr_id");
                String rc = jsonArray.getString("rc");

                transactionMPRepository.save(new TransactionMP(Long.parseLong(ref_id), status, code, hp, price,
                        message, balance, tr_id, rc));

            } catch (JSONException e){
                e.printStackTrace();
            }

            transactionMPRepository.save(new TransactionMP());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return outputJson;
    }

    @GetMapping("ppob/topup/show")
    public Map<String, Object> showAllListMP() {
        List<TransactionMP> transactionMPList = transactionMPRepository.findAll();

        int batasList = transactionMPList.size();

        Map<String, Object> map = new HashMap<>();
        map.put("data", new HashMap<Integer, Object>(){
            {

                for (int i=0; i<batasList; i++){
                    int finalI = i;
                    put(i, new HashMap<String, Object>(){
                        {
                            for (int j=0; j<9; j++){
                                if (j == 0){
                                    put("ref_id", transactionMPList.get(finalI).getRef_id());
                                } else if (j == 1) {
                                    put("status", transactionMPList.get(finalI).getStatus());
                                } else if (j == 2) {
                                    put("code", transactionMPList.get(finalI).getCode());
                                } else if (j == 3) {
                                    put("hp", transactionMPList.get(finalI).getHp());
                                } else if (j == 4) {
                                    put("price", transactionMPList.get(finalI).getPrice());
                                } else if (j == 5) {
                                    put("message", transactionMPList.get(finalI).getMessage());
                                } else if (j == 6) {
                                    put("balance", transactionMPList.get(finalI).getBalance());
                                } else if (j == 7) {
                                    put("tr_id", transactionMPList.get(finalI).getTr_id());
                                } else if (j == 8) {
                                    put("rc", transactionMPList.get(finalI).getRc());
                                }
                            }
                        }
                    });
                }
            }
        });
        map.put("status", "200(Ok)");
        map.put("message","Succses");

        return map;

    }

}
