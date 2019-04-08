package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
                stringBuilder.append((char)reader.read());
            }
            String str = stringBuilder.toString();
            Pattern p = Pattern.compile("(\\b\\d+\\b)");
            Matcher m = p.matcher(str);
            while (m.find()) {
                writer.write(m.group() + " ");
            }

        }

    }
}
