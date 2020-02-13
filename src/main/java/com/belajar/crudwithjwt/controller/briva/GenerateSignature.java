package com.belajar.crudwithjwt.controller.briva;

//import jdk.internal.org.jline.reader.LineReader;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class GenerateSignature {

    public String getSignature(String path, String verb, String token, String body, String key){
//        LineReader messageContext = null;
        String signatureString = "";

        try {
//            String timestamp = createTimestamp();
            String timestamp = "2020-02-12T14:16:16.754Z";

//            String payload = "path=" + path + "&verb=" + verb + "&token=" + token +
//                    "&timestamp=" + timestamp + "&body=" + body;
            String payload = "    path=/v1/inquiry/888801000157508&verb=GET&token=R04XSUbnm1GXNmDiXx9ysWMpFWBr&timestamp=2020-02-12T14:16:16.754Z&body= \n" +
                    "    ";

//            messageContext.setVariable("debug-payload", payload);
//            messageContext.setVariable("timestamp", timestamp);

            signatureString = createSignature(payload, key);
            
//            messageContext.setVariable("signature", signatureString);
            System.out.println("payload => {"+payload+"}");
            System.out.println("GenerateSignature.class => "+signatureString);
        } catch (Exception e){
            e.printStackTrace();
        }
        return signatureString;
    }

    String createTimestamp() {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        df.setTimeZone(tz);

        System.out.println("createTimestamp => "+(df.format(new Date())));

        return df.format(new Date());
    }

    String createSignature(String payload, String key) throws NoSuchAlgorithmException, UnsupportedEncodingException, InvalidKeyException {
        Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
        SecretKeySpec secret_key = new SecretKeySpec(key.getBytes("UTF-8"), "HmacSHA256");
        sha256_HMAC.init(secret_key);

        byte[] signatureByte = sha256_HMAC.doFinal(payload.getBytes("UTF-8"));
        
        return DatatypeConverter.printBase64Binary(signatureByte);
    }

}

//    public String signature(String token){
//        String data="";
//        String path="/v1/inquiry/888801000157508",verb="GET",
//                timestamp="2019-01-02T13:14:15.678Z",body="";
//
//        data= (("path="+path+"&"+"verb="+verb+"&"+"token=Bearer "+token+"&"
//                +"timestamp="+timestamp+"&"+"body="+body));
//        byte[] encodeBytes = new byte[0];
//
//        try {
//            //SHA256
//            MessageDigest digest = MessageDigest.getInstance("SHA-256");
//            byte[] hash = digest.digest(data.getBytes(StandardCharsets.UTF_8));
//            //Base64
//            encodeBytes = Base64.getEncoder().encode(hash);
//            System.out.println("encodeBytes => "+ new String(encodeBytes));
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return new String(encodeBytes);
//    }
//
//    public String timestamp() {
//
//        Date d = null;
//
//        try {
//
//            Date date = new Date();
//            long time = date.getTime();
//            Timestamp ts = new Timestamp(time);
//
//            String times = String.valueOf(ts);
//
//            System.out.println(ts);
//
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
//            SimpleDateFormat output = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//            d = sdf.parse(times);
//            String formattedTime = output.format(d);
//
//        } catch (Exception e){
//            e.printStackTrace();
//        }
//
//        return String.valueOf(d);
//    }
