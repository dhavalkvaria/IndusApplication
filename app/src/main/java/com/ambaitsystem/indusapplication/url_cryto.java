package com.ambaitsystem.indusapplication;

import android.util.Base64;
import android.util.Log;
import android.widget.Toast;

import java.io.UnsupportedEncodingException;

public class url_cryto {

    public static String decrypt(String encrypttext)
    {
        String text = "";
        byte[] data2 = Base64.decode(encrypttext, Base64.DEFAULT);
        try {
            text = new String(data2, "UTF-8");
        } catch (Exception e) {

        }
        return  text;
    }

    public static String encrypt(String Endpoint) {
        String base64 ="";
        try {
            byte[] data = Endpoint.getBytes("UTF-8");
            base64 = Base64.encodeToString(data, Base64.DEFAULT);
        } catch (Exception e) {
        }

        return base64;
    }
}
