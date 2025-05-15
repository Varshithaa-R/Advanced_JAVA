package StringOp2;

public class TruncateString {
    public static void main(String[] args) {
        String input = "This is a long sentence.";
        int maxLength = 10;
        System.out.println("Truncated: " + truncate(input, maxLength));
    }

    public static String truncate(String str, int maxLength) {
        if (str.length() <= maxLength) {
            return str;
        } else {
            return str.substring(0, maxLength) + "...";
        }
    }
}

