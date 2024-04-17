package arrays;

public class UsingMethods {
    public static void main(String[] args) {
        int[] numbers = new int[] {2, 2, 10, 11, 10};
        int multiplier = 2;
        printMultipliedArray(numbers, multiplier);

    }

    public static void printMultipliedArray(int[] numbers, int multiplier) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] *= multiplier;

            System.out.println("Numbers array after multiplication:");
            for (int num : numbers) {
                System.out.print(num + " ");
            }
            System.out.println();

            System.out.println("Multiplier: " + multiplier);
        }
    }
}
