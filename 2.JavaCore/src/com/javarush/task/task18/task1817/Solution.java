package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        int countLetter = 0;
        int countSpace = 0;
        try (FileInputStream fis = new FileInputStream(args[0])) {
            while (fis.available() > 0){
                char ch = (char)fis.read();
                countLetter++;
                if (ch == 32) countSpace++;
            }
            System.out.println((double)Math.round (((double) countSpace/countLetter*100)*100)/100);
        }
    }
}
