package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        LinkedHashMap<Character, Integer> alphabet = new LinkedHashMap<>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.put(abcArray[i], 0);
        }



        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        // напишите тут ваш код
        for (int i = 0; i < list.size(); i++) {

            String se = list.get(i);

            for (int j = 0; j < se.length(); j++) {

                StringBuilder sb = new StringBuilder(se);
                char ch = sb.charAt(j);

                for (Map.Entry<Character, Integer> entry : alphabet.entrySet()) {
                    Character charKey = entry.getKey();
                    int intValue = entry.getValue();
                    if (charKey.equals(ch)) alphabet.put(charKey, alphabet.get(charKey) + 1);;
                }

            }
        }

        for (Map.Entry<Character, Integer> entry : alphabet.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


    }

}
