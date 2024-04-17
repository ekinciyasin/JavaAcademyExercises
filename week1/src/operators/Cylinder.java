package operators;

import java.util.Scanner;

public class Cylinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the circumference of the can: ");
        double circumference = scanner.nextDouble();

        System.out.print("Enter the height of the can: ");
        double height = scanner.nextDouble();

        double diameter = circumference / Math.PI;

        double lidArea = Math.PI * Math.pow(diameter / 2, 2);

        double casingArea = circumference * height;

        double totalSheetArea = 2 * lidArea + casingArea;

        double volume = lidArea * height;

        System.out.println("Sheet metal area: " + totalSheetArea);
        System.out.println("Volume: " + volume);

    }
}
