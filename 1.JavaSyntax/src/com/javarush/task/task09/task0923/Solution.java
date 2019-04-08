package com.javarush.task.task09.task0923;



/* 
Гласные и согласные
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String s = br.readLine();
        String s1 = new String();
        String s2 = new String();

        StringBuilder sb = new StringBuilder();
        sb.append(s);
        for (int i = 0; i < s.length(); i++) {
            char ch = sb.charAt(i);
            if (ch != ' ' && isVowel(ch)) s1 = s1 + ch + " ";
            if (ch != ' ' && (!(isVowel(ch)))) s2 = s2 + ch + " ";
//            System.out.println(!(isVowel(ch)));
        }

        System.out.println(s1);
        System.out.println(s2);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}