/*
 Write a java program for getting different colors through ArrayList interface and remove the
2nd element and color "Blue" from the ArrayList
*/

package ArrayList;

import java.util.ArrayList;

public class colorRemove {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        System.out.println("Original Colors: " + colors);

        // Remove 2nd element (index 1)
        colors.remove(1);
        System.out.println("After removing 2nd element: " + colors);

        // Remove color "Blue"
        colors.remove("Blue");
        System.out.println("After removing 'Blue': " + colors);
    }
}

