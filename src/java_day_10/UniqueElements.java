package java_day_10;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueElements {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5));

        list.removeIf(character -> list.indexOf(character) != list.lastIndexOf(character));

        System.out.println(list);

    }
}

/*
9. Create a class called UniqueElements and write a program with the following specifications:
   9.1 Given an ArrayList, display the unique elements without using any loops.

			Example:
				list = [1, 1, 2, 3, 3, 4, 5, 5]

			output:
				[2, 4]

 */
