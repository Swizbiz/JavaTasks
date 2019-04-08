package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new BackThread());
        threads.add(new ClackThread());
        threads.add(new ClickThread());
        threads.add(new SlowThread());
        threads.add(new BlowThread());
        // do the same for all others
    }

    public static void main(String[] args) {
        BackThread thread1 = new BackThread();
        ClackThread thread2 = new ClackThread();
        ClickThread thread3 = new ClickThread();
        SlowThread thread4 = new SlowThread();
        BlowThread thread5 = new BlowThread();

    }

    private static class BackThread extends Thread{
        @Override
        public void run() {
            while (true) {
            }
        }
    }

    private static class ClackThread extends Thread{
        @Override
        public void run() {
            while (true){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println("InterruptedException");
                }
            }
        }
    }

    private static class ClickThread extends Thread{
        @Override
        public void run() {
            while (true) {
                System.out.println("Ура");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static class SlowThread extends Thread implements Message{
        @Override
        public void run() {
            while (!this.isInterrupted()){
            }
        }
        @Override
        public void showWarning() {
            this.interrupt();
        }
    }

    private static class BlowThread extends Thread{
        public void run() {
            BufferedReader cbr = new BufferedReader(new InputStreamReader(System.in));
            try {
                int sum = 0;
                // По какой-то причине while (cbr.ready()) { ... } не работает.
                while (!isInterrupted()) { // throws IOException
                    String line = cbr.readLine();
                    if (line.equals("N")) {
                        break;
                    }
                    try {
                        Integer n = Integer.parseInt(line);
                        sum += n;
                    } catch (NumberFormatException e) {
                        // Ну и фиг с ним, не число и ладно, пропустим.
                    }
                }
                System.out.println(sum);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}