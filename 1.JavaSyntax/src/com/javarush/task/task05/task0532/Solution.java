package com.javarush.task.task05.task0532;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;




/* 
Задача по алгоритмам
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;

        LinkedList ar = new LinkedList();

        //напишите тут ваш код
        int n = Integer.parseInt(reader.readLine());
//        int maximum = n;
        int n_0 = n;
        while (n > 0) {
            String s = reader.readLine();
            int b = Integer.parseInt(s);
            n--;

            ar.add(b);
//            if (maximum < b) maximum = b;
        }


        System.out.println(Collections.max(ar));
    }
}
