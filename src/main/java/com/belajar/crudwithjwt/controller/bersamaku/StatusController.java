package com.belajar.crudwithjwt.controller.bersamaku;

import com.belajar.crudwithjwt.repository.bersamaku.StatusRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StatusController {

    final
    private StatusRepository statusRepository;

    public StatusController(StatusRepository statusRepository) {
        this.statusRepository = statusRepository;
    }

    @PostMapping("/bku/v1/outboundAcc/status")
    public Map<String, Object> status(@RequestParam Map<String, String> body) {
        String transactionId = body.get("transaction_ID");
        String query = body.get("query");
        String signature = body.get("signature");

        Map<String, Object> map = new HashMap<>();

        map.put("transaction_ID", new HashMap<String, String>() {
            {
                put("stan", "123456");
                put("inst_ID","000001");
                put("trans_Date_Time","20190817T21:42:31+07:00");
            }
        });
        map.put("TransactionInfo", new HashMap<String, Object>(){
            {
                put("transaction_ID", new HashMap<String, Object>(){
                    {
                        put("stan","123456");
                        put("inst_ID","000001");
                        put("trans_Date_Time","20190817T21:42:31+07:00");
                    }
                });
            }
        });
        map.put("ref", new HashMap<String, String>(){
            {
                put("code","09161520560027C2299");
                put("finish_estimation","20190819");
            }
        });
        map.put("fee", new HashMap<String, String>(){
            {
                put("amount","500");
                put("currency","IDR");
            }
        });
        map.put("mode","source_amount");
        map.put("source", new HashMap<String, String>(){
            {
                put("amount","1000000");
                put("currency","IDR");
                put("country_Code","THA");
            }
        });
        map.put("rate","0.5123");
        map.put("Response", new HashMap<String,String>(){
            {
                put("code","00");
                put("description","Success");
            }
        });
        map.put("transaction_state","Submitted");
        map.put("timestamp_response","20190817T21:42:32.000+07:00");
        map.put("Signature","123 ASDZXC");


        return map;
    }

}
