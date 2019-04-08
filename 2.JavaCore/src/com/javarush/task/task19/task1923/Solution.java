package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));
             BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]))){
            while (reader.ready()){
                String s = reader.readLine();
                String[] strings = s.split(" ");
                for (String ss : strings) {
                    if (ss.matches(".*\\d+.*")) writer.write(ss + " ");
                }
            }
        }
    }
}
