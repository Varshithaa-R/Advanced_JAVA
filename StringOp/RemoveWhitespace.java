/*Write a Java Program for Eliminating all whitespace characters from a string using user defined
function removeWhitespace() */

package StringOp;

public class RemoveWhitespace {
    public static void main(String[] args) {
        String input = " A I E T  College  ";
        System.out.println("Without whitespace: '" + removeWhitespace(input) + "'");
    }

    public static String removeWhitespace(String str) {
        return str.replaceAll("\\s+", "");
    }
}

