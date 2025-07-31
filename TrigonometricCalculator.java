public class TrigonometricCalculator {

    public double[] calculateTrigonometricFunctions(double angle) {
        double angleInRadians = Math.toRadians(angle);

        double sine = Math.sin(angleInRadians);
        double cosine = Math.cos(angleInRadians);
        double tangent = Math.tan(angleInRadians);

        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        TrigonometricCalculator calculator = new TrigonometricCalculator();

        double angle1 = 30;
        double[] results1 = calculator.calculateTrigonometricFunctions(angle1);
        System.out.printf("For angle %.2f degrees:%n", angle1);
        System.out.printf("  Sine: %.4f%n", results1[0]);
        System.out.printf("  Cosine: %.4f%n", results1[1]);
        System.out.printf("  Tangent: %.4f%n", results1[2]);
        System.out.println("--------------------");

        double angle2 = 90;
        double[] results2 = calculator.calculateTrigonometricFunctions(angle2);
        System.out.printf("For angle %.2f degrees:%n", angle2);
        System.out.printf("  Sine: %.4f%n", results2[0]);
        System.out.printf("  Cosine: %.4f%n", results2[1]);
        System.out.printf("  Tangent: %.4f (Note: Tangent of 90 degrees is undefined)%n", results2[2]);
        System.out.println("--------------------");

        double angle3 = 45;
        double[] results3 = calculator.calculateTrigonometricFunctions(angle3);
        System.out.printf("For angle %.2f degrees:%n", angle3);
        System.out.printf("  Sine: %.4f%n", results3[0]);
        System.out.printf("  Cosine: %.4f%n", results3[1]);
        System.out.printf("  Tangent: %.4f%n", results3[2]);
        System.out.println("--------------------");

        double angle4 = 180;
        double[] results4 = calculator.calculateTrigonometricFunctions(angle4);
        System.out.printf("For angle %.2f degrees:%n", angle4);
        System.out.printf("  Sine: %.4f%n", results4[0]);
        System.out.printf("  Cosine: %.4f%n", results4[1]);
        System.out.printf("  Tangent: %.4f%n", results4[2]);
        System.out.println("--------------------");
    }
}