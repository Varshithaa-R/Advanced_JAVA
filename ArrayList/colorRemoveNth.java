/* Write a java program for getting different colors through ArrayList interface and delete nth
element from the ArrayList object by using remove by index*/
package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class colorRemoveNth {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Original Colors: " + colors);
        System.out.print("Enter the index (starting from 0) of the color to remove: ");
        int index = scanner.nextInt();

        if (index >= 0 && index < colors.size()) {
            colors.remove(index);
            System.out.println("After removing element at index " + index + ": " + colors);
        } else {
            System.out.println("Invalid index!");
        }

        scanner.close();
    }
}

