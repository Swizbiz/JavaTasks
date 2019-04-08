package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

import static java.lang.System.in;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String fileName = null;
        while (true){
            try {
                fileName = br.readLine();
                FileInputStream fileInputStream = new FileInputStream(fileName);
                fileInputStream.close();
            } catch (FileNotFoundException e) {
                System.out.println(fileName);
                break;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        br.close();

    }
}
