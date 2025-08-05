import java.util.Scanner;

public class FibonacciGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms for the Fibonacci sequence: ");
        int terms = scanner.nextInt();

        System.out.println("Fibonacci Sequence:");
        generateFibonacci(terms);

        scanner.close();
    }

    public static void generateFibonacci(int n) {
        int a = 0, b = 1;

        if (n >= 1) {
            System.out.print(a + " ");
        }
        if (n >= 2) {
            System.out.print(b + " ");
        }

        for (int i = 2; i < n; i++) {
            int nextTerm = a + b;
            System.out.print(nextTerm + " ");
            a = b;
            b = nextTerm;
        }
    }
}