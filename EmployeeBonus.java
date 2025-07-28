import java.util.Scanner;

public class EmployeeBonus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salary;
        int serviceYears;

        while (true) {
            System.out.print("Enter the employee's salary: ");
            if (scanner.hasNextDouble()) {
                salary = scanner.nextDouble();
                if (salary < 0) {
                    System.out.println("Salary cannot be negative. Please enter a positive value.");
                } else {
                    break;
                }
            } else {
                System.out.println("Invalid input for salary. Please enter a number.");
                scanner.next();
            }
        }

        while (true) {
            System.out.print("Enter the employee's years of service: ");
            if (scanner.hasNextInt()) {
                serviceYears = scanner.nextInt();
                if (serviceYears < 0) {
                    System.out.println("Years of service cannot be negative. Please enter a non-negative integer.");
                } else {
                    break;
                }
            } else {
                System.out.println("Invalid input for years of service. Please enter an integer.");
                scanner.next();
            }
        }

        if (serviceYears > 5) {
            double bonusAmount = 0.05 * salary;
            System.out.println("Congratulations! You qualify for a bonus.");
            System.out.printf("Bonus amount: $%.2f%n", bonusAmount);
        } else {
            System.out.println("No bonus awarded. Years of service must be more than 5 years.");
        }
        scanner.close();
    }
}