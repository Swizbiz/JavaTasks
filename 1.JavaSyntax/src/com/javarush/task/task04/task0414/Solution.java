package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        int i = Integer.parseInt(s);

        if ((i%4 == 0) && !(i%100 == 0 && i%400 != 0))
            System.out.println("количество дней в году: 366");
        else System.out.println("количество дней в году: 365");
    }
}