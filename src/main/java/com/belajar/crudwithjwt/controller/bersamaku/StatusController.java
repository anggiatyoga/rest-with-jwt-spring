package com.belajar.crudwithjwt.controller.bersamaku;

import com.belajar.crudwithjwt.repository.bersamaku.StatusRepository;
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
public class StatusController {

    final
    private StatusRepository statusRepository;

    Utils utils = new Utils();

    public StatusController(StatusRepository statusRepository) {
        this.statusRepository = statusRepository;
    }

    @PostMapping("bersamaku/status")
    public String status(@RequestParam Map<String, String> body) {
        String transactionId = body.get("transaction_ID");
        String query = body.get("query");

        String signature = body.get("signature");

        String outputJson = "";
        Map<String, Object> map = new HashMap<>();

        try {
            String url = "http://tisande.diginova.id:81/api/bku/v1/outboundAcc/status";
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
