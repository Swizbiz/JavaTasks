package com.javarush.task.task08.task0813;

import java.util.Set;
import java.util.HashSet;

/* 
20 слов на букву «Л»
*/

public class Solution {
    public static Set<String> createSet() {
        //напишите тут ваш код
        HashSet hashSet = new HashSet();

        hashSet.add("Ла");
        hashSet.add("Лаf");
        hashSet.add("Лаff");
        hashSet.add("Лаfff");
        hashSet.add("Лаffff");
        hashSet.add("Лаfffff");
        hashSet.add("Лаffffff");
        hashSet.add("Лаfffffff");
        hashSet.add("Лаffffffff");
        hashSet.add("Лаfffffffff");
        hashSet.add("Лаffffffffff");
        hashSet.add("Лаfffffffffff");
        hashSet.add("Лаffffffffffff");
        hashSet.add("Лаfffffffffffff");
        hashSet.add("Лаffffffffffffff");
        hashSet.add("Лаfffffffffffffff");
        hashSet.add("Лаffffffffffffffff");
        hashSet.add("Лfаffffffffffffffff");
        hashSet.add("Лffаffffffffffffffff");
        hashSet.add("Лfffаffffffffffffffff");

        return hashSet;

    }

    public static void main(String[] args) {

    }
}
