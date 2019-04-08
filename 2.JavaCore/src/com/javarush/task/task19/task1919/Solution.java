package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        Map<String, Double> map = new TreeMap<>();
        String[] strings;
        try (BufferedReader br = new BufferedReader(new FileReader(args[0]));){
            while (br.ready()){
                String s = br.readLine();
                strings = s.split(" ");
                map.put(strings[0], map.getOrDefault(strings[0],0.0) + Double.parseDouble(strings[1]));
            }
        }
        map.forEach((k, v) -> System.out.println(k + " " + v));

    }
}
