package com.javarush.task.task36.task3605;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Set;
import java.util.TreeSet;

/* 
Использование TreeSet
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        Set<Character> treeSet = new TreeSet<>();
        Files.lines(Paths.get(args[0]))
                .map(String::toLowerCase)
                .forEach(s -> s.chars()
                        .mapToObj(i -> (char) i)
                        .filter(character -> character > 96 && character < 123)
                        .forEach(treeSet::add));
        treeSet.stream()
                .limit(5)
                .forEach(System.out::print);
    }
}
