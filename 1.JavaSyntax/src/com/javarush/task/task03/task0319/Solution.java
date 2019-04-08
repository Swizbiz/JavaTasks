package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        String s1 = bufferedReader.readLine();
        String s2 = bufferedReader.readLine();
        System.out.println(name + " получает " + s1 + " через " + s2 + " лет.");
    }
}
