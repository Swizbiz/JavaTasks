package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    private static int count;
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        //if (a == 0 && b == 0 && c == 0) System.out.println(0);
        if (a > 0) count += 1;
        if (b > 0) count += 1;
        if (c > 0) count += 1;
        System.out.println(count);



    }
}
