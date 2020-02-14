package com.belajar.crudwithjwt.controller.briva;

import com.belajar.crudwithjwt.repository.briva.CreateRepository;
import com.belajar.crudwithjwt.utils.GenerateSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

import static com.belajar.crudwithjwt.utils.Utils.convertStreamToString;

@RestController
public class BrivaController {

    @Autowired
    private CreateRepository createRepository;

    public BrivaController(CreateRepository createRepository) {
        this.createRepository = createRepository;
    }

//    @PostMapping("/briva/create")
    @PostMapping("/dummy")
    public String create(@RequestParam Map<String, String> body){

        GenerateSignature gs = new GenerateSignature();


        String outputJson = "";

        String institutionCode = body.get("institutionCode");
        String brivaNo = body.get("brivaNo");
        String custCode = body.get("custCode");
        String nama = body.get("nama");
        String amount = body.get("amount");
        String keterangan = body.get("keterangan");
        String expiredDate = body.get("expiredDate");
        String tokenInput = body.get("token");

        try {
            String url = "https://sandbox.partner.api.bri.co.id/v1/briva/"+institutionCode+"/"+brivaNo+"/"+custCode;

            String briSiganture = gs.getSignature(
                    "/v1/inquiry/888801000157508",
                    "GET",
                    "R04XSUbnm1GXNmDiXx9ysWMpFWBr",
                    "",
                    "a");

            URL obj = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
            conn.setRequestProperty("Authorization", "Bearer "+tokenInput);
            conn.setRequestProperty("BRI-Signature", briSiganture);
            conn.setRequestProperty("BRI-Timestamp", "2020-02-12T12:24:27.510Z");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Accept","application/json");

            System.out.println("BrivaController.clas => "+briSiganture);

            String data = "{\n" +
                    "    \"institutionCode\": \"" +institutionCode+ "\",\n" +
                    "    \"brivaNo\": \""+brivaNo+"\",\n" +
                    "    \"custCode\": \""+custCode+"\",\n" +
                    "    \"nama\": \""+nama+"\",\n" +
                    "    \"amount\": \""+amount+"\",\n" +
                    "    \"keterangan\": \""+keterangan+"\",\n" +
                    "    \"expiredDate\": \"2017-09-10 09:57:26\"\n" +
                    "}";
            OutputStreamWriter out = new OutputStreamWriter(conn.getOutputStream());
            out.write(data);

            out.close();
            outputJson = convertStreamToString(conn.getInputStream());

            System.out.println(outputJson);

        } catch (Exception e) {
            e.printStackTrace();
        }


        return outputJson;

    };



}
