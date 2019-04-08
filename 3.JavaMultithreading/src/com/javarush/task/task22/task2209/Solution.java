package com.javarush.task.task22.task2209;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/*
Составить цепочку слов
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((System.in)));
        String fileName = bufferedReader.readLine();
        Stream<String> lines = Files.lines(Paths.get(fileName));
        String data = lines.collect(Collectors.joining(" "));

        String[] s = data.split(" ");

        StringBuilder result = getLine(s);
        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words) {
        StringBuilder sb = new StringBuilder();
        String[] w;
        if(words==null||words.length==0)return sb;
        else w = Arrays.copyOf(words, words.length);
        sb.append(w[0]);
        for (int j = 0; j < w.length; j++) {

            for (int i = 1; i < w.length; i++) {
                if(w[i].length()==0)continue;
                if(sb.toString().toLowerCase().charAt(0) == w[i].toLowerCase().charAt(w[i].length()-1)){
                    sb.insert(0, w[i] + " ");
                    w[i] = "";
                }
                else if(sb.toString().toLowerCase().charAt(sb.length()-1) == w[i].toLowerCase().charAt(0)){
                    sb.append(" " + w[i]);
                    w[i] = "";
                }
            }

        }
        return sb;
    }
}
