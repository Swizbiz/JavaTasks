package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

//        if (a.length() == b.length())
//            System.out.println("Длины имен равны");
         if (a.equals(b)) System.out.println("Имена идентичны");
        else if (a.length() == b.length())
            System.out.println("Длины имен равны");

    }
}
