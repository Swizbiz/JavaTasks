package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        ArrayList<Integer> ar = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        while (true){

            try {
                int a = sc.nextInt();
                ar.add(a);
            } catch (Exception e) {
                for (int i = 0; i < ar.size(); i++) {
                    System.out.println(ar.get(i));
                }
                break;
            }


        }
    }
}
