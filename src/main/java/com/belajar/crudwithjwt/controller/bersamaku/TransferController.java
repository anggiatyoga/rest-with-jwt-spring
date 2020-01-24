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

        map.put("transaction_ID", transactionId);
        map.put("ref", "ref");
        map.put("fee", "fee");
        map.put("mode", "source_amount");
        map.put("source", "source");
        map.put("destination", "destination");
        map.put("rate", "0.5123");
        map.put("response","Response");
        map.put("timestamp_response", "0190817T21:42:32.000+07:00");
        map.put("signature", "23 ASDZXC");


        return map;
    }

}
