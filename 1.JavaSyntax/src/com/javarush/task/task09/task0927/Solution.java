package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        HashMap<String, Cat> mapa = new HashMap<>();
        mapa.put("bob", new Cat("bob"));
        mapa.put("stivvi", new Cat("bob"));
        mapa.put("kiwi", new Cat("kiwi"));
        mapa.put("glob", new Cat("bob"));
        mapa.put("job", new Cat("bob"));
        mapa.put("stop", new Cat("bob"));
        mapa.put("ukrop", new Cat("bob"));
        mapa.put("ksenomorf", new Cat("bob"));
        mapa.put("false", new Cat("bob"));
        mapa.put("true", new Cat("bob"));
        return mapa;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        HashSet<Cat> catset = new HashSet<>();
        for (Cat value : map.values()) {
            catset.add(value);
        }
        return catset;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
