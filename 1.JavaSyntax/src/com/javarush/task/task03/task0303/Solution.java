package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        double v = convertEurToUsd(10, 2);
        System.out.println(v);
        double v1 = convertEurToUsd(15, 3);
        System.out.println(v1);

    }

    public static double convertEurToUsd(int eur, double course) {
        // напишите тут ваш код 

        return eur * course;
    }
}
