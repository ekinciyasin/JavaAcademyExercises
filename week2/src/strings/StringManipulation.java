package strings;

public class StringManipulation {
    public static void main(String[] args) {
        String text= "Everybody said, it can’t be done. Then came one who did not know that and just made it.";

        retrieveTwoUpperCaseLetters(text);
        compareWithMyName(text);
        concatenateFirstnameAndLastName("Ekinci", "Yasin");
        containsMadeAndJava(text);
        compareTwoStrings(text,"Hello World");
        isTextEmpty(text);
        isTextNull();
        giveLengthOfText(text);
        extractWordsFromText(text);
    }


    private static void retrieveTwoUpperCaseLetters(String text) {
        char firstUppercase = text.charAt(0);
        char secondUppercase = text.charAt(34);

        System.out.println("Uppercase letters: " + firstUppercase + " " + secondUppercase);
    }

    private static void compareWithMyName(String text) {

        int comparisonResult =text.compareTo("Yasin");
        if (comparisonResult < 0) {
            System.out.println("The text comes before my name.");
        } else if (comparisonResult > 0) {
            System.out.println("The text comes after my name.");
        } else {
            System.out.println("The text is the same as my name.");
        }
    }

    private static void concatenateFirstnameAndLastName(String lastName, String firstName) {
        String fullName = firstName.concat(lastName);
        System.out.println("Concatenating firstname and lastname: " + fullName);
    }

    private static void containsMadeAndJava(String text) {
        boolean containsMade = text.contains("made");
        boolean containsJava = text.contains("Java");
        System.out.println("Contains 'made': " + containsMade);
        System.out.println("Contains 'Java': " + containsJava);
    }

    private static void compareTwoStrings(String text, String text2) {
        boolean isEqual = text.equals(text2);
        System.out.println("Text is equal to text2: " + isEqual);

    }

    private static void isTextEmpty(String text) {
        System.out.println("Text is empty: " +text.isEmpty());
    }

    private static void isTextNull() {
        String nullString = null;
        System.out.println("Null string is null: " + (nullString == null));
    }

    private static void giveLengthOfText(String text) {
        System.out.println("Length of text: " + text.length());
    }

    private static void extractWordsFromText(String text) {
        String said = text.substring(text.indexOf("said"), text.indexOf("said") + 4);
        String made = text.substring(text.indexOf("made"), text.indexOf("made") + 4);
        System.out.println("Extracted words: " + said + ", " + made);
    }
}


