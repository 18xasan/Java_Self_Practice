package java_day_10;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 7));

        ArrayList<Integer> list2 = new ArrayList<>(); // to store elements without duplicates

        for (Integer element : list) {
            if (!list2.contains(element)) // it checks if the current element in list is not already present in list2.
                list2.add(element);      // If the element is not already in list2, it is added to list2.
        }

        System.out.println(list2);

    }
}

/*
8. Create a class called RemoveDuplicates and write a program with the following specifications:
   8.1 Given an ArrayList of integers, remove duplicated numbers.

			Example:
				list = [1,1,2,2,3,3,4,4,5,6,7]

			Output:
				[1,2,3,4,5,6,7]
 */
