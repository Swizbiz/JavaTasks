package com.javarush.task.task31.task3106;

import java.io.*;
import java.util.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/*
Разархивируем файл
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(args[0]);

        String[] fileNameParts = Arrays.stream(args).skip(1).sorted().toArray(String[]::new);

        Vector<InputStream> inputStreamVector = new Vector<>();

        for (String str : fileNameParts)
            inputStreamVector.add(new FileInputStream(str));

        try (ZipInputStream zipInputStream = new ZipInputStream(
                new SequenceInputStream(inputStreamVector.elements()))) {

            ZipEntry entry = zipInputStream.getNextEntry();

            streamTransfer(zipInputStream, fos);

            zipInputStream.closeEntry();
        }
        fos.close();
    }

    public static void streamTransfer(InputStream in, OutputStream out) throws IOException {
        byte[] buffer = new byte[1024];
        int countOfBytes;
        while ((countOfBytes = in.read(buffer)) > 0) {
            out.write(buffer, 0, countOfBytes);
            out.flush();
        }
    }
}
