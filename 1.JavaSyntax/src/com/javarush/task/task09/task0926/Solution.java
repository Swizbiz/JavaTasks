package com.javarush.task.task09.task0926;

import java.util.ArrayList;
import java.util.Random;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static void forere(int[] size){
        for (int i = 0; i < size.length; i++) {
            size[i] = (int)(Math.random()*10);
        }

    }
    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> ar = new ArrayList<>();
        int[] a1 = new int[5];
        int[] a2 = new int[2];
        int[] a3 = new int[4];
        int[] a4 = new int[7];
        int[] a5 = new int[0];
        forere(a1);
        forere(a2);
        forere(a3);
        forere(a4);
        forere(a5);
        ar.add(a1);
        ar.add(a2);
        ar.add(a3);
        ar.add(a4);
        ar.add(a5);
        return ar;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
