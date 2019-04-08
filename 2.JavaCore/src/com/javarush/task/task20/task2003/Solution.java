package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static java.lang.System.in;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws Exception {
        //implement this method - реализуйте этот метод
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String fileName = br.readLine();
        br.close();
        try (FileInputStream fis = new FileInputStream(fileName)){
            load(fis);
            new Properties().putAll(properties);
        }
    }

    public void save(OutputStream outputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties p = new Properties();
        properties.forEach(p::setProperty);
        p.store(outputStream, null);
        outputStream.close();
    }

    public void load(InputStream inputStream) throws Exception {
        //implement this method - реализуйте этот метод
        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))){
            Properties property = new Properties();
                    property.load(inputStream);

            for (String name : property.stringPropertyNames()) {
                properties.put(name, property.getProperty(name));
            }        }
    }

    public static void main(String[] args) {

    }
}
