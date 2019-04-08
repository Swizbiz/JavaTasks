package com.javarush.task.task22.task2207;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.System.in;

/* 
Обращенные слова
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file=reader.readLine();
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader br = new BufferedReader (new FileReader(file));
        String line;
        int count=0;
        while(( line = br.readLine()) != null){

            String d[]=line.split(" +");
            for(int i=0;i<d.length;i++){
                if (count ==0 && i==0){
                    count++;
                }
                list.add(d[i]);
            }
        }

        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                StringBuilder s= new StringBuilder(list.get(j));
                s=s.reverse();
                String ss=s.toString();
                if (list.get(i).equals(ss)){
                    Pair pair = new Pair();
                    pair.first=list.get(i);
                    pair.second=list.get(j);
                    if(list.size()>0)list.remove(i);else break;
                    if(list.size()>0) list.remove(j-1);else break;
                    i--;
                    result.add(pair);
                    break;
                }
            }
        }

        for(int i=0;i<result.size();i++){
            System.out.println(result.get(i));
        }
    }

    public static class Pair {
        String first;
        String second;

        public Pair(String first, String second) {
            this.first = first;
            this.second = second;
        }

        public Pair() {
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                    first == null && second != null ? second :
                    second == null && first != null ? first :
                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
