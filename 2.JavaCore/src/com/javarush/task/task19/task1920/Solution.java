package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        Map<String, Double> map = new TreeMap<>();
        String[] strings;
        try (BufferedReader br = new BufferedReader(new FileReader(args[0]))){
            while (br.ready()){
                String[] s = br.readLine().split(" ", 2);
                Double d = Double.parseDouble(s[1]);
                map.merge(s[0], d, (aDouble, aDouble2) -> aDouble + aDouble2);            }
        }
        Double max = 0.0;
        for (Map.Entry<String, Double> pair : map.entrySet()) {
            if (pair.getValue() > max)
                max = pair.getValue();
        }
        for (Map.Entry<String, Double> pair : map.entrySet()) {
            if(pair.getValue().equals(max))
                System.out.println(pair.getKey());
        }
    }
}
