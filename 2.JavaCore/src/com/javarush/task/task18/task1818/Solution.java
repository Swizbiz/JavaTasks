package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;



public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream outputStream = new FileOutputStream(reader.readLine());
        FileInputStream inputStream1 = new FileInputStream(reader.readLine());
        FileInputStream inputStream2 = new FileInputStream(reader.readLine());

        byte[] buffer1 = new byte[inputStream1.available()];
        byte[] buffer2 = new byte[inputStream2.available()];
        int count1 = 0;
        int count2 = 0;

        while (inputStream1.available() > 0) count1 = inputStream1.read(buffer1);
        while (inputStream2.available() > 0) count2 = inputStream2.read(buffer2);

        inputStream1.close();
        inputStream2.close();

        outputStream.write(buffer1, 0, count1);
        outputStream.write(buffer2, 0, count2);
        outputStream.close();
    }
}
