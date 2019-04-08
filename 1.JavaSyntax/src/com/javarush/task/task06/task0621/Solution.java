package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String dedName = reader.readLine();
        Cat ded = new Cat(dedName, null, null);

        String babkaName = reader.readLine();
        Cat babka = new Cat(babkaName, null, null);

        String batyaName = reader.readLine();
        Cat batya = new Cat(batyaName, null, ded);

        String motherName = reader.readLine();
        Cat mamka = new Cat(motherName, babka, null);

        String sName = reader.readLine();
        Cat son = new Cat(sName, mamka, batya);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, mamka, batya);

        System.out.println(ded);
        System.out.println(babka);
        System.out.println(batya);
        System.out.println(mamka);
        System.out.println(son);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString() {
            String fatherName = this.father == null ? "no father" : "father is " + this.father.name;
            String motherName = this.mother == null ? "no mother" : "mother is " + this.mother.name;
            return "The cat's name is " + this.name + ", " + motherName + ", " + fatherName;
        }
    }

}
