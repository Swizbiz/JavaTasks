package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Выражаемся покороче
*/

public class Solution {


    public static void main(String[] args) throws Exception {
        //напишите тут ваш код


        ArrayList<String> als = new ArrayList<>();
        int o = 1000;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            als.add(br.readLine());
            String ss = als.get(i);
            if (ss.length() < o) o = ss.length();
        }
        for (int i = 0; i < 5; i++) {
            String ss = als.get(i);
            if (ss.length() == o) System.out.println(ss);
        }
    }
}
