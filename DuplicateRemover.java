import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateRemover {
    public static String removeDuplicates(String str) {
        Set<Character> seen = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (seen.add(ch)) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String original1 = "programming";
        String withoutDuplicates1 = removeDuplicates(original1);
        System.out.println("Original: " + original1 + ", Without Duplicates: " + withoutDuplicates1);

        String original2 = "hello";
        String withoutDuplicates2 = removeDuplicates(original2);
        System.out.println("Original: " + original2 + ", Without Duplicates: " + withoutDuplicates2);
    }
}