package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class colorSublist {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        System.out.println("Original Colors: " + colors);

        List<String> subColors = colors.subList(0, 2); // Extract 1st and 2nd elements
        System.out.println("Sublist (1st and 2nd): " + subColors);
    }
}

