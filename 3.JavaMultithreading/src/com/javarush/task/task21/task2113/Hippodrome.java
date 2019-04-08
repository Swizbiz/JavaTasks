package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses;
    static Hippodrome game;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public Horse getWinner(){
        double maxDistance = 0.0;
        double dist;
        Horse hors = null;
        for (Horse horse :
                horses) {
            if ((dist = horse.getDistance()) > maxDistance) {
                maxDistance = dist;
                hors = horse;
            }
        }
        return hors;
    }
    public void printWinner(){
        System.out.println("Winner is " + getWinner().getName() +"!");
    }

    public void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }
    public void move(){
        horses.forEach(Horse::move);
    }
    public void print(){
        horses.forEach(Horse::print);
//        for (int i = 0; i < 10; i++) {
//            System.out.println();
//        }
    }

    public static void main(String[] args) throws InterruptedException {
        Horse horse1 = new Horse("horse1", 3.0, 0.0);
        Horse horse2 = new Horse("horse2", 3.0, 0.0);
        Horse horse3 = new Horse("horse3", 3.0, 0.0);
        List<Horse> horseList = new ArrayList<>();
        horseList.add(horse1);
        horseList.add(horse2);
        horseList.add(horse3);
        Hippodrome.game = new Hippodrome(horseList);
        game.run();
        game.printWinner();
    }
}
