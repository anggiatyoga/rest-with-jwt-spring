package com.belajar.crudwithjwt.controller.briva;

import com.belajar.crudwithjwt.utils.Utils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

@RestController
public class GetReportTime {

    //Autowired
    //Repository

    //constructor untuk controller
    Utils utils = new Utils();

    @PostMapping("/briva/getreporttime")
    public String getReport(@RequestParam Map<String, String> body) {
        String institutionCode = body.get("institutionCode");
        String brivaNo = body.get("brivaNo");
        String startDate = body.get("startDate");
        String startTime = body.get("startTime");
        String endDate = body.get("endDate");
        String endTime = body.get("endTime");

        String tokenInput = body.get("token");
        String briSiganture = "";
        String timeStamp = "";

        String outputJson = "";

        try {

            String url = "https://sandbox.partner.api.bri.co.id/v1/briva/report/"+
                    institutionCode+"/"+brivaNo+"/"+startDate+"/"+startTime+"/"+
                    endDate+"/"+endTime+"/";

            URL obj = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
            conn.setRequestProperty("Authorization", "Bearer "+tokenInput);
            conn.setRequestProperty("BRI-Signature", briSiganture);
            conn.setRequestProperty("BRI-Timestamp", timeStamp);
            conn.setDoOutput(true);
            conn.setRequestMethod("GET");

            outputJson = utils.convertStreamToString(conn.getInputStream());

        } catch (Exception e){
            e.printStackTrace();
        }

        return outputJson;
    }

}

