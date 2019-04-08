package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
        public static int Go(int x, int y){
            if (x > y)
                return x;
                        else
                            return y;
    }
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int ab = Go(a,b);
        int cd = Go(c,d);
        int abcd = Go(ab,cd);
        System.out.println(abcd);


    }
}
