package com.javarush.task.task08.task0817;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("brown", "bob");
        map.put("gray", "bob");
        map.put("green", "glow");
        map.put("black", "blow");
        map.put("white", "job");
        map.put("red", "slow");
        map.put("fox", "flow");
        map.put("bob", "bob");
        map.put("zsf", "knob");
        map.put("zet", "snob");

        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        HashSet<String> set = new HashSet<>(map.values());

        for (String s : set) {
            if (Collections.frequency(map.values(), s) > 1)
            removeItemFromMapByValue(map, s);
        }


    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
