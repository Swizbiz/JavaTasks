package com.javarush.task.task36.task3602;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Collections;

/* 
Найти класс по описанию
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getExpectedClass());
    }

    public static Class getExpectedClass() {
        Class returnedClass = null;
        Class<?>[] clazz = Collections.class.getDeclaredClasses();
        for (Class cls : clazz) {
            for (Constructor constructor : cls.getDeclaredConstructors()) {
                if (constructor.getParameterCount() == 0) {
                    try {
                        if (cls.getDeclaredMethod("get", int.class) != null) {
                            returnedClass = cls;
                        }
                    } catch (NoSuchMethodException ignored) {
                    }
                }
            }
        }
        return returnedClass;
    }
}
