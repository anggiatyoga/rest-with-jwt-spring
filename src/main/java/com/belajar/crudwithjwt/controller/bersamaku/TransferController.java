package com.belajar.crudwithjwt.controller.bersamaku;

import com.belajar.crudwithjwt.model.bersamaku.Transfer;
import com.belajar.crudwithjwt.repository.bersamaku.TransferRepository;
import com.belajar.crudwithjwt.utils.Utils;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
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
            System.out.println(outputJson);

            try {

                final JSONObject jsonObject = new JSONObject(outputJson);
                final JSONObject jsonArray_tr_ID = jsonObject.getJSONObject("transaction_ID");

                String stan = jsonArray_tr_ID.getString("stan");
                String inst_ID = jsonArray_tr_ID.getString("inst_ID");
                String trans_Date_Time = jsonArray_tr_ID.getString("trans_Date_Time");
                String ref_code = jsonObject.getJSONObject("ref").getString("code");
                final JSONObject jsonArray_source = jsonObject.getJSONObject("source");
                String source_amount = jsonArray_source.getString("amount");
                String source_currency = jsonArray_source.getString("currency");
                String source_country_code = jsonArray_source.getString("country_Code");

                final JSONObject jsonArray_destination = jsonObject.getJSONObject("destination");
                String destination_amount = jsonArray_destination.getString("amount");
                String destination_currency = jsonArray_destination.getString("currency");
                String destination_country_code = jsonArray_destination.getString("country_Code");

                String timestamp_response = jsonObject.getString("timestamp_response");
                String siganture = jsonObject.getString("Signature");

                transferRepository.save(new Transfer(stan, inst_ID, trans_Date_Time, ref_code, source_amount,
                        source_currency, source_country_code, destination_amount, destination_currency,
                        destination_country_code, timestamp_response, siganture));

            } catch (JSONException e) {
                e.printStackTrace();
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

        return outputJson;
    }

}
