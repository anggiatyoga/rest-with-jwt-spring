package com.belajar.crudwithjwt.utils;

import java.io.InputStream;

public class Utils {

    public static String convertStreamToString(InputStream is) {
        java.util.Scanner s = new java.util.Scanner(is).useDelimiter("\\A");
        return s.hasNext() ? s.next() : "";
    }


}
