package com.belajar.crudwithjwt.controller.bersamaku;

import com.belajar.crudwithjwt.repository.bersamaku.InquiryRepository;
import com.belajar.crudwithjwt.utils.Utils;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

@RestController
public class InquiryController {

    final
    private InquiryRepository inquiryRepository;

    Utils utils = new Utils();

    public InquiryController(InquiryRepository inquiryRepository) {
        this.inquiryRepository = inquiryRepository;
    }

    @PostMapping("/bersamaku/bku/v1/outboundAcc/inquiry")
    public String inquiry(@RequestParam Map<String, String> body) throws Exception{
        String transactionId = body.get("transaction_ID");
        String transactionInfo = body.get("transaction_Info");

        String signature = body.get("signature");

        String outputJson = "";
        Map<String, Object> map = new HashMap<>();

        try {
            String url = "http://tisande.diginova.id:81/api/bku/v1/outboundAcc/inquiry";
            URL obj = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");

            outputJson = Utils.convertStreamToString(conn.getInputStream());
            System.out.println(outputJson);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return outputJson;
    }

}
