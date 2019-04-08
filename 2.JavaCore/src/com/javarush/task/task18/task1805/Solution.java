package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.SortedSet;
import java.util.TreeSet;

import static java.lang.System.in;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String fileName = br.readLine();

        SortedSet<Integer> set = new TreeSet<>();
        try (FileInputStream fis = new FileInputStream(fileName)){
            while (fis.available() > 0){
                set.add(fis.read());
            }
        }
        set.stream().forEachOrdered(x -> System.out.print(x+ " "));

    }
}
