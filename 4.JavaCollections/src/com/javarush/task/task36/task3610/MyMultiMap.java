package com.javarush.task.task36.task3610;

import java.io.Serializable;
import java.util.*;

public class MyMultiMap<K, V> extends HashMap<K, V> implements Cloneable, Serializable {
    static final long serialVersionUID = 123456789L;
    private HashMap<K, List<V>> map;
    private int repeatCount;

    public MyMultiMap(int repeatCount) {
        this.repeatCount = repeatCount;
        map = new HashMap<>();
    }

    @Override
    public int size() {
        return values().size();
    }

    @Override
    public V put(K key, V value) {
        V obj = null;
        if (containsKey(key)) {
            List<V> list = map.get(key);
            if (list.size() == repeatCount)
                list.remove(0);
            obj = list.get(list.size() - 1);
            list.add(value);
        } else {
            map.put(key, new ArrayList<>(Arrays.asList(value)));
        }
        return obj;
    }

    @Override
    public V remove(Object key) {
        V obj = null;
        if (containsKey(key)) {
            List<V> list = map.get(key);
            obj = list.remove(0);
            if (list.size() == 0)
                map.remove(key);
        }
        return obj;
    }

    @Override
    public Set<K> keySet() {
        return map.keySet();
    }

    @Override
    public Collection<V> values() {
        Collection<V> collection = new ArrayList<>();
        for (List<V> list : map.values()) {
            collection.addAll(list);
        }
        return collection;
    }

    @Override
    public boolean containsKey(Object key) {
        return map.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return values().contains(value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for (Map.Entry<K, List<V>> entry : map.entrySet()) {
            sb.append(entry.getKey());
            sb.append("=");
            for (V v : entry.getValue()) {
                sb.append(v);
                sb.append(", ");
            }
        }
        String substring = sb.substring(0, sb.length() - 2);
        return substring + "}";
    }
}