package datatypesVariables;

import java.util.Scanner;

public class FormattingText {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input string:");
        String input = scanner.nextLine();
        String formattedString = formatString(input);
        System.out.println("Formatted string:");
        System.out.println(formattedString);

    }

    public static String formatString(String input) {
        String[] words = input.split(" ");
        StringBuilder formattedString = new StringBuilder();
        boolean inUpper = false;
        boolean inLower = false;
        int underlineCount = 0;
        int hashCount = 0;
        for (String word : words) {

                char currentChar = word.charAt(0);
                if (word.charAt(0) == '_' && (word.charAt(word.length() - 1) == '_' || word.charAt(word.length() - 2) == '_')) {
                  String modifiedWord =  word.replace("_" , "");
                    formattedString.append(modifiedWord.toUpperCase() + " ");
                } else if (word.charAt(0) == '#' && word.charAt(word.length() - 1) == '#'  || word.charAt(word.length() - 2) == '#') {
                   String modifiedWord =  word.replace("#" , "");
                    formattedString.append(modifiedWord.toLowerCase()  + " ");
                } else {

                        formattedString.append(word  + " ");
                    }


        }
        return formattedString.toString();
    }
}
