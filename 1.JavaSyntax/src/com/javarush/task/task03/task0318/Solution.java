package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        System.out.print("Введите имя: ");
        String sAge = bufferedReader.readLine();
//        System.out.print("Введите цифру: ");
        String name = bufferedReader.readLine();
//        int nAge = Integer.parseInt(sAge);
        System.out.println(name + " захватит мир через " + sAge + " лет. Му-ха-ха!");
    }
}
