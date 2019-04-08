package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int tab = 10;
        for (int i = 1; i <= tab; i++) {
            for (int t = 1; t <= tab; t++) {
                System.out.print(t * i + " ");
            }
            System.out.println();
        }
    }
}


