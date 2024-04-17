package loops;

import java.util.Scanner;

public class GuessingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int randomNumber = (int) (Math.random() * 100) + 1;

        System.out.println("Welcome to the Guess the Number Game!");
        System.out.println("Try to guess the number between 1 and 100.");

        int guess;
        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess < randomNumber) {
                System.out.println("The number is greater than your guess.");
            } else if (guess > randomNumber) {
                System.out.println("The number is less than your guess.");
            } else {
                System.out.println("Congratulations! You guessed the number: " + randomNumber);
            }
        } while (guess != randomNumber);

    }
}
