package com.javarush.task.task18.task1815;

import java.util.List;

/* 
Таблица
*/

public class Solution {
    public class TableInterfaceWrapper implements TableInterface{
        private TableInterface wraped;
        String stroka;

        public TableInterfaceWrapper(TableInterface wraped) {
            this.wraped = wraped;
        }

        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());
            wraped.setModel(rows);
        }

        @Override
        public String getHeaderText() {
            return wraped.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            wraped.setHeaderText(newHeaderText);
        }
    }

    public interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}