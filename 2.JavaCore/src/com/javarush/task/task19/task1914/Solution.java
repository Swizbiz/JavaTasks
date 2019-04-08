package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream original = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        PrintStream myPrinter = new PrintStream(buffer);
        System.setOut(myPrinter);
        testString.printSomething();
        String[] strings = buffer.toString().split(" ");
        Integer i1 = Integer.parseInt(strings[0]);
        Integer i2 = Integer.parseInt(strings[2]);
        Integer answer = null;
        if (strings[1].equals("+")) answer = i1 + i2;
        else if (strings[1].equals("-")) answer = i1 - i2;
        else if (strings[1].equals("*")) answer = i1 * i2;
        System.setOut(original);
        System.out.printf("%d %s %d = %d", i1, strings[1], i2, answer);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

