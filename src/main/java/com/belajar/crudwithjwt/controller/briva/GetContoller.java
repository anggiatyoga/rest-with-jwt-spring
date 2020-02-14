package com.belajar.crudwithjwt.controller.briva;

import com.belajar.crudwithjwt.utils.Utils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

import static com.belajar.crudwithjwt.utils.Utils.convertStreamToString;

@RestController
public class GetContoller {

    //Autowired
    //Repository

    //constructor untuk controller


    @PostMapping("/briva/get")
    public String get(@RequestParam Map<String, String> body) {
        String institutionCode = body.get("institutionCode");
        String brivaNo = body.get("brivaNo");
        String custCode = body.get("custCode");

        String tokenInput = body.get("token");
        String briSiganture = "";
        String timeStamp = "";

        String outputJson = "";

        try {

            String url = "https://sandbox.partner.api.bri.co.id/v1/briva/"+institutionCode+"/"+brivaNo+"/"+custCode;

            URL obj = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
            conn.setRequestProperty("Authorization", "Bearer "+tokenInput);
            conn.setRequestProperty("BRI-Signature", briSiganture);
            conn.setRequestProperty("BRI-Timestamp", timeStamp);
            conn.setDoOutput(true);
            conn.setRequestMethod("GET");

            outputJson = convertStreamToString(conn.getInputStream());

        } catch (Exception e){
            e.printStackTrace();
        }

        return outputJson;
    }

}
