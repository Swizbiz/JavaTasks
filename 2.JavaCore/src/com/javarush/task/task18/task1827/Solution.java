package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution {
    public static void main(String[] args) throws Exception {
        String fileName = new Scanner(System.in).nextLine();
        AtomicInteger maxId = new AtomicInteger(0);
        Files.lines(Paths.get(fileName))
                .filter(value -> !value.isEmpty())
                .map(s -> s.substring(0, 8).trim())
                .mapToInt(Integer::parseInt)
                .max()
                .ifPresent(maxId::set);
        FileOutputStream outputStream = new FileOutputStream(fileName, true);
        if (args.length != 0 && args[0].equals("-c")) {
            outputStream.write(String.format("\n%-8s%-30s%-8s%-4s", maxId.incrementAndGet(), args[1], args[2], args[3]).getBytes());
        }
        new FileInputStream(fileName).close();
        outputStream.close();
    }
}
