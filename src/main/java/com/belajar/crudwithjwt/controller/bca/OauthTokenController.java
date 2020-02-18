package com.belajar.crudwithjwt.controller.bca;

import com.belajar.crudwithjwt.utils.GenerateSignature;
import com.belajar.crudwithjwt.utils.Utils.*;
//import com.belajar.crudwithjwt.utils.GenerateSignature.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

@RestController
public class OauthTokenController {

    GenerateSignature generateSignature = new GenerateSignature();

    //Autowired
    //Repository

    //Constructor

    @PostMapping("/bca/oauth/token")
    public Map<String, Object> oauthToken(@RequestParam Map<String, String> body) {

        //Generated token => Basic base64(client_id:client_secret)

        //Get signature

        String grant_type = body.get("grant_type");

        String outputJson = "";

//        try {
//
//            String url = "";
//
//            URL obj = new URL(url);
//            HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
//            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
//            conn.setRequestProperty("Authorization", "Basic base64(client_id:client_secret)");
//
//
//        } catch (Exception e){
//
//        }

        String client_id = "7051c39f-6fed-4e3f-9422-d05983e0ea35";
        String client_secret = "b0349544-102d-4587-8cb3-3e243214e296";

        String base64Byte = generateSignature.generateBase64Byte(client_id, client_secret);
        String base64String = generateSignature.generateBase64String(client_id, client_secret);

        Map<String, Object> map = new HashMap<>();
        map.put("base64Byte", base64Byte);
        map.put("base64String", base64String);

        return map;
    }

}
