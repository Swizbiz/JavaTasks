package com.javarush.task.task08.task0801;

/* 
HashSet из растений
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        HashSet<String> hashSet = new HashSet<>();
        String s1 = "арбуз";
        String s2 = "банан";
        String s3 = "вишня";
        String s4 = "груша";
        String s5 = "дыня";
        String s6 = "ежевика";
        String s7 = "женьшень";
        String s8 = "земляника";
        String s9 = "ирис";
        String s10 = "картофель";

        hashSet.add(s1);
        hashSet.add(s2);
        hashSet.add(s3);
        hashSet.add(s4);
        hashSet.add(s5);
        hashSet.add(s6);
        hashSet.add(s7);
        hashSet.add(s8);
        hashSet.add(s9);
        hashSet.add(s10);

        for (String s : hashSet) {
            System.out.println(s);
        }

    }
}
