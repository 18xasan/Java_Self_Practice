package java_day_10;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveTheZeros {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 0) {      // checks if current element is zero
                list.remove(list.get(i)); // removes zero
                list.add(0);    // adds zero to the last indexes
            }
        }

        System.out.println(list); // [1, 2, 3, 4, 0, 0, 0, 0]
    }
}

/*
5. Create a class called MoveTheZeros and write a program with the following specifications:
   5.1 Given an ArrayList, move all zeros to the last indexes of the ArrayList.

	            Example:
	                list: {1,0,2,0,3,0,4,0}

	            output:
	                [1, 2, 3, 4, 0, 0, 0, 0]
 */


