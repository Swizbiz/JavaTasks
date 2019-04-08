package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int a = Integer.parseInt(s);
        if (a >= 1 && a <= 999) {
            if ((s.length() == 1) && (a % 2 == 0)) System.out.println("четное однозначное число");
            if ((s.length() == 2) && (a % 2 == 0)) System.out.println("четное двузначное число");
            if ((s.length() == 3) && (a % 2 == 0)) System.out.println("четное трехзначное число");
            if ((s.length() == 1) && (a % 2 == 1)) System.out.println("нечетное однозначное число");
            if ((s.length() == 2) && (a % 2 == 1)) System.out.println("нечетное двузначное число");
            if ((s.length() == 3) && (a % 2 == 1)) System.out.println("нечетное трехзначное число");
        }

    }
}
