package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        ArrayList<String> st = new ArrayList<>();
        st.add("мама");
        st.add("мыла");
        st.add("раму");
        st.add(1, "именно");
        st.add(3, "именно");
        st.add(5, "именно");

        for (String s: st
             ) {
            System.out.println(s);
        }
    }
}
