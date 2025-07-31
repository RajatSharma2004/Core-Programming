import java.util.Scanner;

public class FriendsComparator {

    public String findYoungest(int amarAge, int akbarAge, int anthonyAge) {
        if (amarAge <= akbarAge && amarAge <= anthonyAge) {
            return "Amar";
        } else if (akbarAge <= amarAge && akbarAge <= anthonyAge) {
            return "Akbar";
        } else {
            return "Anthony";
        }
    }

    public String findTallest(double amarHeight, double akbarHeight, double anthonyHeight) {
        if (amarHeight >= akbarHeight && amarHeight >= anthonyHeight) {
            return "Amar";
        } else if (akbarHeight >= amarHeight && akbarHeight >= anthonyHeight) {
            return "Akbar";
        } else {
            return "Anthony";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FriendsComparator comparator = new FriendsComparator();

        System.out.println("Enter age for Amar:");
        int amarAge = scanner.nextInt();
        System.out.println("Enter height for Amar (in cm):");
        double amarHeight = scanner.nextDouble();

        System.out.println("Enter age for Akbar:");
        int akbarAge = scanner.nextInt();
        System.out.println("Enter height for Akbar (in cm):");
        double akbarHeight = scanner.nextDouble();

        System.out.println("Enter age for Anthony:");
        int anthonyAge = scanner.nextInt();
        System.out.println("Enter height for Anthony (in cm):");
        double anthonyHeight = scanner.nextDouble();

        String youngest = comparator.findYoungest(amarAge, akbarAge, anthonyAge);
        String tallest = comparator.findTallest(amarHeight, akbarHeight, anthonyHeight);

        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);

        scanner.close();
    }
}