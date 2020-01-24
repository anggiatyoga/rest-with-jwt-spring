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

        map.put("transaction_ID", transactionId);
        map.put("TransactionInfo", "TransactionInfo");
        map.put("ref", "ref");
        map.put("fee", "fee");
        map.put("mode", "source_amount");
        map.put("source", "source");
        map.put("destination", "destination");
        map.put("rate", "0.5123");
        map.put("response","Response");
        map.put("transaction_state", "submitted");
        map.put("timestamp_response", "0190817T21:42:32.000+07:00");
        map.put("signature", "23 ASDZXC");


        return map;
    }

}
