package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(1d, "One");
        labels.put(2d, "2D");
        labels.put(3d, "3D");
        labels.put(4d, "4D");
        labels.put(5d, "Double de");
    }
    public static void main(String[] args) {
        System.out.println(labels);
    }
}
