package com.javarush.task.task20.task2028;

import java.io.Serializable;
import java.util.*;

/* 
Построй дерево(1)
*/
public class CustomTree extends AbstractList<String> implements Cloneable, Serializable {
    Entry<String> root;
    private List<Entry<String>> entryList = new ArrayList<>();

    public CustomTree() {
        this.root = new Entry<>("0");
        entryList.add(root);
    }

    static class Entry<T> implements Serializable {
        String elementName;
        boolean availableToAddLeftChildren, availableToAddRightChildren;
        Entry<T> parent, leftChild, rightChild;

        public Entry(String elementName) {
            this.elementName = elementName;
            this.availableToAddLeftChildren = true;
            this.availableToAddRightChildren = true;
        }

        public boolean isAvailableToAddChildren() {
            return availableToAddLeftChildren | availableToAddRightChildren;
        }
    }

    @Override
    public boolean add(String s) {
        Entry<String> newEntry = new CustomTree.Entry<>(s);
        for (Entry<String> entry : entryList) {
            if (entry.isAvailableToAddChildren()) {
                if (entry.availableToAddLeftChildren) {
                    entry.availableToAddLeftChildren = false;
                    entry.leftChild = newEntry;
                    newEntry.parent = entry;
                } else if (entry.availableToAddRightChildren) {
                    entry.availableToAddRightChildren = false;
                    entry.rightChild = newEntry;
                    newEntry.parent = entry;
                }
                break;
            }
        }
        entryList.add(newEntry);
        return true;
    }

    public String getParent(String s) {
        String parent = null;
        for (Entry<String> entry : entryList) {
            if (entry.elementName.equals(s))
                parent = entry.parent.elementName;
        }
        return parent;
    }

    @Override
    public boolean addAll(int index, Collection<? extends String> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<String> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String remove(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void add(int index, String element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String set(int index, String element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String get(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int size() {
        return entryList.size() - 1;
    }
}
