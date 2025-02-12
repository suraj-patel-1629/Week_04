/*Rotate Elements in a List
Rotate the elements of a list by a given number of positions.
Example:
Input: [10, 20, 30, 40, 50], rotate by 2 → Output: [30, 40, 50, 10, 20].*/
package com.collections.list.rotateelementsinalist;

import java.util.Arrays;
import java.util.List;

public class RotateElementsInAList {
    public static void main(String[] args) {
        //Input
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
        //Position by which rotation will be done
        int rotateBy = 2;

        System.out.println("Original List: " + list);

        //Calling rotate method of ListRotator class
        List<Integer> rotatedList = ListRotator.rotate(list, rotateBy);

        //Output
        System.out.println("Rotated List: " + rotatedList);
    }
}
