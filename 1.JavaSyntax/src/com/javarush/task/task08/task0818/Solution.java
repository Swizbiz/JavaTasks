package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map = new HashMap<>();
        map.put("brown", 100);
        map.put("yellow", 100);
        map.put("green", 100);
        map.put("grey", 550);
        map.put("black", 500);
        map.put("white", 100);
        map.put("red", 100);
        map.put("fox", 1000);
        map.put("goose", 1900);
        map.put("bob", 100);

        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> path = iterator.next();
            int value = path.getValue();
            if (value < 500)  iterator.remove();
        }
    }

    public static void main(String[] args) {

    }
}