package com.belajar.crudwithjwt.controller.mobilepulsa;

import com.belajar.crudwithjwt.repository.mobilepulsa.MobilepulsaRepository;
import com.belajar.crudwithjwt.utils.Utils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.bind.DatatypeConverter;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static com.belajar.crudwithjwt.utils.Utils.convertStreamToString;

@RestController
public class MobilepulsaController {

    @Autowired
    private MobilepulsaRepository mobilepulsaRepository;

    public MobilepulsaController(MobilepulsaRepository mobilepulsaRepository) {
        this.mobilepulsaRepository = mobilepulsaRepository;
    }

    @PostMapping("/ppob/checkbalance")
    public String checkbalance(@RequestParam Map<String, String> body) {
        String test = body.get("test");
        String outputJson = "";

        try{
          String url = "https://testprepaid.mobilepulsa.net/v1/legacy/index";

            URL obj = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Accept", "application/json");

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

    @PostMapping("/ppob/pricelist")
    public String pricelist(@RequestParam Map<String, String> body) {
        String type = body.get("type");
        String operator = body.get("operator");
        String outputJson = "";

        try{
            String url = "https://testprepaid.mobilepulsa.net/v1/legacy/index/"+type+"/"+operator;

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

    @PostMapping("/ppob/checkgameid")
    public String checkgameid(@RequestParam Map<String, String> body) {
        String gameCode = body.get("game_code");
        String outputJson = "";

        try{
            String url = "https://testprepaid.mobilepulsa.net/v1/player-detail";

            URL obj = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");

            String uname = "087773906676";
            String pass = "4645e149335884d2";
            String apikey = "4645e149335884d2";
            String sign = uname + apikey + gameCode;

            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(sign.getBytes());
            byte[] digest = md.digest();
            String myHash = DatatypeConverter.printHexBinary(digest).toLowerCase();

            String data = "{\n" +
                    "  \"commands\" : \"check-game-id\",\n" +
                    "  \"username\" : \""+ uname + "\",\n" +
                    "  \"game_code\" : \""+ gameCode + "\",\n" +
                    "  \"hp\" : \"156378300|8483\",\n" +
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



    @PostMapping("ppob/checkstatus")
    public String checkstatus(@RequestParam Map<String, String> body) {
        String refId = body.get("ref_id");
        String outputJson = "";

        try {

            String url = "https://testprepaid.mobilepulsa.net/v1/legacy/index";

            URL obj = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");

            String uname = "087773906676";
            String apiKey = "4645e149335884d2";
            String sign = uname + apiKey + refId;

            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(sign.getBytes());
            byte[] digest = md.digest();
            String myHash = DatatypeConverter.printHexBinary(digest).toLowerCase();

            String data =  "{\n" +
                    "  \"commands\"   : \"inquiry\",\n" +
                    "  \"username\"   : \"" + uname + "\",\n" +
                    "  \"ref_id\"     : \"" + refId + "\",\n" +
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




}
