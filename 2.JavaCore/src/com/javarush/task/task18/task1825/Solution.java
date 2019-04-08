package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

import static java.lang.System.in;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        List<String> partsOfFile = new ArrayList<>();
        String fileName = br.readLine();
        while (!fileName.equals("end")){
            partsOfFile.add(fileName);
            fileName = br.readLine();
        }
        Collections.sort(partsOfFile);
        FileOutputStream fos = new FileOutputStream(partsOfFile.get(0).split(".part")[0]);
        for (String s :
                partsOfFile) {
            try (FileInputStream fis = new FileInputStream(s)){
                byte[] buffer = new byte[fis.available()];
                int size = fis.read(buffer);
                fos.write(buffer);
            }

        }
        fos.close();
        br.close();
    }
}
