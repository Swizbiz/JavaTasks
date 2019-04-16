package com.javarush.task.task27.task2707;

/* 
Определяем порядок захвата монитора
*/
public class Solution {
    public void someMethodWithSynchronizedBlocks(Object obj1, Object obj2) {
        synchronized (obj1) {
            synchronized (obj2) {
                System.out.println(obj1 + " " + obj2);
            }
        }
    }

    public static boolean isLockOrderNormal(final Solution solution, final Object obj1, final Object obj2) throws Exception {
        Thread thread1 = new Thread(() -> {
            synchronized (obj1){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (obj2){
                    System.out.println("true");
                }
            }
        });
        Thread thread2 = new Thread(() ->solution.someMethodWithSynchronizedBlocks(obj1, obj2));
        thread1.start();
        Thread.sleep(50);
        thread2.start();
        Thread.sleep(2000);

        return !(thread2.getState() == Thread.State.BLOCKED);

    }

    public static void main(String[] args) throws Exception {
        final Solution solution = new Solution();
        final Object o1 = new Object();
        final Object o2 = new Object();

        System.out.println(isLockOrderNormal(solution, o1, o2));
    }
}
