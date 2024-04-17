package operators;

import java.util.Scanner;

public class TimeUnits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of seconds: ");
        long inputSeconds = scanner.nextLong();

        calculateTimeUnits(inputSeconds);



    }

    private static void calculateTimeUnits(long inputSeconds) {

        long years = inputSeconds / (365 * 24 * 3600);
        long remainingSeconds = inputSeconds % (365 * 24 * 3600);

        long days = remainingSeconds / (24 * 3600);
        remainingSeconds %= (24 * 3600);

        long hours = remainingSeconds / 3600;
        remainingSeconds %= 3600;

        long minutes = remainingSeconds / 60;

        long seconds = remainingSeconds % 60;

        System.out.printf("%d years and %d days and %d hours and %d minutes and %d seconds\n",
                years, days, hours, minutes, seconds);

    }
}
