package arrays;

public class BasicSum {
    public static void main(String[] args) {
        int[] numbers = new int[] {12, -22, 300, 43, 0};
        calculateTheSumOfTheArray(numbers);
    }

    private static void calculateTheSumOfTheArray(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of the array elements: " + sum);
    }
}
