package com.belajar.crudwithjwt.controller.briva;

import com.belajar.crudwithjwt.utils.Utils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

@RestController
public class UpdateController {

    //Autowired
    //Repository

    //constructor untuk controller
    Utils utils = new Utils();

    @PostMapping("/briva/update")
    public String updateStatus(@RequestParam Map<String, String> body) {
        String institutionCode = body.get("institutionCode");
        String brivaNo = body.get("brivaNo");
        String custCode = body.get("custCode");
        String nama = body.get("nama");
        String amount = body.get("amount");
        String keterangan = body.get("keterangan");
        String expiredDate = body.get("expiredDate");

        String tokenInput = body.get("token");
        String briSiganture = "";
        String timeStamp = "";

        String outputJson = "";

        try {
            String url = "https://sandbox.partner.api.bri.co.id/v1/briva";

            URL obj = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
            conn.setRequestProperty("Authorization", "Bearer "+tokenInput);
            conn.setRequestProperty("BRI-Signature", briSiganture);
            conn.setRequestProperty("BRI-Timestamp", timeStamp);
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);
            conn.setRequestMethod("PUT");
            conn.setRequestProperty("Accept","application/json");

            String data = "{\n" +
                    "    \"institutionCode\": \"" +institutionCode+ "\",\n" +
                    "    \"brivaNo\": \""+brivaNo+"\",\n" +
                    "    \"custCode\": \""+custCode+"\",\n" +
                    "    \"nama\": \""+nama+"\",\n" +
                    "    \"amount\": \""+amount+"\",\n" +
                    "    \"keterangan\": \""+keterangan+"\",\n" +
                    "    \"expiredDate\": \""+expiredDate+"\"\n" +
                    "}";

            OutputStreamWriter out = new OutputStreamWriter(conn.getOutputStream());
            out.write(data);

            out.close();
            outputJson = utils.convertStreamToString(conn.getInputStream());

        } catch (Exception e){
            e.printStackTrace();
        }
        return outputJson;
    }


}
