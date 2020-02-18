package com.belajar.crudwithjwt.controller.bca;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

import static com.belajar.crudwithjwt.utils.Utils.convertStreamToString;

@RestController
public class VirtualAccountController {

    //Autowired
    //Repository

    //constructor untuk controller

    @PostMapping("/bca/virtualaccount/inquirystatuspayment")
    public String inquirystatuspayment(@RequestParam Map<String, String> body) {
        String requestId = body.get("request_id");
        String customerNumber = body.get("customer_number");
        String access_token = body.get("access_token");

        String outputJson = "";
        String apiKey = "43c21b7d-dc04-4120-8f2f-647c1f9a980b";
        String timeStamp = "timestamp";
        String signature = "bca signature";

        String getUrl = "";

        if (!requestId.isEmpty() && customerNumber.isEmpty()) {
            getUrl = "https://sandbox.bca.co.id/va/payments?CompanyCode=10111&RequestID="+requestId;
        } else if (!customerNumber.isEmpty() && requestId.isEmpty()) {
            getUrl = "https://sandbox.bca.co.id/va/payments?CompanyCode=10111&CustomerNumber="+customerNumber;
        } else {
            outputJson = "{" +
                    "\"status\" : \"400\"," +
                    "\"message\" : \"pilih salah satu\"}";
        }

        try {
            String url = getUrl;

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
