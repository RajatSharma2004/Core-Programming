public class StringReverser {
    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        return new String(charArray);
    }

    public static void main(String[] args) {
        String original1 = "Java";
        String reversed1 = reverseString(original1);
        System.out.println("Original: " + original1 + ", Reversed: " + reversed1);

        String original2 = "hello";
        String reversed2 = reverseString(original2);
        System.out.println("Original: " + original2 + ", Reversed: " + reversed2);
    }
}