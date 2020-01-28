package com.belajar.crudwithjwt.controller.bersamaku;

import com.belajar.crudwithjwt.repository.bersamaku.TransferRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TransferController {

    final
    private TransferRepository transferRepository;

    public TransferController(TransferRepository transferRepository) {
        this.transferRepository = transferRepository;
    }

    @PostMapping("/bku/v1/outboundAcc/transfer/{refTrx}")
    public Map<String, Object> transfer(@RequestParam Map<String, String> body) {
        String transactionId = body.get("transaction_ID");
        String referenceNumber = body.get("reference_number");
        String extId = body.get("ext_id");
        String beneficiaryRelationship = body.get("beneficiary_Relationship");
        String senderAccountNumber = body.get("sender_Account_Number");
        String beneficiaryAccountNumber = body.get("beneficiary_Account_Number");
        String beneficiaryAdditionalCode = body.get("beneficiary_additional_code");
        String localDateTime = body.get("local_Date_Time");
        String dest_Code = body.get("destCode");
        String sourceAmount = body.get("source_amount");
        String destAmount = body.get("dest_Amount");
        String rate = body.get("rate");
        String sender = body.get("Sender");
        String beneficiary = body.get("Beneficiary");
        String Signature = body.get("Signature");

        Map<String, Object> map = new HashMap<>();

        map.put("transaction_ID", new HashMap<String, String>() {
            {
                put("stan", "123456");
                put("inst_ID","000001");
                put("trans_Date_Time","20190817T21:42:31+07:00");
            }
        });
        map.put("ref", new HashMap<String, String>(){
            {
                put("code","091614503800265A437");
                put("finish_Estimation","20190819");
            }
        });
        map.put("fee", new HashMap<String, String>(){
            {
                put("amount","500");
                put("currency","IDR");
            }
        });
        map.put("mode", "source_amount");
        map.put("source", new HashMap<String, String>(){
            {
                put("amount","1000000");
                put("currency","IDR");
                put("country_Code","IDN");
            }
        });
        map.put("destination", new HashMap<String, String>(){
            {
                put("amount","512300");
                put("currency","THB");
                put("country_Code","THA");
            }
        });
        map.put("rate", "0.5123");
        map.put("Response", new HashMap<String, String>(){
            {
                put("code","00");
                put("description", "Success");
            }
        });
        map.put("timestamp_response", "20190817T21:42:32.000+07:00");
        map.put("Signature", "123asdzxc");


        return map;
    }

}
