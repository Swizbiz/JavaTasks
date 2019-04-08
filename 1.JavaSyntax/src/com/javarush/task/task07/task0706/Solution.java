package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.stream.IntStream;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader (new InputStreamReader (System.in));

        int[] array = new int[15];
        int x = 0;
        int y = 0;
        for (int i = 0; i<array.length; i++){
            array[i] = Integer.parseInt(r.readLine());
        }

        for (int i = 0; i<array.length; i = i+2){
            x = x + array[i];
        }

        for (int i = 1; i<array.length; i = i+2){
            y = y + array[i];
        }

        if (x>y)
            System.out.println ("В домах с четными номерами проживает больше жителей.");
        else
            System.out.println ("В домах с нечетными номерами проживает больше жителей.");
    }
}
