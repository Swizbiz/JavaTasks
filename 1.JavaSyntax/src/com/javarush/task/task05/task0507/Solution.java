package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/


import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        //Scanner sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        double n = 0;
//        double sum = 0;
//        double count = 0;
//        while (n != -1) {
//            n = sc.nextDouble();
//            sum += n;
//            count += 1;
//        }
//        double sr = sum/count;
//        System.out.println(sr);
        double sum = 0;
        double count = 0;
        while (true){
            double de = scanner.nextDouble();
            if (de == -1) break;
            else {
                sum = sum + de;
                count += 1;
            }
           // double s = sum/count;

        }
        System.out.println(sum/count);

        }
    }


