import java.util.Arrays;
import java.util.Scanner;

public class NumberCheckerPart1 {

    public static int countDigits(int number) {
        if (number == 0) {
            return 1;
        }
        return String.valueOf(Math.abs(number)).length();
    }

    public static int[] storeDigits(int number) {
        if (number == 0) {
            return new int[]{0};
        }
        String s = String.valueOf(Math.abs(number));
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = Character.getNumericValue(s.charAt(i));
        }
        return digits;
    }

    public static int[] reverseDigitsArray(int[] digits) {
        int[] reversedDigits = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversedDigits[i] = digits[digits.length - 1 - i];
        }
        return reversedDigits;
    }

    public static boolean compareArrays(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static boolean isPalindrome(int number) {
        int[] originalDigits = storeDigits(number);
        int[] reversedDigits = reverseDigitsArray(originalDigits);
        return compareArrays(originalDigits, reversedDigits);
    }

    public static boolean isDuckNumber(int number) {
        String s = String.valueOf(Math.abs(number));
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                if (number != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println("Count of digits: " + countDigits(num));

        int[] digits = storeDigits(num);
        System.out.println("Digits array: " + Arrays.toString(digits));

        int[] reversedDigits = reverseDigitsArray(digits);
        System.out.println("Reversed digits array: " + Arrays.toString(reversedDigits));

        System.out.println("Is " + num + " a palindrome? " + isPalindrome(num));
        System.out.println("Is " + num + " a duck number? " + isDuckNumber(num));

        scanner.close();
    }
}