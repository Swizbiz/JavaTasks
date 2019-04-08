package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> str = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            String s = bufferedReader.readLine();
            str.add(s);
        }

        for (int i = 1; i < str.size(); i++) {

            if (str.get(i).length() < str.get(i-1).length()){
                System.out.println(i);

            break;}
        }
    }
}

