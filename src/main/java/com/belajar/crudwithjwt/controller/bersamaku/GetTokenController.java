package com.belajar.crudwithjwt.controller.bersamaku;

import com.belajar.crudwithjwt.repository.bersamaku.GetTokenRepository;
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

//    @RequestMapping(value = "/bku/v1/oauth/token", method = RequestMethod.POST)
    @PostMapping("/oauth/token")
    public Map<String, Object> getToken(@RequestParam Map<String, String> body) throws Exception{

        String grantType = body.get("grant_type");
        String outputJson = "";
        String message, status, data;

        Map<String, Object> map = new HashMap<>();

        try {

            String url = "http://tisande.diginova.id:81/api/bku/v1";
            URL obj = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");

            outputJson = convertStreamToString(conn.getInputStream());
            System.out.println(outputJson);

            message = "berhasil";
            status = "200";
            data = outputJson;

        } catch (Exception e) {
            e.printStackTrace();
            message = "gagal";
            status = "403";
            data = null;
        }

//        Map<String, Object> map = new HashMap<>();
//
//        try {
//            map.put("access_token", "09161436170025D6E46");
//            map.put("expires_in", "20190817T21:42:31+07:00");
//        } catch (BadCredentialsException e) {
//            map.put("error_code", "TK01");
//            map.put("error_description", "token invalid");
//        }

        return map;
    }

    private static String convertStreamToString(InputStream is) {
        java.util.Scanner s = new java.util.Scanner(is).useDelimiter("\\A");
        return s.hasNext() ? s.next() : "";
    }

}
