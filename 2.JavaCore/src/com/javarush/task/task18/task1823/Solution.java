package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

import static java.lang.System.in;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String s = null;
        while (!(s = br.readLine()).equals("exit"))
            new ReadThread(s).start();

    }

    public static class ReadThread extends Thread {
        String fileName;

        @Override
        public void run() {

            try (FileInputStream fis = new FileInputStream(fileName)) {
                Map<Integer, Integer> map = new HashMap<>();
                while (fis.available() > 0){
                    int b = fis.read();
                    map.put(b, map.getOrDefault(b, 0) + 1);
                }
                int max = 0;
                int baite = 0;
                for (Map.Entry<Integer, Integer> entry :
                        map.entrySet()) {
                    int element = entry.getValue();
                    if (element > max) {
                        max = element;
                        baite = entry.getKey();
                    }
                }
                resultMap.put(fileName, baite);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public ReadThread(String fileName) {
            //implement constructor body
            super(fileName);
            this.fileName = fileName;
        }
        // implement file reading here - реализуйте чтение из файла тут

    }
}
