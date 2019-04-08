package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] ar = new int[20];

        for (int i = 0; i < 20; i++) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();

            ar[i] = a;
        }

        int[] a1 = new int[10];
        int[] a2 = new int[10];

        a1 = Arrays.copyOfRange(ar, 0, 9);
        a2 = Arrays.copyOfRange(ar, 10, 20);

        for (int i=0; i < a2.length; i++)
        {
            System.out.println(a2[i]);
        }
    }
}
