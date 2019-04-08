package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

import static java.lang.System.in;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream (reader.readLine())));
        reader.close();

        ArrayList<Integer> numbers = new ArrayList<>();

        String x;


        while ((x = fileReader.readLine()) != null){
            numbers.add(Integer.parseInt(x));
        }

        fileReader.close();
        Collections.sort(numbers);

        for (Integer n: numbers){
            if (Math.abs(n)%2==0)
                System.out.println(n);
        }
    }
}
