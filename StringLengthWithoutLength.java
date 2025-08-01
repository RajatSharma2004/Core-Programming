//Write a program to find and return the length of a string without using the length() method 


import java.util.Scanner;

class StringLengthWithoutLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int length = findLength(input);
        System.out.println("Length of the string is: " + length);
    }

    public static int findLength(String str) {
        int count = 0;

        for (char c : str.toCharArray()) {
            count++;
        }

        return count;
    }
}
