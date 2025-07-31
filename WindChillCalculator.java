public class WindChillCalculator {

    public double calculateWindChill(double temperature, double windSpeed) {
        if (windSpeed <= 0) {
            System.out.println("Warning: Wind speed must be greater than 0 for the wind chill formula to apply. Returning temperature.");
            return temperature;
        }
        if (temperature > 50) {
            System.out.println("Warning: Wind chill formula is typically for temperatures 50°F or below. Returning temperature.");
            return temperature;
        }

        double windChill = 35.74 + (0.6215 * temperature) + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;
    }

    public static void main(String[] args) {
        WindChillCalculator calculator = new WindChillCalculator();

        double temp1 = 20;
        double windSpeed1 = 15;
        double windChill1 = calculator.calculateWindChill(temp1, windSpeed1);
        System.out.printf("Temperature: %.2f°F, Wind Speed: %.2fmph -> Wind Chill: %.2f°F%n", temp1, windSpeed1, windChill1);

        double temp2 = -10;
        double windSpeed2 = 30;
        double windChill2 = calculator.calculateWindChill(temp2, windSpeed2);
        System.out.printf("Temperature: %.2f°F, Wind Speed: %.2fmph -> Wind Chill: %.2f°F%n", temp2, windSpeed2, windChill2);

        double temp3 = 10;
        double windSpeed3 = 0;
        double windChill3 = calculator.calculateWindChill(temp3, windSpeed3);
        System.out.printf("Temperature: %.2f°F, Wind Speed: %.2fmph -> Wind Chill: %.2f°F%n", temp3, windSpeed3, windChill3);

        double temp4 = 60;
        double windSpeed4 = 10;
        double windChill4 = calculator.calculateWindChill(temp4, windSpeed4);
        System.out.printf("Temperature: %.2f°F, Wind Speed: %.2fmph -> Wind Chill: %.2f°F%n", temp4, windSpeed4, windChill4);
    }
}