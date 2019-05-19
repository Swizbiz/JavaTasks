package com.javarush.task.task32.task3210;

import java.io.RandomAccessFile;
import java.util.Arrays;

/* 
Используем RandomAccessFile
*/

public class Solution {
    public static void main(String... args) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(args[0], "rw");
            randomAccessFile.seek(Integer.parseInt(args[1]));

            byte[] bytes = new byte[args[2].length()];
            randomAccessFile.read(bytes, 0, args[2].length());

            randomAccessFile.seek(randomAccessFile.length());
            if (Arrays.equals(bytes, args[2].getBytes()))
                randomAccessFile.write("true".getBytes());
            else randomAccessFile.write("false".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
