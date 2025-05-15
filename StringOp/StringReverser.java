package StringOp;

public class StringReverser {
    public static void main(String[] args) {
        String input = "Hello World";
        System.out.println("Reversed string: " + reverseString(input));
    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}

