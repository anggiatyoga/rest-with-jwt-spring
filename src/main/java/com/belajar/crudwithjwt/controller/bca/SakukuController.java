package com.belajar.crudwithjwt.controller.bca;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

import static com.belajar.crudwithjwt.utils.Utils.convertStreamToString;

@RestController
public class SakukuController {

    //Autowired
    //Repository

    //constructor untuk controller

    @PostMapping("/bca/sakuku/createpayment")
    public String createpayment(@RequestParam Map<String, String> body) {
        String MerchantID = body.get("MerchantID");
        String MerchantName = body.get("MerchantName");
        String Amount = body.get("Amount");
        String Tax = body.get("Tax");
        String TransactionID = body.get("TransactionID");
        String CurrencyCode = body.get("CurrencyCode");
        String RequestDate = body.get("RequestDate");
        String ReferenceID = body.get("ReferenceID");


        String access_token = body.get("AccessToken");

        String outputJson = "";
        String apiKey = "43c21b7d-dc04-4120-8f2f-647c1f9a980b";
        String timeStamp = "timestamp";
        String signature = "bca signature";

        try {
            String url = "https://sandbox.bca.co.id/payments";

            URL obj = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
            conn.setRequestProperty("Authorization", "Bearer "+access_token);
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("Origin", "contohdomain.com");
            conn.setRequestProperty("X-BCA-Key", apiKey);
            conn.setRequestProperty("X-BCA-Timestamp", timeStamp);
            conn.setRequestProperty("X-BCA-Signature", signature);
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");

            String data = "{" +
                    "\"MerchantID\" : \""+MerchantID+"," +
                    "\"MerchantName\" : \""+MerchantName+"\", +" +
                    "\"Amount\" : \""+Amount+"\", +" +
                    "\"Tax\" : \""+Tax+"\", +" +
                    "\"TransactionID\" : \""+TransactionID+"\", +" +
                    "\"CurrencyCode\" : \""+CurrencyCode+"\", +" +
                    "\"RequestDate\" : \""+RequestDate+"\", +" +
                    "\"ReferenceID\" : \""+ReferenceID+"\", +" +
                    "}";

            OutputStreamWriter out = new OutputStreamWriter(conn.getOutputStream());
            out.write(data);

            out.close();
            outputJson = convertStreamToString(conn.getInputStream());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return outputJson;
    }

    @PostMapping("/bca/sakuku/paymentstatus")
    public String balanceInfo(@RequestParam Map<String, String> body) {
        String MerchantID = body.get("MerchantID");
        String PaymentID = body.get("PaymentID");

        String access_token = body.get("access_token");

        String outputJson = "";
        String apiKey = "43c21b7d-dc04-4120-8f2f-647c1f9a980b";
        String timeStamp = "timestamp";
        String signature = "bca signature";

        try {
            String url = "https://sandbox.bca.co.id/sakuku-commerce/payments/"+MerchantID+"/"+PaymentID;

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
