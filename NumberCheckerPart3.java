import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NumberCheckerPart3 {

    public static int[] findFactors(int number) {
        List<Integer> factorsList = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factorsList.add(i);
            }
        }
        int[] factorsArray = new int[factorsList.size()];
        for (int i = 0; i < factorsList.size(); i++) {
            factorsArray[i] = factorsList.get(i);
        }
        return factorsArray;
    }

    public static int findGreatestFactor(int[] factors) {
        if (factors == null || factors.length == 0) {
            return -1;
        }
        return factors[factors.length - 1];
    }

    public static int findSumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public static long findProductOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static long findProductOfCubeOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    private static int factorial(int n) {
        if (n < 0) return 0;
        if (n == 0 || n == 1) return 1;
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static boolean isPerfectNumber(int number) {
        if (number <= 0) return false;
        int sumOfProperDivisors = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sumOfProperDivisors += i;
            }
        }
        return sumOfProperDivisors == number;
    }

    public static boolean isAbundantNumber(int number) {
        if (number <= 0) return false;
        int sumOfProperDivisors = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sumOfProperDivisors += i;
            }
        }
        return sumOfProperDivisors > number;
    }

    public static boolean isDeficientNumber(int number) {
        if (number <= 0) return false;
        int sumOfProperDivisors = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sumOfProperDivisors += i;
            }
        }
        return sumOfProperDivisors < number;
    }

    public static boolean isStrongNumber(int number) {
        if (number <= 0) return false;
        int originalNumber = number;
        int sumOfFactorialDigits = 0;
        while (number > 0) {
            int digit = number % 10;
            sumOfFactorialDigits += factorial(digit);
            number /= 10;
        }
        return sumOfFactorialDigits == originalNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int[] factors = findFactors(num);
        System.out.println("Factors of " + num + ": " + Arrays.toString(factors));
        System.out.println("Greatest factor of " + num + ": " + findGreatestFactor(factors));
        System.out.println("Sum of factors of " + num + ": " + findSumOfFactors(factors));
        System.out.println("Product of factors of " + num + ": " + findProductOfFactors(factors));
        System.out.println("Product of cube of factors of " + num + ": " + findProductOfCubeOfFactors(factors));

        System.out.println("Is " + num + " a perfect number? " + isPerfectNumber(num));
        System.out.println("Is " + num + " an abundant number? " + isAbundantNumber(num));
        System.out.println("Is " + num + " a deficient number? " + isDeficientNumber(num));
        System.out.println("Is " + num + " a strong number? " + isStrongNumber(num));

        scanner.close();
    }
}