package com.javarush.task.task27.task2705;

/* 
Второй вариант deadlock
*/
public class Solution {
    private final Object lock = new Object();

    public synchronized void firstMethod() {
        synchronized (lock) {
            doSomething();
        }
    }

    public void secondMethod() {
        synchronized (lock){
            synchronized (this) {
                doSomething();
            }
        }
    }

    private void doSomething() {
        System.out.println(this.getClass());
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        new Thread(() -> {
            solution.firstMethod();
            solution.secondMethod();
        }).start();
        new Thread(() -> {
            solution.firstMethod();
            solution.secondMethod();
        }).start();

    }
}