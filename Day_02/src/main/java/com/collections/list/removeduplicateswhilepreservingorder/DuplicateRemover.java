package com.collections.list.removeduplicateswhilepreservingorder;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateRemover {
    public static List<Integer> removeDuplicates(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return list;
        }

        Set<Integer> seen = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (Integer num : list) {
            // Adding if it is not already in the set
            if (seen.add(num)) {
                result.add(num);
            }
        }

        return result;
    }
}
