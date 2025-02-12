package com.collections.list.findfrequencyofelements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountingFrequency {
    public static <T> Map<T, Integer> count(ArrayList<T> list) {
        Map<T, Integer> map = new HashMap<>();
        for (T element : list) {
            map.put(element, map.getOrDefault(element.toString(), 0) + 1);
        }
        return map;
    }
}
