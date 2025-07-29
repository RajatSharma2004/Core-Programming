import java.util.Scanner;

public class DigitFrequencyCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int[] frequency = new int[10]; // Array to store frequency of digits 0-9

        if (number == 0) {
            frequency[0]++; // If the number is 0, increment frequency of digit 0
        } else {
            int tempNumber = number;
            if (tempNumber < 0) { // Handle negative numbers by working with absolute value
                tempNumber = -tempNumber;
            }

            while (tempNumber > 0) {
                int digit = tempNumber % 10;
                frequency[digit]++;
                tempNumber /= 10;
            }
        }

        System.out.println("\nFrequency of each digit in " + number + ":");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " time(s)");
            }
        }

        scanner.close();
    }
}