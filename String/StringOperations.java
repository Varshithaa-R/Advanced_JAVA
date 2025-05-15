package String;


import java.util.Arrays;

public class StringOperations {
    public static void main(String[] args) {
        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // 2. Length and Character Access
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1 of str1: " + str1.charAt(1));

        // 3. String Comparison
        System.out.println("str1 equals str2? " + str1.equals(str2));
        System.out.println("str1 compareTo str2: " + str1.compareTo(str2));

        // 4. String Searching
        String sentence = "The quick brown fox jumps over the lazy dog";
        System.out.println("Sentence: " + sentence);
        System.out.println("Index of 'fox': " + sentence.indexOf("fox"));
        System.out.println("Contains 'quick'? " + sentence.contains("quick"));

        // 5. Substring Operations
        System.out.println("Substring from index 4 to 9: " + sentence.substring(4, 9));

        // 6. String Modification
        String modified = sentence.replace("fox", "cat");
        System.out.println("After replacing 'fox' with 'cat': " + modified);

        // 7. Whitespace Handling
        String messy = "   Hello World   ";
        System.out.println("Original with spaces: '" + messy + "'");
        System.out.println("After trim: '" + messy.trim() + "'");

        // 8. String Concatenation
        String full = str1.concat(" ").concat(str2);
        System.out.println("Concatenated string: " + full);

        // 9. String Splitting
        String csv = "Red,Green,Blue,Yellow";
        String[] colors = csv.split(",");
        System.out.println("Split CSV into array: " + Arrays.toString(colors));

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");
        sb.insert(0, "Welcome to ");
        sb.replace(11, 15, "Advanced");
        System.out.println("StringBuilder result: " + sb.toString());

        // 11. String Formatting
        String name = "Alice";
        int age = 25;
        String formatted = String.format("Name: %s, Age: %d", name, age);
        System.out.println("Formatted string: " + formatted);

        // 12. Validate Email
        String email = "user@example.com";
        boolean isValid = email.contains("@") && email.endsWith(".com") && email.startsWith("user");
        System.out.println("Email: " + email);
        System.out.println("Is email valid? " + isValid);
    }
}
