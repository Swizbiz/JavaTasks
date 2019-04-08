package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Scanner;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // создай и заполни массив
        int[] ar = new int[20];
        for (int i = 0; i < 20; i++) {
            Scanner sc = new Scanner(System.in);
            int ab = sc.nextInt();
            ar[i] = ab;
        }
        return ar;
    }

    public static int max(int[] array) {
        // найди максимальное значение
        int ma = array[0];
        for (int a : array
             ) {
            if (a>ma) ma = a;
        }
        return ma;
    }
}
