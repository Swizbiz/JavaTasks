package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.Scanner;

import static java.lang.System.in;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader RD = new BufferedReader(new InputStreamReader(System.in));
        String r = RD.readLine();
        String t = RD.readLine();
        FileInputStream f2 = new FileInputStream(r);
        FileOutputStream f1 = new FileOutputStream(t);
        RD.close();
        PrintWriter pw = new PrintWriter(t);
        byte[] b = new byte[f2.available()];

        while (f2.available() > 0) {
            f2.read(b);}

        String s = new String(b, "US-ASCII");
        String[] d = s.split(" ");

        for (int i = 0; i < d.length; i++) {
            float a = Float.parseFloat(d[i]);
            int y = Math.round(a);
            pw.print(y +" ");
        }
        f1.close();
        f2.close();
        pw.close();

    }
}
