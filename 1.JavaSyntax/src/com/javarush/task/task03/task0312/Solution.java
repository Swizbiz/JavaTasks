package com.javarush.task.task03.task0312;

/* 
Конвертируем время
*/

public class Solution {
    public static int convertToSeconds(int hour){
        return hour*3600;
    }

    public static void main(String[] args) {
        int i = convertToSeconds(2);
        System.out.println(i);
        int i2 = convertToSeconds(3);
        System.out.println(i2);
    }
}
