package arrays;

import java.util.Arrays;
import java.util.OptionalInt;

public class MaxAndMin {
    public static void main(String[] args) {
        int[] numbers = new int[] {12, -22, 300, 43, 0};
        determineMaxAndMinWithStream(numbers);
        determineMaxAndMinWithSearchingMethod(numbers);
    }

    private static void determineMaxAndMinWithStream(int[] numbers) {
        OptionalInt max = Arrays.stream(numbers).max();
        OptionalInt min = Arrays.stream(numbers).min();
        System.out.println("Max: " + max.getAsInt() + " Min: " + min.getAsInt() + " with stream");
    }

    private static void determineMaxAndMinWithSearchingMethod(int[] numbers) {
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Max: " + max + " Min: " + min + " with searching method");
    }


}
