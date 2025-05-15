package StringOp2;

public class WordCounter {
    public static void main(String[] args) {
        String input = "AIET is a great place to learn";
        System.out.println("Word count: " + countWords(input));
    }

    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }
        return str.trim().split("\\s+").length;
    }
}

