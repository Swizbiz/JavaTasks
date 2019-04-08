package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> ar = new ArrayList<>();
        ArrayList<Integer> ar3 = new ArrayList<>();
        ArrayList<Integer> ar2 = new ArrayList<>();
        ArrayList<Integer> aro = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            ar.add(sc.nextInt());
        }

        for (int i = 0; i < ar.size(); i++) {
            int a = ar.get(i);
            if (a%3 == 0) ar3.add(a);
        }
        for (int i = 0; i < ar.size(); i++) {
            int a = ar.get(i);
            if (a%2 == 0) ar2.add(a);
        }
        for (int i = 0; i < ar.size(); i++) {
            int a = ar.get(i);
            if ((a%2 != 0) && (a%3 != 0)) aro.add(a);
        }

        printList(ar3);
        printList(ar2);
        printList(aro);
    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (int e : list
             ) {
            System.out.println(e);
        }
    }
}
