package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> as = new ArrayList<>();
        String s2 = "2";
        String s3 = "3";
        String s4 = "4";
        String s5 = "5";

        as.set(0, "12");
        as.add(s2);
        as.add(s3);
        as.add(s4);
        as.add(s5);
        System.out.println(as.size());

        for (String ars : as
             ) {
            System.out.println(ars);
        }
    }
}
