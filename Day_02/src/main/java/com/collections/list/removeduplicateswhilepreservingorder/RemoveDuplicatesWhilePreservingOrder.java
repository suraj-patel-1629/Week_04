/*Remove Duplicates While Preserving Order
Remove duplicate elements from a list while maintaining the original order of elements.
Example:
Input: [3, 1, 2, 2, 3, 4] → Output: [3, 1, 2, 4].*/
package com.collections.list.removeduplicateswhilepreservingorder;

import java.util.Arrays;
import java.util.List;
public class RemoveDuplicatesWhilePreservingOrder {
    public static void main(String[] args) {
        //Input
        List<Integer> list = Arrays.asList(3, 1, 2, 2, 3, 4);

        System.out.println("Original List: " + list);

        //Calling removeDuplicates method from DuplicateRemover Class
        List<Integer> uniqueList = DuplicateRemover.removeDuplicates(list);

        //Output
        System.out.println("Duplicates Removed List: " + uniqueList);
    }
}
