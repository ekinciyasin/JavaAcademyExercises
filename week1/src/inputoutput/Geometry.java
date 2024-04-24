package inputoutput;

import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double [] userInputs = readUserInputs(scanner);
        double a = userInputs[0];
        double b = userInputs[1];

       calculateRectanglePerimeter(a,b);
       calculateRectangleArea(a,b);

       calculateTriangleArea(a,b);
       calculateTrianglePerimeter(a,b);

    }


    private static double[] readUserInputs(Scanner scanner) {
        double[] values = new double[2];

        for (int i = 0; i < values.length; i++) {
            System.out.printf("Enter parameter %d: ", i + 1);
            while (!scanner.hasNextDouble()) {
                System.err.println("Please enter a number, not text.");
                scanner.nextLine(); // Clear the invalid input from the scanner buffer
            }
            values[i] = scanner.nextDouble();
            scanner.nextLine();
        }

        return values;

    }

    private static void calculateTriangleArea(double a, double b) {
        System.out.println("Triangle Area: " + 0.5 * a * b);
    }

    private static void calculateTrianglePerimeter(double a, double b) {
        double hypotenuse = calculateTriangleHypotenuse( a, b);
        System.out.println("Triangle Perimeter: " + (hypotenuse +a + b));
    }

    private static double calculateTriangleHypotenuse(double a, double b) {
        return  Math.sqrt(a * a + b * b);
    }

    private static void calculateRectanglePerimeter(double a, double b) {
        System.out.println("Rectangle Perimeter: " + 2 * (a + b));
    }

    private static void calculateRectangleArea(double a, double b) {
        System.out.println("Rectangle Area: " + a * b);
    }
}
