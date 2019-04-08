package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));
             BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]))){
            StringBuilder stringBuilder = new StringBuilder();
            while (reader.ready()){
                String[] strings = reader.readLine().split(" ");

                for (String s :
                        strings) {
                    if (s.matches("\\S{7,}")) {
                        stringBuilder.append(s);
                        stringBuilder.append(",");
                    }
                }
            }
            String temp = stringBuilder.toString();
            stringBuilder.deleteCharAt(temp.length()-1);
            writer.write(stringBuilder.toString());
        }
    }
}
