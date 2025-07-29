import java.util.Scanner;

public class BMICalculatorMultiArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int numberOfPersons = scanner.nextInt();

        double[][] personData = new double[numberOfPersons][3]; // Column 0: Height, Column 1: Weight, Column 2: BMI
        String[] weightStatus = new String[numberOfPersons];

        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("\nEnter data for person " + (i + 1) + ":");
            
            System.out.print("Enter weight in kilograms: ");
            double weight = scanner.nextDouble();
            while (weight <= 0) {
                System.out.println("Weight must be positive. Please re-enter:");
                weight = scanner.nextDouble();
            }
            personData[i][1] = weight; // Store weight

            System.out.print("Enter height in meters: ");
            double height = scanner.nextDouble();
            while (height <= 0) {
                System.out.println("Height must be positive. Please re-enter:");
                height = scanner.nextDouble();
            }
            personData[i][0] = height; // Store height

            double bmi = weight / (height * height);
            personData[i][2] = bmi; // Store BMI

            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
        }

        System.out.println("\n--- BMI Results ---");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("\nPerson %d:\n", (i + 1));
            System.out.printf("  Height: %.2f m\n", personData[i][0]);
            System.out.printf("  Weight: %.2f kg\n", personData[i][1]);
            System.out.printf("  BMI: %.2f\n", personData[i][2]);
            System.out.println("  Status: " + weightStatus[i]);
        }

        scanner.close();
    }
}