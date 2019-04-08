package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.Scanner;



public class Solution {

    public static void Go(double d){
        double k = d%5;
        if (k >= 3 & k <4)
            System.out.println("жёлтый");
        else if (k >= 4 & k < 5)
            System.out.println("красный");
        else
            System.out.println("зеленый");
    }

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        String s = bufferedReader.readLine();
//        int a = Integer.parseInt(s);


        Scanner sc = new Scanner(System.in);
        double di = sc.nextDouble();

        Go(di);

//        System.out.println();
//
//        if (a < 3) System.out.println("зелёный");
//        else if (d < 4) System.out.println("жёлтый");
//        else System.out.println("красный");
    }
}