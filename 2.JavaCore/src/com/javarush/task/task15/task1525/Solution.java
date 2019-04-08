package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.in;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
        try {
            BufferedReader br = new BufferedReader(new FileReader(Statics.FILE_NAME));

            for (Object o : br.lines().toArray()) {
                lines.add(o.toString());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }



    public static void main(String[] args) {
        System.out.println(lines);
    }
}
