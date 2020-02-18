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
public class FundCollectionController {

    //Autowired
    //Repository

    //constructor untuk controller
    @PostMapping("bca/fundcollection/addfundcollection")
    public String addfundcollection(@RequestParam Map<String, String> body) {
        String TransactionID = body.get("TransactionID");
        String ReferenceNumber = body.get("ReferenceNumber");
        String RequestType = body.get("RequestType");
        String DebitedAccount = body.get("DebitedAccount");
        String Amount = body.get("Amount");
        String Currency = body.get("Currency");
        String CreditedAccount = body.get("CreditedAccount");
        String EffectiveDate = body.get("EffectiveDate");
        String TransactionDate = body.get("TransactionDate");
        String Remark1 = body.get("Remark1");
        String Remark2 = body.get("Remark2");
        String Email = body.get("Email");

        String access_token = body.get("AccessToken");
        String ChannelID = body.get("ChannelID");
        String CredentialID = body.get("CredentialID");

        String outputJson = "";
        String apiKey = "43c21b7d-dc04-4120-8f2f-647c1f9a980b";
        String timeStamp = "timestamp";
        String signature = "bca signature";

        try {
            String url = "https://sandbox.bca.co.id/fund-collection";

            URL obj = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
            conn.setRequestProperty("Authorization", "Bearer "+access_token);
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("Origin", "contohdomain.com");
            conn.setRequestProperty("X-BCA-Key", apiKey);
            conn.setRequestProperty("X-BCA-Timestamp", timeStamp);
            conn.setRequestProperty("X-BCA-Signature", signature);
            conn.setRequestProperty("ChannelID", ChannelID);
            conn.setRequestProperty("CredentialID", CredentialID);
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");

            String data = "{" +
                    "\"TransactionID\" : \""+TransactionID+"," +
                    "\"ReferenceNumber\" : \""+ReferenceNumber+"\", " +
                    "\"RequestType\" : \""+RequestType+"\", " +
                    "\"DebitedAccount\" : \""+DebitedAccount+"\", " +
                    "\"Amount\" : \""+Amount+"\", " +
                    "\"Currency\" : \""+Currency+"\", " +
                    "\"CreditedAccount\" : \""+CreditedAccount+"\", " +
                    "\"EffectiveDate\" : \""+EffectiveDate+"\", " +
                    "\"TransactionDate\" : \""+TransactionDate+"\", " +
                    "\"Remark1\" : \""+Remark1+"\", " +
                    "\"Remark2\" : \""+Remark2+"\", " +
                    "\"Email\" : \""+Email+"\", " +
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

    @PostMapping("bca/fundcollection/addfundblock")
    public String addfundblock(@RequestParam Map<String, String> body) {
        String TransactionID = body.get("TransactionID");
        String ReferenceNumber = body.get("ReferenceNumber");
        String RequestType = body.get("RequestType");
        String DebitedAccount = body.get("DebitedAccount");
        String Amount = body.get("Amount");
        String Currency = body.get("Currency");
        String ExpiredDate = body.get("ExpiredDate");
        String TransactionDate = body.get("TransactionDate");
        String Remark1 = body.get("Remark1");
        String Remark2 = body.get("Remark2");
        String Email = body.get("Email");

        String access_token = body.get("AccessToken");
        String ChannelID = body.get("ChannelID");
        String CredentialID = body.get("CredentialID");

        String outputJson = "";
        String apiKey = "43c21b7d-dc04-4120-8f2f-647c1f9a980b";
        String timeStamp = "timestamp";
        String signature = "bca signature";

        try {
            String url = "https://sandbox.bca.co.id/fund-blocking";

            URL obj = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
            conn.setRequestProperty("Authorization", "Bearer "+access_token);
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("Origin", "contohdomain.com");
            conn.setRequestProperty("X-BCA-Key", apiKey);
            conn.setRequestProperty("X-BCA-Timestamp", timeStamp);
            conn.setRequestProperty("X-BCA-Signature", signature);
            conn.setRequestProperty("ChannelID", ChannelID);
            conn.setRequestProperty("CredentialID", CredentialID);
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");

            String data = "{" +
                    "\"TransactionID\" : \""+TransactionID+"," +
                    "\"ReferenceNumber\" : \""+ReferenceNumber+"\", " +
                    "\"RequestType\" : \""+RequestType+"\", " +
                    "\"DebitedAccount\" : \""+DebitedAccount+"\", " +
                    "\"Amount\" : \""+Amount+"\", " +
                    "\"Currency\" : \""+Currency+"\", " +
                    "\"ExpiredDate\" : \""+ExpiredDate+"\", " +
                    "\"TransactionDate\" : \""+TransactionDate+"\", " +
                    "\"Remark1\" : \""+Remark1+"\", " +
                    "\"Remark2\" : \""+Remark2+"\", " +
                    "\"Email\" : \""+Email+"\", " +
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

    @PostMapping("bca/fundcollection/updatefundblock")
    public String updatefundblock(@RequestParam Map<String, String> body) {
        String TransactionID = body.get("TransactionID");
        String ReferenceNumber = body.get("ReferenceNumber");
        String RequestType = body.get("RequestType");
        String Amount = body.get("Amount");
        String Currency = body.get("Currency");
        String ExpiredDate = body.get("ExpiredDate");
        String TransactionDate = body.get("TransactionDate");
        String Remark1 = body.get("Remark1");
        String Remark2 = body.get("Remark2");
        String Email = body.get("Email");

        String access_token = body.get("AccessToken");
        String ChannelID = body.get("ChannelID");
        String CredentialID = body.get("CredentialID");

        String outputJson = "";
        String apiKey = "43c21b7d-dc04-4120-8f2f-647c1f9a980b";
        String timeStamp = "timestamp";
        String signature = "bca signature";

        try {
            String url = "https://sandbox.bca.co.id/fund-blocking";

            URL obj = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
            conn.setRequestProperty("Authorization", "Bearer "+access_token);
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("Origin", "contohdomain.com");
            conn.setRequestProperty("X-BCA-Key", apiKey);
            conn.setRequestProperty("X-BCA-Timestamp", timeStamp);
            conn.setRequestProperty("X-BCA-Signature", signature);
            conn.setRequestProperty("ChannelID", ChannelID);
            conn.setRequestProperty("CredentialID", CredentialID);
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");

            String data = "{" +
                    "\"TransactionID\" : \""+TransactionID+"," +
                    "\"ReferenceNumber\" : \""+ReferenceNumber+"\", " +
                    "\"RequestType\" : \""+RequestType+"\", " +
                    "\"Amount\" : \""+Amount+"\", " +
                    "\"Currency\" : \""+Currency+"\", " +
                    "\"ExpiredDate\" : \""+ExpiredDate+"\", " +
                    "\"TransactionDate\" : \""+TransactionDate+"\", " +
                    "\"Remark1\" : \""+Remark1+"\", " +
                    "\"Remark2\" : \""+Remark2+"\", " +
                    "\"Email\" : \""+Email+"\", " +
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

    @PostMapping("bca/fundcollection/cancelfundblock")
    public String cancelfundblock(@RequestParam Map<String, String> body) {
        String TransactionID = body.get("TransactionID");
        String ReferenceNumber = body.get("ReferenceNumber");
        String RequestType = body.get("RequestType");
        String Amount = body.get("Amount");
        String Currency = body.get("Currency");
        String ExpiredDate = body.get("ExpiredDate");
        String TransactionDate = body.get("TransactionDate");
        String Remark1 = body.get("Remark1");
        String Remark2 = body.get("Remark2");
        String Email = body.get("Email");

        String access_token = body.get("AccessToken");
        String ChannelID = body.get("ChannelID");
        String CredentialID = body.get("CredentialID");

        String outputJson = "";
        String apiKey = "43c21b7d-dc04-4120-8f2f-647c1f9a980b";
        String timeStamp = "timestamp";
        String signature = "bca signature";

        try {
            String url = "https://sandbox.bca.co.id/fund-blocking";

            URL obj = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
            conn.setRequestProperty("Authorization", "Bearer "+access_token);
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("Origin", "contohdomain.com");
            conn.setRequestProperty("X-BCA-Key", apiKey);
            conn.setRequestProperty("X-BCA-Timestamp", timeStamp);
            conn.setRequestProperty("X-BCA-Signature", signature);
            conn.setRequestProperty("ChannelID", ChannelID);
            conn.setRequestProperty("CredentialID", CredentialID);
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");

            String data = "{" +
                    "\"TransactionID\" : \""+TransactionID+"," +
                    "\"ReferenceNumber\" : \""+ReferenceNumber+"\", " +
                    "\"RequestType\" : \""+RequestType+"\", " +
                    "\"Amount\" : \""+Amount+"\", " +
                    "\"Currency\" : \""+Currency+"\", " +
                    "\"ExpiredDate\" : \""+ExpiredDate+"\", " +
                    "\"TransactionDate\" : \""+TransactionDate+"\", " +
                    "\"Remark1\" : \""+Remark1+"\", " +
                    "\"Remark2\" : \""+Remark2+"\", " +
                    "\"Email\" : \""+Email+"\", " +
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

    @PostMapping("bca/fundcollection/inquiryblockstatus")
    public String inquiryblockstatus(@RequestParam Map<String, String> body) {
        String TransactionID = body.get("TransactionID");
        String ReferenceNumber = body.get("ReferenceNumber");
        String RequestType = body.get("RequestType");


        String access_token = body.get("AccessToken");
        String ChannelID = body.get("ChannelID");
        String CredentialID = body.get("CredentialID");

        String outputJson = "";
        String apiKey = "43c21b7d-dc04-4120-8f2f-647c1f9a980b";
        String timeStamp = "timestamp";
        String signature = "bca signature";

        try {
            String url = "https://sandbox.bca.co.id/fund-blocking?SearchBy=TransactionID&Value=0000000001";

            URL obj = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
            conn.setRequestProperty("Authorization", "Bearer "+access_token);
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("Origin", "contohdomain.com");
            conn.setRequestProperty("X-BCA-Key", apiKey);
            conn.setRequestProperty("X-BCA-Timestamp", timeStamp);
            conn.setRequestProperty("X-BCA-Signature", signature);
            conn.setRequestProperty("ChannelID", ChannelID);
            conn.setRequestProperty("CredentialID", CredentialID);
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");

            String data = "{" +
                    "\"TransactionID\" : \""+TransactionID+"," +
                    "\"ReferenceNumber\" : \""+ReferenceNumber+"\", " +
                    "\"RequestType\" : \""+RequestType+"\" " +
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
