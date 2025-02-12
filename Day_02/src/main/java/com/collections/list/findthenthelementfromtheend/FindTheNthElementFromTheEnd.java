/*Find the Nth Element from the End
Given a singly linked list (use LinkedList), find the Nth element from the end without calculating its size.
Example:
Input: [A, B, C, D, E], N=2 → Output: D.*/
package com.collections.list.findthenthelementfromtheend;

import java.util.LinkedList;
public class FindTheNthElementFromTheEnd {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        //Input
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        int n = 2;
        System.out.println("Original Linked List " + list);
        //Calling method findNthFromEnd of NthElementFinder Class
        String result = NthElementFinder.findNthFromEnd(list, n);

        //Output
        System.out.println(n+" nd Element from End: " + result);
    }
}
