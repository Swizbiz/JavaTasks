package com.javarush.task.task22.task2211;

import java.io.*;
import java.nio.charset.Charset;

/* 
Смена кодировки
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        try(BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(args[0]), "Windows-1251"));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(args[1]), "UTF-8"))){
            while (in.ready()){
                out.write(in.readLine());
            }
        }
    }
}
