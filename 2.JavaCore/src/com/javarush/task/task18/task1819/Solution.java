package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

import static java.lang.System.in;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String fileName1 = br.readLine();
        String fileName2 = br.readLine();
        FileInputStream fis1 = new FileInputStream(fileName1);
        int count1 = 0;
        byte[] buffer1 = new byte[fis1.available()];
        while (fis1.available() > 0) {
            count1 = fis1.read(buffer1);
        }

        FileInputStream fis2 = new FileInputStream(fileName2);
        int count2 = 0;
        byte[] buffer2 = new byte[fis2.available()];
        while (fis2.available() > 0){
            count2 = fis2.read(buffer2);
        }
        fis1.close();
        fis2.close();
        FileOutputStream fos = new FileOutputStream(fileName1);
        fos.write(buffer2);
        fos.write(buffer1);

        fos.close();
        }
    }

