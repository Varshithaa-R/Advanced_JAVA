/*Write a Java Program for Checking if a string reads the same backward as forward (ignoring case
and punctuation) using user defined function isPalindrome(): */


package StringOp;

public class PalindromeChecker {
    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";
        System.out.println("Is palindrome? " + isPalindrome(input));
    }

    public static boolean isPalindrome(String str) {
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }
}


