package loops;

import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How large should the triangles be? ");
        int size = scanner.nextInt();

        System.out.print("How many triangles would you like? ");
        int numTriangles = scanner.nextInt();

        for (int i = 0; i < numTriangles; i++) {
            drawTriangle(size);
        }

    }

    public static void drawTriangle(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}
