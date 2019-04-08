package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        while (true){
            FileInputStream fis = new FileInputStream(br.readLine());
            byte[] buffer = new byte[fis.available()];
            if (fis.read(buffer) < 1000){
                fis.close();
                br.close();
                throw new DownloadException();
            }
        }
    }

    public static class DownloadException extends Exception {

    }
}
