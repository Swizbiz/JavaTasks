package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("brown", "bob");
        map.put("yellow", "jah");
        map.put("gray", "sam");
        map.put("green", "black");
        map.put("blue", "bob");
        map.put("black", "jack");
        map.put("red", "bob");
        map.put("orange", "bob");
        map.put("dark", "slam");
        map.put("dodi", "sam");
        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;

        for (String value : map.values()) {
            if (value.equals(name)) count++;
        }
        return count;


    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int a = 0;

        for (String s : map.keySet()) {
            if (s.equals(lastName)) a++;
        }
        return a;

    }

    public static void main(String[] args) {

    }
}
