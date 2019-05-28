package com.javarush.task.task31.task3110;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.Paths;

import static java.lang.System.in;

public class Archiver {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
            System.out.println("Введите путь к архиву");
            String zipFilePath = br.readLine();
            ZipFileManager zipFileManager = new ZipFileManager(Paths.get(zipFilePath));

            System.out.println("Введите путь к файлу, который нужно заархивировать");
            String file = br.readLine();
            zipFileManager.createZip(Paths.get(file));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
