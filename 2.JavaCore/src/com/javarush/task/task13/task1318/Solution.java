package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

import static java.lang.System.in;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String s = br.readLine();
        FileInputStream inputStream = null;
        BufferedInputStream buffer = null;

        try {

            inputStream = new FileInputStream(s);

            buffer = new BufferedInputStream(inputStream);

            while(buffer.available()>0) {

                char c = (char)buffer.read();

                System.out.print(c);
            }
        } catch(Exception e) {

            e.printStackTrace();

        } finally {

            inputStream.close();
            buffer.close();
            br.close();
        }
    }
}
