package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Scanner;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        int[] ar = new int[10];


        for (int i = 0; i < 10; i++) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            ar[i] = a;
        }

        for (int j = 9; j >= 0; j--) {
            System.out.println(ar[j]);
        }
    }
}

