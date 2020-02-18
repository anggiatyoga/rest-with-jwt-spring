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
public class FinancingController {

    //Autowired
    //Repository

    //constructor untuk controller
    @PostMapping("/bca/financing/addinvoice")
    public String addinvoice(@RequestParam Map<String, String> body) {
        String TransactionID = body.get("TransactionID");
        String TransactionDate = body.get("TransactionDate");
        String ReferenceID = body.get("ReferenceID");
        String DistributorCode = body.get("DistributorCode");
        String Amount = body.get("Amount");
        String CurrencyCode = body.get("CurrencyCode");
        String PrincipalCode = body.get("PrincipalCode");
        String DisburseDate = body.get("DisburseDate");

        String access_token = body.get("AccessToken");

        String outputJson = "";
        String apiKey = "43c21b7d-dc04-4120-8f2f-647c1f9a980b";
        String timeStamp = "timestamp";
        String signature = "bca signature";
        String credentialID = "dummy credential";
        String ChannelID = "dummy ChannelID";

        try {
            String url = "https://sandbox.bca.co.id/df/invoice";

            URL obj = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
            conn.setRequestProperty("Authorization", "Bearer "+access_token);
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("Origin", "contohdomain.com");
            conn.setRequestProperty("X-BCA-Key", apiKey);
            conn.setRequestProperty("X-BCA-Timestamp", timeStamp);
            conn.setRequestProperty("X-BCA-Signature", signature);
            conn.setRequestProperty("ChannelID", ChannelID);
            conn.setRequestProperty("CredentialID", credentialID);

            conn.setDoOutput(true);
            conn.setRequestMethod("POST");

            String data = "{" +
                    "\"TransactionID\" : \""+TransactionID+"," +
                    "\"TransactionDate\" : \""+TransactionDate+"\", " +
                    "\"ReferenceID\" : \""+ReferenceID+"\", " +
                    "\"DistributorCode\" : \""+DistributorCode+"\", " +
                    "\"Amount\" : \""+Amount+"\", +" +
                    "\"CurrencyCode\" : \""+CurrencyCode+"\", " +
                    "\"PrincipalCode\" : \""+PrincipalCode+"\", " +
                    "\"DisburseDate\" : \""+DisburseDate+"\" " +
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

    @PostMapping("/bca/financing/cancelinvoice")
    public String cancelinvoice(@RequestParam Map<String, String> body) {
        String TransactionID = body.get("TransactionID");
        String TransactionDate = body.get("TransactionDate");
        String ReferenceID = body.get("ReferenceID");
        String DistributorCode = body.get("DistributorCode");
        String Amount = body.get("Amount");
        String CurrencyCode = body.get("CurrencyCode");
        String PrincipalCode = body.get("PrincipalCode");
        String DisburseDate = body.get("DisburseDate");

        String access_token = body.get("AccessToken");

        String outputJson = "";
        String apiKey = "43c21b7d-dc04-4120-8f2f-647c1f9a980b";
        String timeStamp = "timestamp";
        String signature = "bca signature";
        String credentialID = "dummy credential";
        String ChannelID = "dummy ChannelID";

        try {
            String url = "https://sandbox.bca.co.id/df/invoice";

            URL obj = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
            conn.setRequestProperty("Authorization", "Bearer "+access_token);
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("Origin", "contohdomain.com");
            conn.setRequestProperty("X-BCA-Key", apiKey);
            conn.setRequestProperty("X-BCA-Timestamp", timeStamp);
            conn.setRequestProperty("X-BCA-Signature", signature);
            conn.setRequestProperty("ChannelID", ChannelID);
            conn.setRequestProperty("CredentialID", credentialID);

            conn.setDoOutput(true);
            conn.setRequestMethod("PUT");

            String data = "{" +
                    "\"TransactionID\" : \""+TransactionID+"," +
                    "\"TransactionDate\" : \""+TransactionDate+"\", " +
                    "\"ReferenceID\" : \""+ReferenceID+"\", " +
                    "\"DistributorCode\" : \""+DistributorCode+"\", " +
                    "\"Amount\" : \""+Amount+"\", +" +
                    "\"CurrencyCode\" : \""+CurrencyCode+"\", " +
                    "\"PrincipalCode\" : \""+PrincipalCode+"\", " +
                    "\"DisburseDate\" : \""+DisburseDate+"\" " +
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

    @PostMapping("/bca/financing/disbursementnotification")
    public String disbursementnotification(@RequestParam Map<String, String> body) {
        String TransactionID = body.get("TransactionID");
        String TransactionDate = body.get("TransactionDate");
        String ReferenceID = body.get("ReferenceID");
        String PrincipalCode = body.get("PrincipalCode");
        String SubPrincipalCode = body.get("SubPrincipalCode");
        String DistributorCode = body.get("DistributorCode");
        String Amount = body.get("Amount");
        String CurrencyCode = body.get("CurrencyCode");



        String outputJson = "";
        String XPassSiganture = "b9125ab10816f6929d214c96ffca77dfd5a1ea13856362b85eeaeb70155";//dummy

        try {
            String url = "https://www.copartners.com/bca-df/disbursement/notification";

            URL obj = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("X-Pass-Signature", XPassSiganture);
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");

            String data = "{" +
                    "\"TransactionID\" : \""+TransactionID+"," +
                    "\"TransactionDate\" : \""+TransactionDate+"\", " +
                    "\"ReferenceID\" : \""+ReferenceID+"\", " +
                    "\"PrincipalCode\" : \""+PrincipalCode+"\", " +
                    "\"SubPrincipalCode\" : \""+SubPrincipalCode+"\", " +
                    "\"DistributorCode\" : \""+DistributorCode+"\", " +
                    "\"Amount\" : \""+Amount+"\", " +
                    "\"CurrencyCode\" : \""+CurrencyCode+"\" " +
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

    @PostMapping("/bca/financing/transactionlimitupdatenotification")
    public String transactionlimitupdatenotification(@RequestParam Map<String, String> body) {
        String TransactionID = body.get("TransactionID");
        String PrincipalCode = body.get("PrincipalCode");
        String DistributorCode = body.get("DistributorCode");
        String Amount = body.get("Amount");
        String TransactionDate = body.get("TransactionDate");



        String outputJson = "";
        String XPassSiganture = "b9125ab10816f6929d214c96ffca77dfd5a1ea13856362b85eeaeb70155";//dummy

        try {
            String url = "https://www.copartners.com/bca-df/disbursement/notification";

            URL obj = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("X-Pass-Signature", XPassSiganture);
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");

            String data = "{" +
                    "\"TransactionID\" : \""+TransactionID+"," +
                    "\"PrincipalCode\" : \""+PrincipalCode+"\", " +
                    "\"DistributorCode\" : \""+DistributorCode+"\", " +
                    "\"Amount\" : \""+Amount+"\", " +
                    "\"TransactionDate\" : \""+TransactionDate+"\" " +
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

    @PostMapping("/bca/financing/stopsupplynotification")
    public String stopsupplynotification(@RequestParam Map<String, String> body) {
        String TransactionID = body.get("TransactionID");
        String DistributorCode = body.get("DistributorCode");
        String PrincipalCode = body.get("PrincipalCode");
        String TransactionDate = body.get("TransactionDate");
        String StopSupplyFlag = body.get("StopSupplyFlag");

        String outputJson = "";
        String XPassSiganture = "b9125ab10816f6929d214c96ffca77dfd5a1ea13856362b85eeaeb70155";//dummy

        try {
            String url = "https://www.copartners.com/bca-df/stop-supply/notification";

            URL obj = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("X-Pass-Signature", XPassSiganture);
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");

            String data = "{" +
                    "\"TransactionID\" : \""+TransactionID+"," +
                    "\"DistributorCode\" : \""+DistributorCode+"\", " +
                    "\"PrincipalCode\" : \""+PrincipalCode+"\", " +
                    "\"TransactionDate\" : \""+TransactionDate+"\" " +
                    "\"StopSupplyFlag\" : \""+StopSupplyFlag+"\", " +
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

}
