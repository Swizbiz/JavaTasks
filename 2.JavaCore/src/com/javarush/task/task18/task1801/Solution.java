package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import static java.lang.System.in;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String fileName = br.readLine();
        int max = 0;
        try (FileInputStream fis = new FileInputStream(fileName)){
            while (fis.available() > 0) //пока остались непрочитанные байты
            {
                int data = fis.read(); //читаем очередной байт
                if (data > max) max = data;
            }
        }
        System.out.println(max);
    }
}
