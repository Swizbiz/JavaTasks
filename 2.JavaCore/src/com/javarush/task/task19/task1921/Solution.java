package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        Map<String, Double> map = new TreeMap<>();
        String[] strings;
        try (BufferedReader br = new BufferedReader(new FileReader(args[0]))){
            while (br.ready()){
                String s = br.readLine();
                String name = s.replaceAll("\\d", "").trim();
                String date = s.substring(name.length());
                DateFormat format = new SimpleDateFormat("dd MM yyyy");
                Date data = format.parse(date);
                PEOPLE.add(new Person(name, data));
            }
        }
    }
}
