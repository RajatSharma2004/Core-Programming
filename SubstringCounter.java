public class SubstringCounter {
    public static int countSubstringOccurrences(String text, String sub) {
        int count = 0;
        int lastIndex = 0;

        while ((lastIndex = text.indexOf(sub, lastIndex)) != -1) {
            count++;
            lastIndex += sub.length();
        }
        return count;
    }

    public static void main(String[] args) {
        String text1 = "Java is a programming language. Java is widely used.";
        String sub1 = "Java";
        System.out.println("Occurrences of '" + sub1 + "' in '" + text1 + "': " + countSubstringOccurrences(text1, sub1));

        String text2 = "ababaabcab";
        String sub2 = "abc";
        System.out.println("Occurrences of '" + sub2 + "' in '" + text2 + "': " + countSubstringOccurrences(text2, sub2));
    }
}