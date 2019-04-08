package com.javarush.task.task19.task1915;

/* 
Дублируем текст
*/

import java.io.*;

import static java.lang.System.in;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        PrintStream original = System.out;
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String fileName = br.readLine();
        br.close();
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        PrintStream myPrinter = new PrintStream(buffer);
        System.setOut(myPrinter);
        testString.printSomething();
        try (FileOutputStream fos = new FileOutputStream(fileName)){
            fos.write(buffer.toByteArray());
        }

        System.setOut(original);
        System.out.println(buffer.toString());

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

