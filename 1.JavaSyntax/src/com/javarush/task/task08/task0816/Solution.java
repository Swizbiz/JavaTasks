package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));

        //напишите тут ваш код
        map.put("brown", df.parse("AUGUST 1 1980"));
        map.put("dark", df.parse("JULY 1 1980"));
        map.put("gray", df.parse("SEPTEMBER 1 1980"));
        map.put("green", df.parse("NOVEMBER 1 1980"));
        map.put("white", df.parse("DECEMBER 1 1980"));
        map.put("red", df.parse("JANUARY 1 1980"));
        map.put("hah", df.parse("MAY 1 1980"));
        map.put("hole", df.parse("APRIL 1 1980"));
        map.put("lol", df.parse("MARCH 1 1980"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код


        for (Map.Entry<String, Date> stringDateEntry : map.entrySet()) {
            map.entrySet().removeIf(entry -> entry.getValue().getMonth() == 5 ||
                            entry.getValue().getMonth() == 6 || entry.getValue().getMonth() == 7);
        }


    }

    public static void main(String[] args) {

    }
}
