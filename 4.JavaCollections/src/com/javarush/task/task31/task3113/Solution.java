package com.javarush.task.task31.task3113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

import static java.lang.System.in;

/* 
Что внутри папки?
*/
public class Solution {
    static long totalFolders;
    static long totalFiles;
    static long totalSize;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
            Path path = Paths.get(br.readLine());
            if (!Files.isDirectory(path)) {
                System.out.println(path.toString() + " - не папка");
                return;
            }
            Files.walkFileTree(path, new MyFileVisitor());
            totalFolders--;
            System.out.println("Всего папок - " + totalFolders);
            System.out.println("Всего файлов - " + totalFiles);
            System.out.println("Общий размер - " + totalSize);
        }
    }

    static class MyFileVisitor extends SimpleFileVisitor<Path> {
        public FileVisitResult visitFile(Path path,
                                         BasicFileAttributes fileAttributes) {
            totalFiles++;
            totalSize += fileAttributes.size();
            return FileVisitResult.CONTINUE;
        }

        public FileVisitResult preVisitDirectory(Path path,
                                                 BasicFileAttributes fileAttributes) {
            totalFolders++;
            totalSize += fileAttributes.size();
            return FileVisitResult.CONTINUE;
        }
    }
}
