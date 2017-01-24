package com.github.ygc182.livinghelper.utils;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpUtils {

    public static void get() {
        try {
            URL url = new URL(String.format("%s")"http://apis.juhe.cn/mobile/get");
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
