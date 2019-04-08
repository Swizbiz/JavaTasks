package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> als = new ArrayList<>();
        int o = 1000;
        int u = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            als.add(br.readLine());
            String ss = als.get(i);
            if (ss.length() < o) o = ss.length();
            if (ss.length() > u) u = ss.length();
        }
        for (int i = 0; i < 10; i++) {
            String ss = als.get(i);
            if ((ss.length() == o) || (ss.length() == u)){
                System.out.println(ss);
                break;}
        }

    }
}
