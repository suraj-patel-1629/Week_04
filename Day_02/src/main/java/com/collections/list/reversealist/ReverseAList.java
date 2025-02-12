/*Reverse a List
Write a program to reverse the elements of a given List without using built-in reverse methods. Implement it for both ArrayList and LinkedList.
Example:
Input: [1, 2, 3, 4, 5] → Output: [5, 4, 3, 2, 1].*/
package com.collections.list.reversealist;

import java.util.ArrayList;
import java.util.LinkedList;

public class ReverseAList {
    public static void main(String[] args) {
        // ArrayList input
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        System.out.println("Original ArrayList: " + arrayList);
        ReverseArrayList.reverse(arrayList);
        System.out.println("Reversed ArrayList: " + arrayList);

        // LinkedList input
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        //Output
        System.out.println("Original LinkedList: " + linkedList);
        com.collection.list.reversealist.ReverseLinkedList.reverse(linkedList);
        System.out.println("Reversed LinkedList: " + linkedList);
    }
}