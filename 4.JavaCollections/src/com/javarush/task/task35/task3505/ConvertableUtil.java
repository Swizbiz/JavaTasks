package com.javarush.task.task35.task3505;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertableUtil {

    public static <K, V> Map convert(List<? extends Convertable<V>> list) {
        Map<K, V> result = new HashMap<>();
        for (Convertable<V> value : list) {
            result.put((K) value.getKey(), (V) value);
        }
        return result;
    }
}
