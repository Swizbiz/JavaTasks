package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();


        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");

        Date parsingDate;
        try {
            parsingDate = ft.parse(s);
            SimpleDateFormat sf = new SimpleDateFormat("MMM dd, yyyy", Locale.US);
            String str = sf.format(parsingDate);
            System.out.println(str.toUpperCase());
        }catch (ParseException e) {
            e.printStackTrace();
        }






    }
}
