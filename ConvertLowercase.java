//Write a program to convert the complete text to lowercase and compare the results
import java.util.Scanner;

class ConvertLowercase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String res1 = lowerCase(text);          
        String res2 = text.toLowerCase();        

        System.out.println("User-defined lowercase: " + res1);
        System.out.println("Built-in toLowerCase(): " + res2);

        System.out.println("Are both equal " + res1.equals(res2));
    }

    public static String lowerCase(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

           
            if (ch >= 'A' && ch <= 'Z') {
                result.append((char) (ch + 32)); 
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }
}
