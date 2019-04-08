package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int numSeconds = 4;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //add your code here - добавь код тут
        try {
            Thread.sleep(3500);
            clock.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            //add your code here - добавь код тут
            while (numSeconds > 0){
                try {
                    System.out.print(numSeconds + " ");
                    numSeconds--;
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.print("Прервано!");
                    return;
                }
            }
            System.out.print("Марш!");
        }
    }
}
