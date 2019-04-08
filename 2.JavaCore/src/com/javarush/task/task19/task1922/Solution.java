package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.lang.System.in;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String filename = br.readLine();
        br.close();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))){
            while (reader.ready()) {
                String str = reader.readLine();
                List<String> list = new ArrayList<>(Arrays.asList(str.split(" ")));
                int count = 0;
                for (String s : words) count += Collections.frequency(list, s);
                if (count == 2) System.out.println(str);
            }
        }
    }
}
