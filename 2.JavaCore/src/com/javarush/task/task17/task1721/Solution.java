package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.in;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        boolean isEmpty = false;
        boolean isEmpty2 = false;
        BufferedReader bufred = new BufferedReader(new InputStreamReader(in));
        String fileName1 = bufred.readLine();
        String fileName2 = bufred.readLine();

        read(fileName1, allLines);
        read(fileName2, forRemoveLines);

        Solution sol = new Solution();
        sol.joinData();
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) allLines.removeAll(forRemoveLines);
        else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }

    public static void read(String fileName, List list) throws IOException {
        FileInputStream fstream = new FileInputStream(fileName);
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
        String strLine;
        while ((strLine = br.readLine()) != null){
            list.add(strLine);
        }
        br.close();
        fstream.close();
    }
}
