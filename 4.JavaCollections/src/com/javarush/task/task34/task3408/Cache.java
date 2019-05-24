package com.javarush.task.task34.task3408;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.WeakHashMap;

public class Cache<K, V> {
    private Map<K, V> cache = new WeakHashMap<>();

    public V getByKey(K key, Class<V> clazz) throws Exception {
        Object obj = cache.get(key);
        if (obj == null) {
           Constructor constructor = clazz.getConstructor(key.getClass());
           Object newObj = constructor.newInstance(key);
           put((V) newObj);
           return (V) newObj;
        }
        return (V) obj;
    }

    public boolean put(V obj) {
        try {
            Class clazz = Class.forName(obj.getClass().getName());
            Method method = clazz.getDeclaredMethod("getKey");
            method.setAccessible(true);
            cache.put((K) method.invoke(obj), obj);
            return true;
        } catch (Exception ignore){
            return false;
        }
    }

    public int size() {
        return cache.size();
    }
}
