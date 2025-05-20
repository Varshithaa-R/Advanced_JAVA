/*Write a Java Program for Counting how many times a substring appears in a main string
using user defined function countOccurrences() */


package StringOp;

public class SubstringCounter {
    public static void main(String[] args) {
        String mainStr = "banana banana banana";
        String subStr = "banana";

        int count = countOccurrences(mainStr, subStr);
        System.out.println("Occurrences of '" + subStr + "': " + count);
    }

    public static int countOccurrences(String mainStr, String subStr) {
        int count = 0;
        int index = 0;

        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length();
        }

        return count;
    }
}

