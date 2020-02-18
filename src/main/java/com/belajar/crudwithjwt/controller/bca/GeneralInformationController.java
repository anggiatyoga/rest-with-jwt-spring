package com.belajar.crudwithjwt.controller.bca;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

import static com.belajar.crudwithjwt.utils.Utils.convertStreamToString;

@RestController
public class GeneralInformationController {

    //Autowired
    //Repository

    //constructor untuk controller

    @PostMapping("/bca/generalinformation/foreignexchangerate")
    public String balanceInfo(@RequestParam Map<String, String> body) {
        String access_token = body.get("access_token");

        String outputJson = "";
        String apiKey = "43c21b7d-dc04-4120-8f2f-647c1f9a980b";
        String timeStamp = "timestamp";
        String signature = "bca signature";

        try {
            String url = "https://sandbox.bca.co.id/general/rate/forex?CurrencyCode=USD,JPY,XXX&RateType=erate,tt,yy";

            URL obj = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
            conn.setRequestProperty("Authorization", "Bearer "+access_token);
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("Origin", "contohdomain.com");
            conn.setRequestProperty("X-BCA-Key", apiKey);
            conn.setRequestProperty("X-BCA-Timestamp", timeStamp);
            conn.setRequestProperty("X-BCA-Signature", signature);
            conn.setDoOutput(true);
            conn.setRequestMethod("GET");

            outputJson = convertStreamToString(conn.getInputStream());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return outputJson;
    }

    @PostMapping("/bca/generalinformation/nearestbranchlocation")
    public String nearestbranchlocation(@RequestParam Map<String, String> body) {
        String access_token = body.get("access_token");

        String outputJson = "";
        String apiKey = "43c21b7d-dc04-4120-8f2f-647c1f9a980b";
        String timeStamp = "timestamp";
        String signature = "bca signature";

        try {
            String url = "https://sandbox.bca.co.id/general/info-bca/branch?Latitude=-6.137235&Longitude=106.824928";

            URL obj = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
            conn.setRequestProperty("Authorization", "Bearer "+access_token);
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("Origin", "contohdomain.com");
            conn.setRequestProperty("X-BCA-Key", apiKey);
            conn.setRequestProperty("X-BCA-Timestamp", timeStamp);
            conn.setRequestProperty("X-BCA-Signature", signature);
            conn.setDoOutput(true);
            conn.setRequestMethod("GET");

            outputJson = convertStreamToString(conn.getInputStream());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return outputJson;
    }

    @PostMapping("/bca/generalinformation/nearestatmlocation")
    public String nearestatmlocation(@RequestParam Map<String, String> body) {
        String access_token = body.get("access_token");

        String outputJson = "";
        String apiKey = "43c21b7d-dc04-4120-8f2f-647c1f9a980b";
        String timeStamp = "timestamp";
        String signature = "bca signature";

        try {
            String url = "https://sandbox.bca.co.id/general/info-bca/atm?Latitude=6.1900718&Longitude=106.797190";

            URL obj = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
            conn.setRequestProperty("Authorization", "Bearer "+access_token);
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("Origin", "contohdomain.com");
            conn.setRequestProperty("X-BCA-Key", apiKey);
            conn.setRequestProperty("X-BCA-Timestamp", timeStamp);
            conn.setRequestProperty("X-BCA-Signature", signature);
            conn.setDoOutput(true);
            conn.setRequestMethod("GET");

            outputJson = convertStreamToString(conn.getInputStream());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return outputJson;
    }


}
