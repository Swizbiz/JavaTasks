package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int n = Integer.parseInt(s);
        String st = reader.readLine();
        int m = Integer.parseInt(st);

        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            String s1 = reader.readLine();
            strings.add(s1);
        }

        for (int i = 0; i < m; i++) {
            strings.add(strings.get(0));
            strings.remove(0);
        }

        for (String string : strings) {
            System.out.println(string);
        }
    }
}
