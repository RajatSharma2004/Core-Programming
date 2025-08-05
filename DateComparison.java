import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get two dates from the user
        System.out.print("Enter the first date (YYYY-MM-DD): ");
        LocalDate date1 = LocalDate.parse(scanner.nextLine());

        System.out.print("Enter the second date (YYYY-MM-DD): ");
        LocalDate date2 = LocalDate.parse(scanner.nextLine());

        // Compare the dates
        if (date1.isBefore(date2)) {
            System.out.println(date1 + " is before " + date2);
        } else if (date1.isAfter(date2)) {
            System.out.println(date1 + " is after " + date2);
        } else {
            System.out.println(date1 + " is the same as " + date2);
        }
        
        scanner.close();
    }
}