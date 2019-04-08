package com.javarush.task.task22.task2210;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/*
StringTokenizer
*/
public class Solution {
    public static void main(String[] args) {
    }
    public static String [] getTokens(String query, String delimiter) {
        String[] strings = new String[0];
        List<String> stringList = new ArrayList<>();
        StringTokenizer stringTokenizer = new StringTokenizer(query, delimiter);
        while (stringTokenizer.hasMoreTokens()){
            stringList.add(stringTokenizer.nextToken());
        }
        return stringList.toArray(strings);
    }
}
