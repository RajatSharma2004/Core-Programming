import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks for three subjects (out of 100 each):");

        System.out.print("Physics Marks: ");
        double physicsMarks = scanner.nextDouble();

        System.out.print("Chemistry Marks: ");
        double chemistryMarks = scanner.nextDouble();

        System.out.print("Maths Marks: ");
        double mathsMarks = scanner.nextDouble();

        if (physicsMarks < 0 || physicsMarks > 100 ||
            chemistryMarks < 0 || chemistryMarks > 100 ||
            mathsMarks < 0 || mathsMarks > 100) {
            System.out.println("Error: Marks should be between 0 and 100.");
            scanner.close();
            return;
        }

        double totalMarks = physicsMarks + chemistryMarks + mathsMarks;

        double percentage = (totalMarks / 300.0) * 100;

        String grade;
        String remarks;

        if (percentage >= 90) {
            grade = "A+";
            remarks = "Excellent Performance!";
        } else if (percentage >= 80) {
            grade = "A";
            remarks = "Very Good Performance.";
        } else if (percentage >= 70) {
            grade = "B";
            remarks = "Good Performance.";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "Satisfactory Performance.";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "Pass.";
        } else {
            grade = "F";
            remarks = "Fail. Needs significant improvement.";
        }

        System.out.println("\n--- Result ---");
        System.out.printf("Physics Marks: %.2f\n", physicsMarks);
        System.out.printf("Chemistry Marks: %.2f\n", chemistryMarks);
        System.out.printf("Maths Marks: %.2f\n", mathsMarks);
        System.out.printf("Total Marks: %.2f\n", totalMarks);
        System.out.printf("Average Mark (Percentage): %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        scanner.close();
    }
}