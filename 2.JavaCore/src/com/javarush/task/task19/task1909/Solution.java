package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

import static java.lang.System.in;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String fileName1 = br.readLine();
        String fileName2 = br.readLine();
        br.close();
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName1));
             BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2))){
            while (reader.ready()){
                char ch = (char)reader.read();
                if (ch == '.') stringBuilder.append('!');
                else stringBuilder.append(ch);
            }
            writer.write(stringBuilder.toString());

        }
    }
}
