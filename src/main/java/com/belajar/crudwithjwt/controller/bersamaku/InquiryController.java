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

        map.put("transaction_ID", new HashMap<String, String>() {
            {
                put("stan", "123456");
                put("inst_ID","000001");
                put("trans_Date_Time","20190817T21:42:31+07:00");
            }
        });
        map.put("refTrx", new HashMap<String, String>(){
            {
                put("code","091614503800265A437");
                put("exp_Date","20190817T22:42:31+07:00");
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
        map.put("Signature", "123asdqwe");

        return map;

    }

}
