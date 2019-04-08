package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream(args[0]);
        int count = 0;
        String result = "";

        while (fin.available() > 0) {
            result += (char) fin.read();
        }
        fin.close();

        Pattern pat = Pattern.compile("[a-zA-z]");
        Matcher mat = pat.matcher(result);
        while (mat.find()) {
            count++;
        }
        System.out.println(count);
    }
}
