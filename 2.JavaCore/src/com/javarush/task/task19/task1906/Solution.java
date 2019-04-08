package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

import static java.lang.System.in;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String fileName1 = br.readLine();
        String fileName2 = br.readLine();
        br.close();

        try (FileReader fileReader = new FileReader(fileName1);
             FileWriter fileWriter = new FileWriter(fileName2)){
            int count = 0;
            while (fileReader.ready()){
                int ch = fileReader.read();
                count++;
                if (count%2 == 0) fileWriter.write(ch);
            }
        }
    }
}
