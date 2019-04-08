package com.javarush.task.task14.task1419;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {

    static abstract class Bob{}
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код
//        try{ //2Array index is out of bounds
//            int a[]=new int[10];
//            //Array has only 10 elements
//            a[11] = 9;
//        }
//        catch(Exception e){
//            exceptions.add(e);
//        }
//
//        try{//3NumberFormat Exception
//            int num=Integer.parseInt ("XYZ") ;
//            System.out.println(num);
//        }catch(Exception e){
//            exceptions.add(e);
//        }
//
//        try{//4String index is out of bounds
//            String str="beginnersbook";
//            System.out.println(str.length());;
//            char c = str.charAt(0);
//            c = str.charAt(40);
//            System.out.println(c);
//        }catch(Exception e){
//            exceptions.add(e);
//        }
//
//        try{//5NullPointerException
//            String str=null;
//            System.out.println (str.length());
//        }
//        catch(Exception e){
//            exceptions.add(e);
//        }
//
//        try {//6NegativeArraySizeException
//            int a[]=new int[-10];
//        } catch (Exception e){
//            exceptions.add(e);
//        }
//
//
//        try {//8FileNotFoundException
//          FileInputStream fis = new FileInputStream("fileName");
//        }catch (Exception e) {
//            exceptions.add(e);
//        }

        exceptions.add(new java.io.FileNotFoundException());
        exceptions.add(new java.lang.ArrayIndexOutOfBoundsException());
        exceptions.add(new java.lang.IndexOutOfBoundsException());
        exceptions.add(new java.lang.NumberFormatException());
        exceptions.add(new java.lang.StringIndexOutOfBoundsException());
        exceptions.add(new java.io.InterruptedIOException() );
        exceptions.add(new java.io.EOFException() );
        exceptions.add(new java.lang.NegativeArraySizeException() );


        exceptions.add(new java.lang.NullPointerException() );






    }
}
