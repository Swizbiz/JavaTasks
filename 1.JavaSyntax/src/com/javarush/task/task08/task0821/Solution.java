package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("brown", "bob");
        map.put("black", "victory");
        map.put("white", "crown");
        map.put("red", "bob");
        map.put("yellow", "alice");
        map.put("green", "bob");
        map.put("blue", "bob");
        map.put("gray", "rock");
        map.put("orange", "pop");
        map.put("orange", "bob");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
