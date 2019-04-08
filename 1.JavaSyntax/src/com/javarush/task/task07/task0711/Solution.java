package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<>();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            strings.add(bufferedReader.readLine());
        }

        for (int i = 0; i < 13; i++) {
            String s = strings.get(4);
            strings.remove(4);
            strings.add(0, s);
        }

        for (String sa : strings) {
            System.out.println(sa);
        }
    }
}
