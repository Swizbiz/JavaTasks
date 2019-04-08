package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        ArrayList<Integer> ints = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (isNumber(list.get(i))) ints.add(Integer.parseInt(list.get(i)));
            else strings.add(list.get(i));
        }

        Collections.sort(strings);
        Collections.sort(ints);
        Collections.reverse(ints);

        int xx = 0;
        int y = 0;


        String[] array = list.toArray(new String[0]);
        sort(array);

        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) {
                array[i] = (ints.get(xx)).toString();
                xx++;}
            else {
                array[i] = strings.get(y);
                y++;}
        }

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        // напишите тут ваш код
        isGreaterThan("lol", "prekol");
        isNumber("opa");
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
