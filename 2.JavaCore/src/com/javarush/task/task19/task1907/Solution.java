package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.in;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String fileName = br.readLine();
        br.close();
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        try (FileReader fileReader = new FileReader(fileName)){
            while (fileReader.ready()){
                stringBuilder.append((char)fileReader.read());
            }
            String str = stringBuilder.toString();
            Pattern p = Pattern.compile("\\bworld\\b");
            Matcher m = p.matcher(str);
            while (m.find())
                count++;
        }
        System.out.println(count);
    }
}
