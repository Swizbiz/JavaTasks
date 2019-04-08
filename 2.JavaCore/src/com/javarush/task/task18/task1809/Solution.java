package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.lang.System.in;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String fileName1 = br.readLine();
        String fileName2 = br.readLine();

        List<Integer> list = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(fileName1);
             FileOutputStream fos = new FileOutputStream(fileName2)) {
            while (fis.available() > 0) {
                byte[] buffer = new byte[fis.available()];
                list.add(fis.read());
            }
            Collections.reverse(list);
            for (int i :
                    list) {
                fos.write(i);
            }
        }
    }
}
