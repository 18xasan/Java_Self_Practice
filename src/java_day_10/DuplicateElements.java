package java_day_10;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateElements {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        list.addAll(list); // adds all elements to the list

        System.out.println(list);

    }
}
