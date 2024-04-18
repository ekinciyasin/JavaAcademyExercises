package arrays;

public class UsingMethods {
    public static void main(String[] args) {
        int[] numbers = new int[] {2, 2, 10, 11, 10};
        int multiplier = 2;
        int [] multipliedArray = multiplyArray(numbers, multiplier);
        printMultipliedArray(numbers, multiplier);

    }

    private static int[] multiplyArray(int[] numbers, int multiplier) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] *= multiplier;
        }
        return numbers;
    }

    public static void printMultipliedArray(int[] numbers, int multiplier) {
            System.out.println("Numbers array after multiplication:");
            for (int num : numbers) {
                System.out.print(num + " ");
            }
    }
}
