import java.util.Scanner;

public class FactorialWhileLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        while (true) {
            System.out.print("Enter a non-negative integer to find its factorial: ");
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
                if (num < 0) {
                    System.out.println("Factorial is not defined for negative numbers. Please enter a non-negative integer.");
                } else {
                    break;
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next();
            }
        }

        long factorial = 1;
        if (num == 0) {
            factorial = 1;
        } else {
            int i = 1;
            while (i <= num) {
                factorial *= i;
                i++;
            }
        }
        System.out.println("The factorial of " + num + " is: " + factorial);
        scanner.close();
    }
}