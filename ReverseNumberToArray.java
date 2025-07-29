import java.util.Scanner;

public class ReverseNumberToArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer to reverse: ");
        int number = scanner.nextInt();

        if (number == 0) {
            System.out.println("Digits in reverse order: 0");
            scanner.close();
            return;
        }

        int tempNumber = number;
        int digitCount = 0;
        if (tempNumber < 0) { // Handle negative numbers
            tempNumber = -tempNumber;
        }
        
        if (tempNumber == 0) { // Special case for 0
            digitCount = 1;
        } else {
            while (tempNumber > 0) {
                tempNumber /= 10;
                digitCount++;
            }
        }
        
        int[] digits = new int[digitCount];
        tempNumber = number;
        if (tempNumber < 0) {
            tempNumber = -tempNumber;
        }

        int index = 0;
        if (tempNumber == 0) {
            digits[0] = 0;
        } else {
            while (tempNumber > 0) {
                digits[index] = tempNumber % 10;
                tempNumber /= 10;
                index++;
            }
        }
        
        System.out.print("Digits in reverse order: ");
        if (number < 0) {
            System.out.print("-"); // Print negative sign if original number was negative
        }
        for (int i = 0; i < digitCount; i++) {
            System.out.print(digits[i]);
        }
        System.out.println();

        scanner.close();
    }
}