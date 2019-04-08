package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код


        strings = new ArrayList<>();
        int o = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            strings.add(br.readLine());
            String ss = strings.get(i);
            if (ss.length() > o) o = ss.length();
        }
        for (int i = 0; i < 5; i++) {
            String ss = strings.get(i);
            if (ss.length() == o) System.out.println(ss);
        }
    }
}
