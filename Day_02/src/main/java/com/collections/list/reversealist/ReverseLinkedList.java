package com.collection.list.reversealist;

import java.util.LinkedList;

public class ReverseLinkedList {
    public static <T> LinkedList<T> reverse(LinkedList<T> list) {
        int n = list.size();
        for (int i = 0; i < n / 2; i++) {
            T temp = list.get(i);
            list.set(i, list.get(n - 1 - i));
            list.set(n - 1 - i, temp);
        }
        return list;
    }
}
