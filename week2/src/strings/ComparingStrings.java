package strings;

public class ComparingStrings {

 //   Using the equals() method compares the content of the strings.
 //   Using the == operator compares the references of the string objects.

    public static void main(String[] args) {
        // Creating both strings with a literal
        String str1Literal = "Comparison";
        String str2Literal = "Comparison";

        // Creating both strings with a constructor
        String str1Constructor = new String("Comparison");
        String str2Constructor = new String("Comparison");

        // Comparing using equals() method
        System.out.println("Comparing with equals() method:");
        System.out.println("Literal strings comparison result: " + str1Literal.equals(str2Literal));
        System.out.println("Constructor strings comparison result: " + str1Constructor.equals(str2Constructor));

        // Comparing using == operator
        System.out.println("\nComparing with == operator:");
        System.out.println("Literal strings comparison result: " + (str1Literal == str2Literal));
        System.out.println("Constructor strings comparison result: " + (str1Constructor == str2Constructor));
    }
}
