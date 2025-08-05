import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        String inputString = getInputString();
        boolean isPalindrome = checkPalindrome(inputString);
        displayResult(inputString, isPalindrome);
    }

    public static String getInputString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it's a palindrome: ");
        String input = scanner.nextLine();
        scanner.close();
        return input;
    }

    public static boolean checkPalindrome(String str) {
        String cleanString = str.replaceAll("\\s+", "").toLowerCase();
        String reversedString = new StringBuilder(cleanString).reverse().toString();
        return cleanString.equals(reversedString);
    }

    public static void displayResult(String str, boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("'" + str + "' is a palindrome.");
        } else {
            System.out.println("'" + str + "' is not a palindrome.");
        }
    }
}