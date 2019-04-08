package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(args[0]);
        Map<Byte, Integer> alphabet = new TreeMap<>();
        byte[] buffer = new byte[fis.available()];
        fis.read(buffer);
        fis.close();
        for (byte b : buffer) {
            alphabet.put(b, alphabet.getOrDefault(b, 0) + 1);
        }
        for (Map.Entry<Byte, Integer> entry :
                alphabet.entrySet()) {
            System.out.println(((char) (byte) entry.getKey()) + " " + entry.getValue());
        }
    }
}
