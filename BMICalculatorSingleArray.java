import java.util.Scanner;

public class BMICalculatorSingleArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int numberOfPersons = scanner.nextInt();

        double[] weights = new double[numberOfPersons];
        double[] heights = new double[numberOfPersons];
        double[] bmis = new double[numberOfPersons];
        String[] weightStatuses = new String[numberOfPersons];

        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("\nEnter data for person " + (i + 1) + ":");
            
            System.out.print("Enter weight in kilograms: ");
            weights[i] = scanner.nextDouble();
            while (weights[i] <= 0) {
                System.out.println("Weight must be positive. Please re-enter:");
                weights[i] = scanner.nextDouble();
            }

            System.out.print("Enter height in meters: ");
            heights[i] = scanner.nextDouble();
            while (heights[i] <= 0) {
                System.out.println("Height must be positive. Please re-enter:");
                heights[i] = scanner.nextDouble();
            }

            bmis[i] = weights[i] / (heights[i] * heights[i]);

            if (bmis[i] < 18.5) {
                weightStatuses[i] = "Underweight";
            } else if (bmis[i] >= 18.5 && bmis[i] < 24.9) {
                weightStatuses[i] = "Normal weight";
            } else if (bmis[i] >= 25 && bmis[i] < 29.9) {
                weightStatuses[i] = "Overweight";
            } else {
                weightStatuses[i] = "Obesity";
            }
        }

        System.out.println("\n--- BMI Results ---");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("\nPerson %d:\n", (i + 1));
            System.out.printf("  Weight: %.2f kg\n", weights[i]);
            System.out.printf("  Height: %.2f m\n", heights[i]);
            System.out.printf("  BMI: %.2f\n", bmis[i]);
            System.out.println("  Status: " + weightStatuses[i]);
        }

        scanner.close();
    }
}