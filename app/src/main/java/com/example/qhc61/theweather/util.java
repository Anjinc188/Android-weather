package com.example.qhc61.theweather;

import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;

public class util {
    public static String getJosonString(String urlpath) throws Exception {
        URL url = new URL(urlpath);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.connect();
        InputStream inputStream = connection.getInputStream();//对应的字符编码转换
        Reader reader = new InputStreamReader(inputStream, "UTF-8");
        BufferedReader bufferedReader = new BufferedReader(reader);

        String str = "";
        StringBuffer sb = new StringBuffer();
        while ((str = bufferedReader.readLine()) != null) {
            sb.append(str);
        }
        reader.close();
        connection.disconnect();
        return sb.toString();
    }

    public static Data resolveRoot(String strPar) {
        try {
            //因为最外面仍有一个JSONObject,所以需要手动把它解开
            return new Gson().fromJson(strPar, Data.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
