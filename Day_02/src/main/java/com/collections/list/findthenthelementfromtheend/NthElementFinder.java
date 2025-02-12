package com.collections.list.findthenthelementfromtheend;

import java.util.LinkedList;
import java.util.ListIterator;

public class NthElementFinder {
    public static String findNthFromEnd(LinkedList<String> list, int n) {
        if (list == null || list.isEmpty() || n <= 0) {
            return null;
        }

        ListIterator<String> first = list.listIterator();
        ListIterator<String> second = list.listIterator();

        // Moving the first iterator `n` steps ahead
        for (int i = 0; i < n; i++) {
            if (first.hasNext()) {
                first.next();
            } else {
                return null;
            }
        }

        // Moving both iterators until the first reaches the end
        while (first.hasNext()) {
            first.next();
            second.next();
        }

        // The second iterator now pointing to the Nth element from the end
        return second.next();
    }
}
