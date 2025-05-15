package String2;

public class StringBuilderPerformance {
    public static void main(String[] args) {
        int iterations = 10000;
        String text = "AIET";

        long startTime = System.nanoTime();

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            builder.append(text);
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("Time taken by StringBuilder: " + duration + " nanoseconds");
    }
}

