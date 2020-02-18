package com.belajar.crudwithjwt.utils;

//import jdk.internal.org.jline.reader.LineReader;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.TimeZone;

public class GenerateSignature {

    public String getSignature(String path, String verb, String token, String body, String key){
        String signatureString = "";

        try {
            String timestamp = "2020-02-12T14:16:16.754Z";

            String payload = "    path=/v1/inquiry/888801000157508&verb=GET&token=R04XSUbnm1GXNmDiXx9ysWMpFWBr&timestamp=2020-02-12T14:16:16.754Z&body= \n" +
                    "    ";

            signatureString = createSignature(payload, key);

            System.out.println("payload => {"+payload+"}");
            System.out.println("GenerateSignature.class => "+signatureString);
        } catch (Exception e){
            e.printStackTrace();
        }
        return signatureString;
    }

    public static String createTimestamp() {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        df.setTimeZone(tz);

        System.out.println("createTimestamp => "+(df.format(new Date())));

        return df.format(new Date());
    }

    public static String createSignature(String payload, String key) throws NoSuchAlgorithmException, UnsupportedEncodingException, InvalidKeyException {
        Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
        SecretKeySpec secret_key = new SecretKeySpec(key.getBytes("UTF-8"), "HmacSHA256");
        sha256_HMAC.init(secret_key);

        byte[] signatureByte = sha256_HMAC.doFinal(payload.getBytes("UTF-8"));
        
        return DatatypeConverter.printBase64Binary(signatureByte);
    }

    public static String generateBase64Byte(String client_id, String client_secret){
        String encodeBytes = "";
        try{
            byte[] encodeByte = Base64.getEncoder().encode((client_id + ":" + client_secret).getBytes());
            encodeBytes = String.valueOf(encodeByte);
            System.out.println("encodeBytes  => "+encodeBytes);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return encodeBytes;
    }

    public static String generateBase64String(String client_id, String client_secret){
        String encodeString = Base64.getEncoder().encodeToString((client_id + ":" + client_secret).getBytes());

        return encodeString;
    }

}