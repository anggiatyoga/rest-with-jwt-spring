package com.belajar.crudwithjwt.controller;

import com.belajar.crudwithjwt.exceptions.ValidationException;
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
    @PostMapping("/payment/pricelist")
//    public ResponseEntity send(@RequestBody Map<String, String> body) {
//    public MobilepulsaModel send(@RequestBody Map<String, String> body) {
    public String send(@RequestBody Map<String, String> body) {
//    public JSONObject send(@RequestBody Map<String, String> body) {
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
            out.write(data.toString());
//            out.flush();

            out.close();
            System.out.print(sign);
            outputJson = convertStreamToString(conn.getInputStream());


        } catch (Exception e) {
            e.printStackTrace();
    }
//        throw new ValidationException(outputJson);
//        return new JSONObject(outputJson);
                return outputJson;
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

//    @GetMapping("/biodata/show")
//    public List<Biodata> index(){
//        return biodataRepository.findAll();
//    }

    private static String convertStreamToString(InputStream is) {
        java.util.Scanner s = new java.util.Scanner(is).useDelimiter("\\A");
        return s.hasNext() ? s.next() : "";
    }

}
