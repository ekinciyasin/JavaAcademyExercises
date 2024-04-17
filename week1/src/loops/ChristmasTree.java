package loops;
import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the height of the Christmas tree: ");
        int height = scanner.nextInt();

        drawChristmasTree(height);

    }

    public static void drawChristmasTree(int height) {
        for (int row = 0; row < height; row++) {
            for (int spaces = height - row - 1; spaces > 0; spaces--) {
                System.out.print(" ");
            }

            for (int stars = 0; stars < 2 * row + 1; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 2; i++) {
            for (int spaces = height - 1; spaces > 0; spaces--) {
                System.out.print(" ");
            }
            System.out.println("I");
        }
    }
}
