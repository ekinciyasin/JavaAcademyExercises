package inputOutput;

import java.util.Scanner;

public class TextInputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        greetUser(readUserName(scanner));

    }

    public static String readUserName(Scanner scanner) {
        System.out.print("Please enter your name: ");
        return scanner.nextLine();
    }

    private static void greetUser(String userInput) {
        System.out.println("Hello, " + userInput + "!, Welcome to the training!"
        );
    }
}