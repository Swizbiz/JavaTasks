package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String fileName = br.readLine();
        br.close();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            while (reader.ready()){
                String s = reader.readLine();
                String reverse = new StringBuffer(s).reverse().toString();
                System.out.println(reverse);
            }
        }
    }
}
