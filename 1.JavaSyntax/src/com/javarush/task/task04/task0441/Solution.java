package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if ((a<=b && b<=c)||(c<=b && b<=a)){
            System.out.println(b);
        }
        else if ((b<=a && a<=c)||(c<=a && a<=b)){
            System.out.println(a);
        }
        else System.out.println(c);
    }
}
