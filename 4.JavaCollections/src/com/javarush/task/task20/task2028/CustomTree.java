package com.javarush.task.task20.task2028;

import java.io.Serializable;
import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

/* 
Построй дерево(1)
*/
public class CustomTree extends AbstractList<String> implements Cloneable, Serializable {
    Entry<String> root;
    private ConcurrentLinkedQueue<Entry<String>> queue = new ConcurrentLinkedQueue<>();

    @Override
    public boolean remove(Object o) {
        if (!(o instanceof String))
            throw new UnsupportedOperationException();
        for (Entry<String> entry : queue) {
            if (o.equals(entry.elementName)) {
                if (entry.equals(entry.parent.leftChild))
                    entry.parent.leftChild = null;
                else if (entry.equals(entry.parent.rightChild))
                    entry.parent.rightChild = null;
                if (!entry.parent.isAvailableToAddChildren() && entry.parent.leftChild == null || entry.parent.rightChild == null) {
                    entry.parent.availableToAddLeftChildren = true;
                    entry.parent.availableToAddRightChildren = true;
                }
                if (entry.leftChild != null)
                    remove(entry.leftChild.elementName);
                entry.leftChild = null;
                if (entry.rightChild != null)
                    remove(entry.rightChild.elementName);
                entry.rightChild = null;
                queue.remove(entry);
                break;
            }
        }
        return true;
    }

    public CustomTree() {
        this.root = new Entry<>("0");
        queue.add(root);
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
        for (Entry<String> entry : queue) {
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
        queue.add(newEntry);
        return true;
    }

    public String getParent(String s) {
        String parent = null;
        for (Entry<String> entry : queue) {
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
        return queue.size() - 1;
    }
}
