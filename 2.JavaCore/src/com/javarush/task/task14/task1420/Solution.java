package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.util.Scanner;

public class Solution {

    public static int NoD(int a, int b){
        while (b != 0) {
            int tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a1 = Integer.parseInt(sc.next());
        if(a1 <= 0) throw new Exception();
        int a2 = Integer.parseInt(sc.next());
        if(a2 <= 0) throw new Exception();

        System.out.println(NoD(a1, a2));
    }
}
