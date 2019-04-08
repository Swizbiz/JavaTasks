package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static int D(int x, int y){
        if (x > y)
            return x;
        else
            return y;
    }

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        String s = bufferedReader.readLine();


        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Integer arr[] = new Integer[] {a, b, c};

        Arrays.sort(arr, Collections.reverseOrder());
//Выводим отсортированный массив на консоль.
        for(int i = 0; i <  arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
//        int ab = D(a,b);a
//        int ac = D(a,c);b
//        int bc = D(b,c);c
//
//        if (ab > ac & ab > bc)
//            System.out.println(ab);
//
//        if (ab < ac)
//        {
//            if (ab < bc)
//                System.out.print(" " + ab);
//            else
//                System.out.println(" " + bc);
//        }
//        else
//        {
//            if (ac < bc)
//                System.out.println(" " + ac);
//            else
//                System.out.println(" " + bc);
//        }
//
////        if (ab > ac){
//            if (ab > bc)
//                System.out.println(ab);
//            else System.out.println(bc);
//        }
//        else if ()

    }
}
