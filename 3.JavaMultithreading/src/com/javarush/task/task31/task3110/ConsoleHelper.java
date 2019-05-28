package com.javarush.task.task31.task3110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class ConsoleHelper {
    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readString() throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
            return br.readLine();
        }
    }

    public static int readInt() throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
            return Integer.parseInt(br.readLine());
        }
    }
}
