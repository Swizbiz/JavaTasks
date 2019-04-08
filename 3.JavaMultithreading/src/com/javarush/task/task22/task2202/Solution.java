package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) {
        String s;
        try {
            String [] strArr = string.split(" ");
            if (strArr.length < 5) throw new TooShortStringException();
            return String.format("%s %s %s %s", strArr[1], strArr[2], strArr[3], strArr[4]);
        }catch (Exception e){
            throw new TooShortStringException();
        }
    }

    public static class TooShortStringException extends RuntimeException{
    }
}
