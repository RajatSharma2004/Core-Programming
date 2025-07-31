import java.util.Scanner;

public class NumberAnalyzer {

    public boolean isPositive(int number) {
        return number > 0;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;
        } else if (num1 == num2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberAnalyzer analyzer = new NumberAnalyzer();
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();

            if (analyzer.isPositive(numbers[i])) {
                if (analyzer.isEven(numbers[i])) {
                    System.out.println(numbers[i] + " is a positive even number.");
                } else {
                    System.out.println(numbers[i] + " is a positive odd number.");
                }
            } else {
                System.out.println(numbers[i] + " is a negative number.");
            }
        }

        System.out.println("\nComparing the first and last elements:");
        int comparisonResult = analyzer.compare(numbers[0], numbers[4]);
        if (comparisonResult == 1) {
            System.out.println("The first element (" + numbers[0] + ") is greater than the last element (" + numbers[4] + ").");
        } else if (comparisonResult == 0) {
            System.out.println("The first element (" + numbers[0] + ") is equal to the last element (" + numbers[4] + ").");
        } else {
            System.out.println("The first element (" + numbers[0] + ") is less than the last element (" + numbers[4] + ").");
        }

        scanner.close();
    }
}