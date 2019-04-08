package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут
    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        // implement step #5 here - реализуйте задание №5 тут
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String se = null;
        try {
            se = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if ((Planet.SUN).equals(se)) thePlanet = Sun.getInstance();
        else if ((Planet.MOON).equals(se)) thePlanet = Moon.getInstance();
        else if ((Planet.EARTH).equals(se)) thePlanet = Earth.getInstance();
        else thePlanet = null;
    }
}
