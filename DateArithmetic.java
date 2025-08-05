import java.time.LocalDate;

public class DateArithmetic {
    public static void main(String[] args) {
        // Start with today's date
        LocalDate startDate = LocalDate.now();
        System.out.println("Original Date: " + startDate);

        // Add 7 days, 1 month, and 2 years
        LocalDate newDate = startDate.plusDays(7).plusMonths(1).plusYears(2);
        System.out.println("Date after additions: " + newDate);

        // Subtract 3 weeks
        LocalDate finalDate = newDate.minusWeeks(3);
        System.out.println("Final Date after subtraction: " + finalDate);
    }
}