package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.System.in;

/* 
Парсер реквестов
*/

public class Solution {



    public static void main(String[] args) {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, String> listUrlParams = new LinkedHashMap<>();

        try {
            String url = reader.readLine();

            String cutUrl = url.substring(url.indexOf("?") + 1);
            String[] urlParams = cutUrl.split("&");


            for (int i = 0; i < urlParams.length; i++) {
                String[] urlParamValue = urlParams[i].split("=");
                listUrlParams.put(urlParamValue[0], urlParamValue.length > 1 ? urlParamValue[1] : null);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        String strOut = "";

        for (HashMap.Entry<String, String> pair: listUrlParams.entrySet()) {
            strOut += pair.getKey() + " ";

        }

        System.out.println(strOut);

        for (HashMap.Entry<String, String> pair: listUrlParams.entrySet()) {
            try{
                if(pair.getKey().equals("obj")){
                    Double d = Double.parseDouble(pair.getValue());
                    alert(d);
                }
            } catch (Exception e){
                alert(pair.getValue());
                continue;
            }

        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
