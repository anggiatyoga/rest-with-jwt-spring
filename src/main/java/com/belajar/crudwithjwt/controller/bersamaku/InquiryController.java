package com.belajar.crudwithjwt.controller.bersamaku;

import com.belajar.crudwithjwt.model.bersamaku.Inquiry;
import com.belajar.crudwithjwt.repository.bersamaku.InquiryRepository;
import com.belajar.crudwithjwt.utils.Utils;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private InquiryRepository inquiryRepository;

    Utils utils = new Utils();

    public InquiryController(InquiryRepository inquiryRepository) {
        this.inquiryRepository = inquiryRepository;
    }

    @PostMapping("/bersamaku/inquiry")
    public String inquiry(@RequestParam Map<String, String> body) throws Exception{
        String transactionId = body.get("stan");
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

            try {
                final JSONObject jsonObject = new JSONObject(outputJson);
                final JSONObject jsonArray_tr_ID = jsonObject.getJSONObject("transaction_ID");

                String stan = jsonArray_tr_ID.getString("stan");
                String inst_ID = jsonArray_tr_ID.getString("inst_ID");
                String trans_Date_Time = jsonArray_tr_ID.getString("trans_Date_Time");
                String refTrx_code = jsonObject.getJSONObject("refTrx").getString("code");
                final JSONObject jsonArray_source = jsonObject.getJSONObject("source");
                String source_amount = jsonArray_source.getString("amount");
                String source_currency = jsonArray_source.getString("currency");
                String source_country_code = jsonArray_source.getString("country_Code");

                final JSONObject jsonArray_destination = jsonObject.getJSONObject("destination");
                String destination_amount = jsonArray_destination.getString("amount");
                String destination_currency = jsonArray_destination.getString("currency");
                String destination_country_code = jsonArray_destination.getString("country_Code");

                String timestamp_response = jsonObject.getString("timestamp_response");
                String siganture = jsonObject.getString("Signature");


                inquiryRepository.save(new Inquiry(stan, inst_ID, trans_Date_Time, refTrx_code, source_amount,
                        source_currency, source_country_code, destination_amount, destination_currency,
                        destination_country_code, timestamp_response, siganture));

            } catch (JSONException e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }




        return outputJson;
    }

}
