package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int a = sc.nextInt();

        while (a>0){
            System.out.println(s);
            a -= 1;
        }

    }
}
