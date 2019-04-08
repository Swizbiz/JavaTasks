package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] ar = new int[20];
        int maximum;
        int minimum;

        //напишите тут ваш код


        for (int i = 0; i < 20; i++) {
            String s = reader.readLine();
            int a = Integer.parseInt(s);
            ar[i] = a;
        }

        Arrays.sort(ar);
        minimum = ar[0];
        maximum = ar[ar.length-1];

        System.out.print(maximum + " " + minimum);
    }
}
