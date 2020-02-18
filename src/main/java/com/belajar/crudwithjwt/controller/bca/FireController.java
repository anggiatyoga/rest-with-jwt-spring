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
public class FireController {

    //Autowired
    //Repository

    //constructor untuk controller

    @PostMapping("/bca/fire/teletransfertoaccount")
    public String teletransfertoaccount(@RequestParam Map<String, String> body) {
        String Authentication = body.get("Authentication");//array
        String SenderDetails = body.get("SenderDetails");//array
        String BeneficiaryDetails = body.get("BeneficiaryDetails");//array
        String TransactionDetails = body.get("TransactionDetails");//array

        String access_token = body.get("access_token");

        String outputJson = "";
        String apiKey = "43c21b7d-dc04-4120-8f2f-647c1f9a980b";
        String timeStamp = "timestamp";
        String signature = "bca signature";

        try {
            String url = "https://sandbox.bca.co.id/fire/transactions/to-account";

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

//            String data = "{" +
//                    "\"CorporateID\" : \""+corporateID+"," +
//                    "\"SourceAccountNumber\" : \""+SourceAccountNumber+"\", +" +
//                    "\"TransactionID\" : \""+TransactionID+"\", +" +
//                    "\"TransactionDate\" : \""+TransactionDate+"\", +" +
//                    "\"ReferenceID\" : \""+ReferenceID+"\", +" +
//                    "\"CurrencyCode\" : \""+CurrencyCode+"\", +" +
//                    "\"Amount\" : \""+Amount+"\", +" +
//                    "\"BeneficiaryAccountNumber\" : \""+BeneficiaryAccountNumber+"\", +" +
//                    "\"Remark1\" : \""+Remark1+"\", +" +
//                    "\"Remark2\" : \""+Remark2+"\", +" +
//                    "}";
//
//            OutputStreamWriter out = new OutputStreamWriter(conn.getOutputStream());
//            out.write(data);
//
//            out.close();
            outputJson = convertStreamToString(conn.getInputStream());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return outputJson;
    }

    @PostMapping("/bca/fire/inquiryaccount")
    public String inquiryaccount(@RequestParam Map<String, String> body) {
        String Authentication = body.get("Authentication");//array
        String BeneficiaryDetails = body.get("BeneficiaryDetails");//array

        String access_token = body.get("access_token");

        String outputJson = "";
        String apiKey = "43c21b7d-dc04-4120-8f2f-647c1f9a980b";
        String timeStamp = "timestamp";
        String signature = "bca signature";

        try {
            String url = "https://sandbox.bca.co.id/fire/accounts";

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

//            String data = "{" +
//                    "\"CorporateID\" : \""+corporateID+"," +
//                    "\"SourceAccountNumber\" : \""+SourceAccountNumber+"\", +" +
//                    "\"TransactionID\" : \""+TransactionID+"\", +" +
//                    "\"TransactionDate\" : \""+TransactionDate+"\", +" +
//                    "\"ReferenceID\" : \""+ReferenceID+"\", +" +
//                    "\"CurrencyCode\" : \""+CurrencyCode+"\", +" +
//                    "\"Amount\" : \""+Amount+"\", +" +
//                    "\"BeneficiaryAccountNumber\" : \""+BeneficiaryAccountNumber+"\", +" +
//                    "\"Remark1\" : \""+Remark1+"\", +" +
//                    "\"Remark2\" : \""+Remark2+"\", +" +
//                    "}";
//
//            OutputStreamWriter out = new OutputStreamWriter(conn.getOutputStream());
//            out.write(data);
//
//            out.close();
            outputJson = convertStreamToString(conn.getInputStream());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return outputJson;
    }


    @PostMapping("/bca/fire/inquiryaccountbalance")
    public String inquiryaccountbalance(@RequestParam Map<String, String> body) {
        String Authentication = body.get("Authentication");//array
        String FIDetails = body.get("FIDetails");//array

        String access_token = body.get("access_token");

        String outputJson = "";
        String apiKey = "43c21b7d-dc04-4120-8f2f-647c1f9a980b";
        String timeStamp = "timestamp";
        String signature = "bca signature";

        try {
            String url = "https://sandbox.bca.co.id/fire/accounts/balance";

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

//            String data = "{" +
//                    "\"CorporateID\" : \""+corporateID+"," +
//                    "\"SourceAccountNumber\" : \""+SourceAccountNumber+"\", +" +
//                    "\"TransactionID\" : \""+TransactionID+"\", +" +
//                    "\"TransactionDate\" : \""+TransactionDate+"\", +" +
//                    "\"ReferenceID\" : \""+ReferenceID+"\", +" +
//                    "\"CurrencyCode\" : \""+CurrencyCode+"\", +" +
//                    "\"Amount\" : \""+Amount+"\", +" +
//                    "\"BeneficiaryAccountNumber\" : \""+BeneficiaryAccountNumber+"\", +" +
//                    "\"Remark1\" : \""+Remark1+"\", +" +
//                    "\"Remark2\" : \""+Remark2+"\", +" +
//                    "}";
//
//            OutputStreamWriter out = new OutputStreamWriter(conn.getOutputStream());
//            out.write(data);
//
//            out.close();
            outputJson = convertStreamToString(conn.getInputStream());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return outputJson;
    }

    @PostMapping("/bca/fire/inquirytransaction")
    public String inquirytransaction(@RequestParam Map<String, String> body) {
        String Authentication = body.get("Authentication");//array
        String TransactionDetails = body.get("TransactionDetails");//array

        String access_token = body.get("access_token");

        String outputJson = "";
        String apiKey = "43c21b7d-dc04-4120-8f2f-647c1f9a980b";
        String timeStamp = "timestamp";
        String signature = "bca signature";

        try {
            String url = "https://sandbox.bca.co.id/fire/transactions";

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

//            String data = "{" +
//                    "\"CorporateID\" : \""+corporateID+"," +
//                    "\"SourceAccountNumber\" : \""+SourceAccountNumber+"\", +" +
//                    "\"TransactionID\" : \""+TransactionID+"\", +" +
//                    "\"TransactionDate\" : \""+TransactionDate+"\", +" +
//                    "\"ReferenceID\" : \""+ReferenceID+"\", +" +
//                    "\"CurrencyCode\" : \""+CurrencyCode+"\", +" +
//                    "\"Amount\" : \""+Amount+"\", +" +
//                    "\"BeneficiaryAccountNumber\" : \""+BeneficiaryAccountNumber+"\", +" +
//                    "\"Remark1\" : \""+Remark1+"\", +" +
//                    "\"Remark2\" : \""+Remark2+"\", +" +
//                    "}";
//
//            OutputStreamWriter out = new OutputStreamWriter(conn.getOutputStream());
//            out.write(data);
//
//            out.close();
            outputJson = convertStreamToString(conn.getInputStream());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return outputJson;
    }

    @PostMapping("/bca/fire/teletransfercashtransfer")
    public String teletransfercashtransfer(@RequestParam Map<String, String> body) {
        String Authentication = body.get("Authentication");//array
        String SenderDetails = body.get("SenderDetails");//array
        String BeneficiaryDetails = body.get("BeneficiaryDetails");//array
        String TransactionDetails = body.get("TransactionDetails");//array

        String access_token = body.get("access_token");

        String outputJson = "";
        String apiKey = "43c21b7d-dc04-4120-8f2f-647c1f9a980b";
        String timeStamp = "timestamp";
        String signature = "bca signature";

        try {
            String url = "https://sandbox.bca.co.id/fire/transactions/cash-transfer";

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

//            String data = "{" +
//                    "\"CorporateID\" : \""+corporateID+"," +
//                    "\"SourceAccountNumber\" : \""+SourceAccountNumber+"\", +" +
//                    "\"TransactionID\" : \""+TransactionID+"\", +" +
//                    "\"TransactionDate\" : \""+TransactionDate+"\", +" +
//                    "\"ReferenceID\" : \""+ReferenceID+"\", +" +
//                    "\"CurrencyCode\" : \""+CurrencyCode+"\", +" +
//                    "\"Amount\" : \""+Amount+"\", +" +
//                    "\"BeneficiaryAccountNumber\" : \""+BeneficiaryAccountNumber+"\", +" +
//                    "\"Remark1\" : \""+Remark1+"\", +" +
//                    "\"Remark2\" : \""+Remark2+"\", +" +
//                    "}";
//
//            OutputStreamWriter out = new OutputStreamWriter(conn.getOutputStream());
//            out.write(data);
//
//            out.close();
            outputJson = convertStreamToString(conn.getInputStream());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return outputJson;
    }

    @PostMapping("/bca/fire/amendmentcashtransfer")
    public String amendmentcashtransfer(@RequestParam Map<String, String> body) {
        String Authentication = body.get("Authentication");//array
        String AmendmentDetails = body.get("SenderDetails");//array
        String BeneficiaryDetails = body.get("BeneficiaryDetails");//array
        String TransactionDetails = body.get("TransactionDetails");//array

        String access_token = body.get("access_token");

        String outputJson = "";
        String apiKey = "43c21b7d-dc04-4120-8f2f-647c1f9a980b";
        String timeStamp = "timestamp";
        String signature = "bca signature";

        try {
            String url = "https://sandbox.bca.co.id/fire/transactions/cash-transfer/amend";

            URL obj = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
            conn.setRequestProperty("Authorization", "Bearer "+access_token);
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("Origin", "contohdomain.com");
            conn.setRequestProperty("X-BCA-Key", apiKey);
            conn.setRequestProperty("X-BCA-Timestamp", timeStamp);
            conn.setRequestProperty("X-BCA-Signature", signature);
            conn.setDoOutput(true);
            conn.setRequestMethod("PUT");

//            String data = "{" +
//                    "\"CorporateID\" : \""+corporateID+"," +
//                    "\"SourceAccountNumber\" : \""+SourceAccountNumber+"\", +" +
//                    "\"TransactionID\" : \""+TransactionID+"\", +" +
//                    "\"TransactionDate\" : \""+TransactionDate+"\", +" +
//                    "\"ReferenceID\" : \""+ReferenceID+"\", +" +
//                    "\"CurrencyCode\" : \""+CurrencyCode+"\", +" +
//                    "\"Amount\" : \""+Amount+"\", +" +
//                    "\"BeneficiaryAccountNumber\" : \""+BeneficiaryAccountNumber+"\", +" +
//                    "\"Remark1\" : \""+Remark1+"\", +" +
//                    "\"Remark2\" : \""+Remark2+"\", +" +
//                    "}";
//
//            OutputStreamWriter out = new OutputStreamWriter(conn.getOutputStream());
//            out.write(data);
//
//            out.close();
            outputJson = convertStreamToString(conn.getInputStream());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return outputJson;
    }


}
