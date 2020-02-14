package com.belajar.crudwithjwt.controller.bersamaku;

import com.belajar.crudwithjwt.repository.bersamaku.GetTokenRepository;
import com.belajar.crudwithjwt.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.*;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;

@RestController
public class GetTokenController {

    final
    private GetTokenRepository getTokenRepository;

    Utils utils = new Utils();

    public GetTokenController(GetTokenRepository getTokenRepository) {
        this.getTokenRepository = getTokenRepository;
    }

    @PostMapping("/bersamaku/bku/v1/oauth/token")
    public String getToken(@RequestParam Map<String, String> body) throws Exception{
        String grantType = body.get("grant_type");
        String outputJson = "";
        Map<String, Object> map = new HashMap<>();

        try {

            String url = "http://tisande.diginova.id:81/api/bku/v1/oauth/token";
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
