package com.belajar.crudwithjwt.controller.bca;

import com.belajar.crudwithjwt.utils.Utils;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

import static com.belajar.crudwithjwt.utils.Utils.convertStreamToString;

@RestController
public class BusinessBankingController {

    //Autowired
    //Repository

    //constructor untuk controller

    @PostMapping("/bca/businessbanking/balanceinformation")
    public String balanceInfo(@RequestParam Map<String, String> body) {
        String corporateID = body.get("corporateID");
        String accountNumber = body.get("accountNumber");
        String access_token = body.get("access_token");

        String outputJson = "";
        String apiKey = "43c21b7d-dc04-4120-8f2f-647c1f9a980b";
        String timeStamp = "timestamp";
        String signature = "bca signature";

        try {
            String url = "https://sandbox.bca.co.id:443/banking/v3/corporates/"+corporateID+"/accounts/"+accountNumber;

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

    @PostMapping("bca/businessbanking/accountstatement")
    public String accountstatement(@RequestParam Map<String, String> body) {
        String corporateID = body.get("CorporateID");
        String accountNumber = body.get("AccountNumber");
        String access_token = body.get("access_token");
        String startDate = body.get("start_date");
        String endDate = body.get("end_date");

        String outputJson = "";
        String apiKey = "43c21b7d-dc04-4120-8f2f-647c1f9a980b";
        String timeStamp = "timestamp";
        String signature = "bca signature";

        try {
            String url = "https://sandbox.bca.co.id:443/banking/v3/corporates/"+corporateID+"/accounts/"+accountNumber+"/statements?StartDate="+startDate+"&EndDate="+endDate;

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

    @PostMapping("bca/businessbanking/fundtransfer")
    public String fundtransfer(@RequestParam Map<String, String> body) {
        String corporateID = body.get("CorporateID");
        String SourceAccountNumber = body.get("SourceAccountNumber");
        String TransactionID = body.get("TransactionID");
        String TransactionDate = body.get("TransactionDate");
        String ReferenceID = body.get("ReferenceID");
        String CurrencyCode = body.get("CurrencyCode");
        String Amount = body.get("Amount");
        String BeneficiaryAccountNumber = body.get("BeneficiaryAccountNumber");
        String Remark1 = body.get("Remark1");
        String Remark2 = body.get("Remark2");
        String access_token = body.get("AccessToken");

        String outputJson = "";
        String apiKey = "43c21b7d-dc04-4120-8f2f-647c1f9a980b";
        String timeStamp = "timestamp";
        String signature = "bca signature";

        try {
            String url = "https://sandbox.bca.co.id/banking/corporates/transfers";

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

            String data = "{" +
                    "\"CorporateID\" : \""+corporateID+"," +
                    "\"SourceAccountNumber\" : \""+SourceAccountNumber+"\", +" +
                    "\"TransactionID\" : \""+TransactionID+"\", +" +
                    "\"TransactionDate\" : \""+TransactionDate+"\", +" +
                    "\"ReferenceID\" : \""+ReferenceID+"\", +" +
                    "\"CurrencyCode\" : \""+CurrencyCode+"\", +" +
                    "\"Amount\" : \""+Amount+"\", +" +
                    "\"BeneficiaryAccountNumber\" : \""+BeneficiaryAccountNumber+"\", +" +
                    "\"Remark1\" : \""+Remark1+"\", +" +
                    "\"Remark2\" : \""+Remark2+"\", +" +
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

    @PostMapping("bca/businessbanking/domesticfundtransfer")
    public String domesticfundtransfer(@RequestParam Map<String, String> body) {
        String TransactionID = body.get("TransactionID");
        String TransactionDate = body.get("TransactionDate");
        String ReferenceID = body.get("ReferenceID");
        String SourceAccountNumber = body.get("SourceAccountNumber");
        String BeneficiaryAccountNumber = body.get("BeneficiaryAccountNumber");
        String BeneficiaryBankCode = body.get("BeneficiaryBankCode");
        String BeneficiaryName = body.get("BeneficiaryName");
        String Amount = body.get("Amount");
        String TransferType = body.get("TransferType");
        String BeneficiaryCustType = body.get("BeneficiaryCustType");
        String BeneficiaryCustResidence = body.get("BeneficiaryCustResidence");
        String CurrencyCode = body.get("CurrencyCode");
        String Remark1 = body.get("Remark1");
        String Remark2 = body.get("Remark2");

        String access_token = body.get("AccessToken");
        String ChannelID = body.get("ChannelID");
        String CredentialID = body.get("CredentialID");

        String outputJson = "";
        String apiKey = "43c21b7d-dc04-4120-8f2f-647c1f9a980b";
        String timeStamp = "timestamp";
        String signature = "bca signature";

        try {
            String url = "https://sandbox.bca.co.id/banking/corporates/transfers";

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
            conn.setRequestMethod("GET");

            String data = "{" +
                    "\"TransactionID\" : \""+TransactionID+"," +
                    "\"TransactionDate\" : \""+SourceAccountNumber+"\", +" +
                    "\"ReferenceID\" : \""+TransactionID+"\", +" +
                    "\"SourceAccountNumber\" : \""+TransactionDate+"\", +" +
                    "\"BeneficiaryAccountNumber\" : \""+ReferenceID+"\", +" +
                    "\"BeneficiaryBankCode\" : \""+CurrencyCode+"\", +" +
                    "\"BeneficiaryBankName\" : \""+Amount+"\", +" +
                    "\"Amount\" : \""+BeneficiaryAccountNumber+"\", +" +
                    "\"TransferType\" : \""+BeneficiaryAccountNumber+"\", +" +
                    "\"BeneficiaryCustType\" : \""+BeneficiaryAccountNumber+"\", +" +
                    "\"BeneficiaryCustResidence\" : \""+BeneficiaryAccountNumber+"\", +" +
                    "\"CurrencyCode\" : \""+BeneficiaryAccountNumber+"\", +" +
                    "\"Remark1\" : \""+Remark1+"\", +" +
                    "\"Remark2\" : \""+Remark2+"\", +" +
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

    @PostMapping("/bca/businessbanking/accountstatementoffline")
    public String accountstatementoffline(@RequestParam Map<String, String> body) {
        String accountNumber = body.get("accountNumber");
        String StartDate = body.get("start_date");
        String EndDate = body.get("end_date");

        String access_token = body.get("access_token");

        String outputJson = "";
        String apiKey = "43c21b7d-dc04-4120-8f2f-647c1f9a980b";
        String timeStamp = "timestamp";
        String signature = "bca signature";

        try {
            String url = "https://sandbox.bca.co.id/banking/offline/corporates/accounts/"+accountNumber+"/filestatements?StartDate="+StartDate+"&EndDate="+EndDate;

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

    @PostMapping("/bca/businessbanking/inquirytransferstatus")
    public String inquirytransferstatus(@RequestParam Map<String, String> body) {
        String TransactionNumber = body.get("TransactionNumber");
        String TransactionDate = body.get("TransactionDate");

        String access_token = body.get("access_token");

        String outputJson = "";
        String apiKey = "43c21b7d-dc04-4120-8f2f-647c1f9a980b";
        String timeStamp = "timestamp";
        String signature = "bca signature";

        try {
            String url = "/banking/corporates/transfers/status/"+TransactionNumber+"?TransactionDate="+TransactionDate+"&TransferType=BCA";

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
