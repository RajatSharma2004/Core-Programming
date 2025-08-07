public class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double computeArea() {
        return Math.PI * radius * radius;
    }

    double computeCircumference() {
        return 2 * Math.PI * radius;
    }

    void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + computeArea());
        System.out.println("Circumference: " + computeCircumference());
    }

    public static void main(String[] args) {
        Circle c = new Circle(7.5);
        c.displayDetails();
    }
}
