/*Write a java program for getting different colors through ArrayList interface and sort them
using Collections.sort( ArrayListObj)) */


package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class colorSort {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Yellow");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");

        System.out.println("Before Sorting: " + colors);

        Collections.sort(colors);

        System.out.println("After Sorting: " + colors);
    }
}

