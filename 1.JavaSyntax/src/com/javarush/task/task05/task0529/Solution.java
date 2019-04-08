package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        while (true)
        {
            String s = buffer.readLine();

            if (s.equals("сумма")){

                System.out.println(a);
                break;}
                else
            {int b = Integer.parseInt(s);
            a += b;}
        }
//        System.out.println(a);
    }
}
