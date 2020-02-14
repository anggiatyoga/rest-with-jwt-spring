package com.belajar.crudwithjwt.controller.bersamaku;

import com.belajar.crudwithjwt.repository.bersamaku.TransferRepository;
import com.belajar.crudwithjwt.utils.Utils;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

@RestController
public class TransferController {

    final
    private TransferRepository transferRepository;

    Utils utils = new Utils();

    public TransferController(TransferRepository transferRepository) {
        this.transferRepository = transferRepository;
    }

    @PostMapping("bersamaku/bku/v1/outboundAcc/transfer")
    public String transfer(@RequestParam Map<String, String> body) {

        String refTrx = body.get("refTrx");
        String transactionId = body.get("transaction_ID");

        String referenceNumber = body.get("reference_number");
        String extId = body.get("ext_id");
        String beneficiaryRelationship = body.get("beneficiary_Relationship");
        String senderAccountNumber = body.get("sender_Account_Number");
        String beneficiaryAccountNumber = body.get("beneficiary_Account_Number");
        String beneficiaryAdditionalCode = body.get("beneficiary_additional_code");
        String localDateTime = body.get("local_Date_Time");
        String destCode = body.get("dest_Code");
        String sourceAmount = body.get("source_amount");
        String destAmount = body.get("dest_Amount");
        String rate = body.get("rate");

        String sender = body.get("Sender");

        String beneficiary = body.get("Beneficiary");


        String Signature = body.get("Signature");

        String outputJson = "";

        System.out.println(refTrx+"\n"+transactionId+"\n"+referenceNumber+"\n"+extId+"\n"
                +beneficiaryRelationship+"\n"+senderAccountNumber+"\n"
                +beneficiaryAccountNumber+"\n"+beneficiaryAdditionalCode+"\n"
                +localDateTime+"\n"+destCode+"\n"+sourceAmount+"\n"+destAmount+"\n"
                +rate+"\n"+sender+"\n"+beneficiary+"\n"+Signature+"\n");

        Map<String, Object> map = new HashMap<>();

        try {
            String url = "http://tisande.diginova.id:81/api/bku/v1/outboundAcc/transfer/"+refTrx+"";
            URL obj = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");


            outputJson = Utils.convertStreamToString(conn.getInputStream());
            System.out.println("RefTrx : "+refTrx);
            System.out.println(outputJson);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return outputJson;
    }

}
