package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import static java.lang.System.in;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String fileName = br.readLine();
        int min = 0;

        try (FileInputStream fis = new FileInputStream(fileName)){
            int oneByte = fis.read();
            while (fis.available() > 0) //пока остались непрочитанные байты
            {
                int data = fis.read(); //прочитать очередной байт
                if (data < oneByte) min = data;
            }
        }
        System.out.println(min);
    }
}
