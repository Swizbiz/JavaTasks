package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import static java.lang.System.in;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String fileName = br.readLine();
        br.close();
        String s = null;
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        while (true){
            s = reader.readLine();
            if (s.startsWith(args[0]+ " ")) {
                reader.close();
                System.out.println(s);
                break;
            }
        }
    }
}
