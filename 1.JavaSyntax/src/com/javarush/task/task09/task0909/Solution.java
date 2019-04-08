package com.javarush.task.task09.task0909;

/* 
Исключение при работе с массивами
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        int[] m = new int[2];
        try {
            m[8] = 5;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println(e.toString());
            System.err.println(e.getClass().getSimpleName());
        }

        //напишите тут ваш код
    }
}
