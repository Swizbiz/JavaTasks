package com.javarush.task.task06.task0602;

/* 
Пустые кошки, пустые псы
*/

public class Cat {
    protected void finalize() throws Throwable{
        System.out.println("A Cat was destroyed");
    }


    public static void main(String[] args) {

    }

    //напишите тут ваш код

}

class Dog {
    //напишите тут ваш код
    protected void finalize() throws Throwable{
        System.out.println("A Dog was destroyed");
    }
}
