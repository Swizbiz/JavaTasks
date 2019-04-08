package com.javarush.task.task22.task2208;

import java.util.HashMap;
import java.util.Map;

/* 
Формируем WHERE
*/
public class Solution {
    public static void main(String[] args) {
        Map<String, String> strings = new HashMap<>();
        strings.put("age", null);
        strings.put("name", null);
        strings.put("city", "Kiev");

        System.out.println(getQuery(strings));
    }
    public static String getQuery(Map<String, String> params) {
        StringBuilder sb = new StringBuilder();
        params.entrySet().stream()
                .filter(pair ->
                        pair.getKey() != null
                                &&  pair.getValue() != null
                                && !pair.getKey().isEmpty()
                                && !pair.getValue().isEmpty()
                ).forEach(pair ->
                sb.append(pair.getKey())
                        .append(" = '")
                        .append(pair.getValue())
                        .append("' and ")
        );
        int len = sb.length();
        sb.setLength(len > 4 ? len-5 : 0);
        return sb.toString();
    }
}
