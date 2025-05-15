package StringOp;

public class CheckNullOrEmpty {
    public static void main(String[] args) {
        String input = "   ";
        System.out.println("Is string null or empty? " + isNullOrEmpty(input));
    }

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }
}

