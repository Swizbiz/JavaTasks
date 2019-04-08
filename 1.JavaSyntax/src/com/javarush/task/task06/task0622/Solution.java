package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        ArrayList<Integer> ar = new ArrayList();
        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            int a = Integer.parseInt(s);
            ar.add(a);
        }

        ar.sort(Integer::compareTo);

        for (Integer e : ar
             ) {
            System.out.println(e);
        }
    }
}
