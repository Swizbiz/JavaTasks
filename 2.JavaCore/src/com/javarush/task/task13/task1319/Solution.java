package com.javarush.task.task13.task1319;

import java.io.*;

import static java.lang.System.in;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();


        try {
            File file = new File(s);

            FileWriter fileReader = new FileWriter(file); // поток который подключается к текстовому файлу
            BufferedWriter bufferedWriter = new BufferedWriter(fileReader); // соединяем FileWriter с BufferedWitter

            String line;
            while(!(line = br.readLine()).equals("exit")) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.write("exit");

            br.close(); // закрываем поток
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
