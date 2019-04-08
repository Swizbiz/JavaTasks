package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {

//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static String readString() throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        return s;

    }

    public static int readInt() throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        return i;

    }

    public static double readDouble() throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        return d;
    }

    public static boolean readBoolean() throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String t = "true";
        String f = "false";

        return s.equals(t);
    }

    public static void main(String[] args) {

    }
}
