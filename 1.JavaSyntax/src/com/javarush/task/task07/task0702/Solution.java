package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] s = new String[10];

        for (int i = 0; i < 8; i++) {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sc = br.readLine();
        s[i] = sc;
        }

        for (int j = 9; j >= 0; j--) {
            System.out.println(s[j]);
        }
    }
}