package com.javarush.task.task25.task2515;

import java.util.Arrays;

public class Canvas {
    private int width;
    private int height;
    private char[][] matrix;

    public Canvas(int width, int height) {
        this.width = width;
        this.height = height;
        this.matrix = new char[height][width];
    }

    public void clear() {
        for (int i = 0; i < matrix.length; i++) {
            Arrays.fill(matrix[i], ' ');
        }
    }

    public void print() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }

    public void setPoint(double x, double y, char c) {
        if (x < 0 || y < 0 || y >= matrix[0].length || x >= matrix[0].length)
            return;
        int roundX = (int) Math.round(x);
        int roundY = (int) Math.round(y);
        matrix[roundY][roundX] = c;
    }

    public void drawMatrix(double x, double y, int[][] matrix, char c) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] != 0)
                    setPoint(x + j, y + i, c);
            }
        }
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public char[][] getMatrix() {
        return matrix;
    }
}
