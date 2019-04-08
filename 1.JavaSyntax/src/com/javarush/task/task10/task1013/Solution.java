package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String name;
        private String lastName;
        private int age;
        private char sex;
        private int high;
        private boolean smoke;

        public Human(){}
        public Human(String name){}
        public Human(String name, int age){}
        public Human(String name, char sex){}
        public Human(String name, boolean smoke){}
        public Human(String name, String lastName){}
        public Human(String name, String lastName, int age){}
        public Human(String name, String lastName, int age, char sex){}
        public Human(String name, String lastName, int age, char sex, int high){}
        public Human(String name, String lastName, int age, char sex, int high, boolean smoke){}

    }
}
