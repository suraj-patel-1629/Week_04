package com.collections.list.reversealist;

import java.util.ArrayList;
import java.util.List;

public class ReverseArrayList {
    public static <T> List<T> reverse(List<T> list) {
        int n = list.size();
        for (int i = 0; i < n / 2; i++) {
            T temp = list.get(i);
            list.set(i, list.get(n - 1 - i));
            list.set(n - 1 - i, temp);
        }
        return list;
    }
}
