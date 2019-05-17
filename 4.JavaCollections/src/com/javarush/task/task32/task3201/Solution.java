package com.javarush.task.task32.task3201;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
Запись в существующий файл
*/
public class Solution {
    public static void main(String... args) {
        try {
            Path fileName = Paths.get(args[0]);
            RandomAccessFile randomAccessFile = new RandomAccessFile(fileName.toFile(), "rw");
            if (randomAccessFile.length() < Integer.parseInt(args[1]))
                randomAccessFile.seek(randomAccessFile.length());
            else
                randomAccessFile.seek(Integer.valueOf(args[1]));
            randomAccessFile.write(args[2].getBytes());
            randomAccessFile.close();
        } catch (IOException ignore) {
        }
    }
}
