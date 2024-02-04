package java_day_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaximumAndMinimumNumbers {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        int max = Collections.max(list);
        System.out.println("Maximum number is " + max);

        int min = Collections.min(list);
        System.out.println("Minimum number is " + min);

    }
}

/*
7. Create a class called MaximumAndMinimumNumbers and write a program with the following specifications:
   7.1 Given an ArrayList of integers, find and display the maximum and minimum numbers without using any sorting.

			Example:
				list = [1,2,3,4,5];

			output:
			    Maximum number is 5
			    Minimum number is 1
 */