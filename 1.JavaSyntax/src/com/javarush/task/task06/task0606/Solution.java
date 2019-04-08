package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    private static String removeLastChar(String str) {
        return str.substring(0, str.length() - 1);
    }

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();


        while (s.length() > 0) {
            int a = Integer.parseInt(s);
            if (a % 2 == 1) odd++;
            else even++;
            s = removeLastChar(s);
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
