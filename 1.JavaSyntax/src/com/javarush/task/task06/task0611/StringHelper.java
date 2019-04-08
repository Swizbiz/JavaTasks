package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
*/

public class StringHelper {
    public static String multiply(String s) {
        //напишите тут ваш код
        return s+s+s+s+s;
    }

    public static String multiply(String s, int count) {
        StringBuilder result = new StringBuilder();
        //напишите тут ваш код
        for (int i = 0; i < count; i++) {
            result.append(s);
        }
        return result.toString();
    }

    public static void main(String[] args) {

    }
}
