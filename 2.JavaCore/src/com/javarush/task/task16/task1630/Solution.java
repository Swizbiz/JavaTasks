package com.javarush.task.task16.task1630;

import java.io.*;
import java.util.ArrayList;

import static java.lang.System.in;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //add your code here - добавьте код тут
    static {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        try {
            firstFileName = br.readLine();
            secondFileName = br.readLine();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        //add your code here - добавьте код тут
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface extends Runnable{

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут
    public static class ReadFileThread extends Thread implements ReadFileInterface{

        ArrayList<String> str = new ArrayList<>();
        String fullFileName;
        String filecontent ="";

        @Override
        public void setFileName(String fullFileName) {
            this.fullFileName = fullFileName;
        }

        @Override
        public String getFileContent() {
            return filecontent;
        }


        @Override
        public void run() {
            try {
                BufferedReader reader = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(fullFileName)));
                String line;
                while (reader.ready()) // пока в reader'е есть что читать
                {
                    filecontent += reader.readLine() + " "; // дописываем строку к filecontent и + пробел
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
