package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String fileName = br.readLine();

        int count = 0;
        try (FileInputStream fis = new FileInputStream(fileName)){
            while (fis.available() > 0){
                int data = fis.read();
                if (data == 44) count++;
            }
        }

        System.out.println(count);
    }
}
