package com.javarush.task.task24.task2401;

public class SelfInterfaceMarkerImpl implements SelfInterfaceMarker {

    public void printClass(){
        System.out.println(getClass().toString());
    }
    public void print(){
        System.out.println("Hello world!");
    }
}
