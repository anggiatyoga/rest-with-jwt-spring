package com.belajar.crudwithjwt.controller;

import com.belajar.crudwithjwt.exceptions.ValidationException;
import com.belajar.crudwithjwt.model.Biodata;
import com.belajar.crudwithjwt.repository.MobilepulsaRepository;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.xml.bind.DatatypeConverter;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class MobilepulsaController {
    //Check Balance


    @Autowired
    private MobilepulsaRepository mobilepulsaRepository;

    public MobilepulsaController(MobilepulsaRepository mobilepulsaRepository) {
        this.mobilepulsaRepository = mobilepulsaRepository;
    }

    //send
    @PostMapping("/payment/checkbalance")
//    public ResponseEntity send(@RequestBody Map<String, String> body) {
//    public MobilepulsaModel send(@RequestBody Map<String, String> body) {
    public String checkbalance(@RequestBody Map<String, String> body) {
//    public JSONObject send(@RequestBody Map<String, String> body) {
//    public Map<String, Object> send(@RequestBody Map<String, String> body) {
        String type = body.get("type");
        String operator = body.get("operator");
        String outputJson = "";

        try{
          String url = "https://testprepaid.mobilepulsa.net/v1/legacy/index";

            URL obj = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");

            String uname = "087773906676";
            String pass = "4645e149335884d2";
            String sign = uname + pass + "bl";

            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(sign.getBytes());
            byte[] digest = md.digest();
            String myHash = DatatypeConverter.printHexBinary(digest).toLowerCase();

            String data = "{\n" +
                    "  \"commands\" : \"balance\",\n" +
                    "  \"username\" : \""+ uname + "\",\n" +
                    "  \"sign\"     : \""+ myHash + "\"\n" +
                    "}";

            OutputStreamWriter out = new OutputStreamWriter(conn.getOutputStream(), "UTF-8");
            out.write(data);
//            out.flush();

            out.close();

            outputJson = convertStreamToString(conn.getInputStream());

            System.out.print(outputJson);

        } catch (Exception e) {
            e.printStackTrace();
    }
//        throw new ValidationException(outputJson);
//        return new JSONObject("{'aa':'bb'}");
                return outputJson;
    }

    @PostMapping("/payment/pricelist")
    public String pricelist(@RequestBody Map<String, String> body) {
        String outputJson = "";

        try{
            String url = "https://testprepaid.mobilepulsa.net/v1/legacy/index";

            URL obj = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");

            String uname = "087773906676";
            String pass = "4645e149335884d2";
            String sign = uname + pass + "pl";

            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(sign.getBytes());
            byte[] digest = md.digest();
            String myHash = DatatypeConverter.printHexBinary(digest).toLowerCase();

            String data = "{\n" +
                    "  \"commands\" : \"pricelist\",\n" +
                    "  \"username\" : \""+ uname + "\",\n" +
                    "  \"sign\"     : \""+ myHash + "\"\n" +
                    "}";

            OutputStreamWriter out = new OutputStreamWriter(conn.getOutputStream(), "UTF-8");
            out.write(data);

            out.close();
            outputJson = convertStreamToString(conn.getInputStream());

            System.out.print(outputJson);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return outputJson;
    }

    @PostMapping("payment/topup")
    public String topup(@RequestBody Map<String, String> body) {
        String outputJson = "";

        try {

            String url = "https://testprepaid.mobilepulsa.net/v1/legacy/index";

            URL obj = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");

            String uname = "087773906676";
            String pass = "4645e149335884d2";
            Date dNow = new Date();
            SimpleDateFormat ft = new SimpleDateFormat("yyyyMMddhhmmss");
            String refId = ft.format(dNow);
            String sign = uname + pass + refId;

            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(sign.getBytes());
            byte[] digest = md.digest();
            String myHash = DatatypeConverter.printHexBinary(digest).toLowerCase();

            String data =  "{\n" +
                    "  \"commands\"   : \"topup\",\n" +
                    "  \"username\"   : \"" + uname + "\",\n" +
                    "  \"ref_id\"     : \"" + refId + "\",\n" +
                    "  \"hp\"         : \"0817777215\",\n" +
                    "  \"pulsa_code\" : \"xld25000\",\n" +
                    "  \"sign\"       : \"" + myHash + "\"\n" +
                    "}";

            OutputStreamWriter out = new OutputStreamWriter(conn.getOutputStream());
            out.write(data);

            out.close();
            outputJson = convertStreamToString(conn.getInputStream());
            System.out.print(outputJson);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return outputJson;
    }


    @GetMapping("/test/hello")
    public Map<String, Object> sayHello() {
        Map<String, Object> map = new HashMap<>();
        map.put("data", new HashMap<Integer, Object>(){
            {
                for (int i=0; i<3; i++){
                    put(i, new HashMap<Integer, Object>(){
                        {
                            for (int j=0; j<3; j++){
                             put(j, "j ke + "+j);
                            }
                        }
                    });
                }
            }
        });
        map.put("status", "200(Ok)");
        map.put("message","Succses");

        return map;
    }



    private JSONObject stringToJson(String str) {
        JSONObject jsonObject = new JSONObject(str);
        try {
            jsonObject = new JSONObject(str);
        } catch (JSONException err) {
            System.out.println("CATCH JSONException ERROR!");
        }
        return jsonObject;
    }

    private static String convertStreamToString(InputStream is) {
        java.util.Scanner s = new java.util.Scanner(is).useDelimiter("\\A");
        return s.hasNext() ? s.next() : "";
    }

}
