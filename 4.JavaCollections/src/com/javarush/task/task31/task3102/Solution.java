 package com.javarush.task.task31.task3102;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

 /*
 Находим все файлы
 */
public class Solution {
    public static List<String> getFileTree(String root) throws IOException {
        List<String> list = Files.walk(Paths.get(root),Integer.MAX_VALUE).map(Path::toFile).filter(File::isFile).map(File::getAbsolutePath).collect(Collectors.toList());
        return list;

    }

    public static void main(String[] args) {
        try {
            System.out.println(getFileTree("C:\\11"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
