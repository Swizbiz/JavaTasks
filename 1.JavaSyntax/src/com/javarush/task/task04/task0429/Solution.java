package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static int count1;
    public static int count2;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > 0)
            count1 += 1;
        else if (a < 0)
            count2 += 1;
        if (b > 0)
            count1 += 1;
        else if (b < 0)
            count2 += 1;
        if (c > 0)
            count1 += 1;
        else if (c < 0)
            count2 += 1;
        System.out.println("количество положительных чисел: " + count1);
        System.out.println("количество отрицательных чисел: " + count2);


    }
}
