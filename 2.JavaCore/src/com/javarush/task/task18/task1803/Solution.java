package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import static java.lang.System.in;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(file);
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            if (hashMap.containsKey(data)){
                int count = 1 + hashMap.get(data);
                hashMap.put(data, count);
            } else {
                hashMap.put(data, 1);
            }
        }
        int res = 0;
        for (Integer i : hashMap.values()){
            if (i > res) {
                res = i;
            }
        }
        for (Map.Entry<Integer, Integer> i : hashMap.entrySet()){
            if (i.getValue() == res) {
                System.out.print(i.getKey()+" ");
            }
        }
        fileInputStream.close();
    }
}
