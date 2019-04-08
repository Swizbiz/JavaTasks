package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(scanner.nextInt());
        }
        int x = 1;
        int r = 1;
        for (int i=0; i<list.size()-1;i++)
        {
            if ((list.get(i)).equals((list.get(i + 1))))
            {
                x++;
                if (r < x)
                    r = x;
            }
            else
                x = 1;
        }
        System.out.println(r);


}}