package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {

    public static void vivod(HashMap<String, Integer> mapa){
        for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
            String se = entry.getKey();
            Integer inte = entry.getValue();
            System.out.println(inte + " " + se);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> map = new HashMap<>();
        int id;
        String name = null;

        while (true) {

            try {
                id = Integer.parseInt(reader.readLine());

            }catch (Exception e){
                break;
            }
            name = reader.readLine();

            if (name.equals("")) {
                map.put(name, id);
                break;
            }

            if (!map.containsKey(name)) {
                map.put(name, id);
            }

        }


        for (Map.Entry<String, Integer> pair: map.entrySet()){
            System.out.println(pair.getValue() + " " + pair.getKey());
        }


    }
}
