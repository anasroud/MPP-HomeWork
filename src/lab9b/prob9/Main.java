package lab9b.prob9;

import java.util.stream.IntStream;

public class Main {
    public static void printSquares(int num) {
        // Use IntStream.iterate to generate squares
        IntStream.iterate(1, n -> n + 1) // Start with 1, increment by 1
                .limit(num) // Limit the stream to the first `num` elements
                .forEach(n -> System.out.print(n * n + " ")); // Print the square of each number
    }

    public static void main(String[] args) {
        // Test the method
        printSquares(4); // Output: 1 4 9 16
    }
}
