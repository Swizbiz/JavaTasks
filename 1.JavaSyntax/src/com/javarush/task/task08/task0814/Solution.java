package com.javarush.task.task08.task0814;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        // напишите тут ваш код
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            hashSet.add(i+1);
        }
        return hashSet;

    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        // напишите тут ваш код

        set.removeIf(i -> i > 10);

        return set;
    }

    public static void main(String[] args) {

    }
}
