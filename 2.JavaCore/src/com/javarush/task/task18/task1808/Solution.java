package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

import static java.lang.System.in;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String fileName1 = br.readLine();
        String fileName2 = br.readLine();
        String fileName3 = br.readLine();

        try (FileInputStream fis = new FileInputStream(fileName1);
             FileOutputStream fos2 = new FileOutputStream(fileName2);
             FileOutputStream fos3 = new FileOutputStream(fileName3)) {
            byte[] buffer = new byte[fis.available()];
            int count = fis.read(buffer);
            fos2.write(buffer, 0, count / 2 + count % 2);
            fos3.write(buffer, count / 2 + count % 2, count / 2);
        }

    }
}
