public class UnitConverter {

    // Conversion factors
    private static final double YARDS_TO_FEET_FACTOR = 3.0;
    private static final double FEET_TO_YARDS_FACTOR = 0.333333;
    private static final double METERS_TO_INCHES_FACTOR = 39.3701;
    private static final double INCHES_TO_METERS_FACTOR = 0.0254;
    private static final double INCHES_TO_CM_FACTOR = 2.54;

    
    public static double convertYardsToFeet(double yards) {
        return yards * YARDS_TO_FEET_FACTOR;
    }

    
    public static double convertFeetToYards(double feet) {
        return feet * FEET_TO_YARDS_FACTOR;
    }

    /**
     * Converts a value from meters to inches.
     * @param meters The value in meters.
     * @return The converted value in inches.
     */
    public static double convertMetersToInches(double meters) {
        return meters * METERS_TO_INCHES_FACTOR;
    }

    
    public static double convertInchesToMeters(double inches) {
        return inches * INCHES_TO_METERS_FACTOR;
    }

    
    public static double convertInchesToCentimeters(double inches) {
        return inches * INCHES_TO_CM_FACTOR;
    }

    public static void main(String[] args) {
        // Example Usage:
        double yards = 5.0;
        double feet = UnitConverter.convertYardsToFeet(yards);
        System.out.printf("%.2f yards is %.2f feet%n", yards, feet);

        double feet2 = 10.0;
        double yards2 = UnitConverter.convertFeetToYards(feet2);
        System.out.printf("%.2f feet is %.6f yards%n", feet2, yards2);

        double meters = 2.0;
        double inches = UnitConverter.convertMetersToInches(meters);
        System.out.printf("%.2f meters is %.4f inches%n", meters, inches);

        double inches2 = 50.0;
        double meters2 = UnitConverter.convertInchesToMeters(inches2);
        System.out.printf("%.2f inches is %.4f meters%n", inches2, meters2);

        double inches3 = 12.0;
        double cm = UnitConverter.convertInchesToCentimeters(inches3);
        System.out.printf("%.2f inches is %.2f centimeters%n", inches3, cm);
    }
}