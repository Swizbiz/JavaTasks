package com.javarush.task.task18.task1813;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream{
    private FileOutputStream wraped;
    public static String fileName = "C:/tmp/result.txt";

    public AmigoOutputStream(FileOutputStream fileOutputStream) throws FileNotFoundException {
        super(fileName);
        this.wraped = fileOutputStream;
    }

    @Override
    public void write(int b) throws IOException {
        wraped.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        wraped.write(b);
    }

    @Override
    public void flush() throws IOException {
        wraped.flush();
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        wraped.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        wraped.flush();
        wraped.write("JavaRush © All rights reserved.".getBytes());
        wraped.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}
