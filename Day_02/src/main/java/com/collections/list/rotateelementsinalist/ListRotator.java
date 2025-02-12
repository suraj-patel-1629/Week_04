package com.collections.list.rotateelementsinalist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListRotator {
    public static List<Integer> rotate(List<Integer> list, int positions) {
        if (list == null || list.isEmpty() || positions <= 0) {
            return list;
        }
        //Size of list
        int size = list.size();

        // Handling cases where positions > size
        positions = positions % size;

        List<Integer> rotatedList = new ArrayList<>(list);
        // Left rotate
        Collections.rotate(rotatedList, -positions);

        return rotatedList;
    }
}
