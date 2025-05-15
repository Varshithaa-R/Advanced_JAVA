package String2;

public class StringBufferPerformance {
    public static void main(String[] args) {
        int iterations = 10000;
        String text = "AIET";

        long startTime = System.nanoTime();

        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            buffer.append(text);
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("Time taken by StringBuffer: " + duration + " nanoseconds");
    }
}

