import java.util.Scanner;

public class ArmstrongNumberChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int sum = 0;
        int originalNumber = number;
        int tempNumber = number;

        while (tempNumber != 0) {
            int digit = tempNumber % 10;
            sum += Math.pow(digit, 3);
            tempNumber /= 10;
        }

        if (originalNumber == sum) {
            System.out.println(originalNumber + " is an Armstrong Number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong Number.");
        }

        scanner.close();
    }
}