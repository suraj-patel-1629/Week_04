/*Find Frequency of Elements
Given a list of strings, count the frequency of each element and return the results in a Map<String, Integer>.
Example:
Input: ["apple", "banana", "apple", "orange"] → Output: {apple=2, banana=1, orange=1}.*/
package com.collections.list.findfrequencyofelements;

import java.util.ArrayList;
import java.util.List;

public class FrequencyOfElement {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        //Input to the list
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("orange");

        //Output
        System.out.println("Input list - "+list);
        System.out.println("Output map - "+ CountingFrequency.count(new ArrayList<>(list)));
    }
}