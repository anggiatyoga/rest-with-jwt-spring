package com.belajar.crudwithjwt.controller.bersamaku;

import com.belajar.crudwithjwt.repository.bersamaku.InquiryRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class InquiryController {

    final
    private InquiryRepository inquiryRepository;

    public InquiryController(InquiryRepository inquiryRepository) {
        this.inquiryRepository = inquiryRepository;
    }

    @PostMapping("/bku/v1/outboundAcc/inquiry")
    public Map<String, Object> inquiry(@RequestParam Map<String, String> body){
        String transactionId = body.get("transaction_ID");
        String transactionInfo = body.get("transaction_Info");
        String destination = body.get("destination");
        String signature = body.get("siganture");

        Map<String, Object> map = new HashMap<>();

        map.put("transaction_ID", transactionId);
        map.put("transaction_Info", transactionInfo);
        map.put("destination", destination);
        map.put("signature", signature);

        return map;

    }

}
