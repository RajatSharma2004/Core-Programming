public class PalindromeChecker {
    private static String reverseString(String str) {
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

    public static boolean isPalindrome(String str) {
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversedStr = reverseString(cleanedStr);
        return cleanedStr.equals(reversedStr);
    }

    public static void main(String[] args) {
        System.out.println("Is 'madam' a palindrome? " + isPalindrome("madam"));
        System.out.println("Is 'racecar' a palindrome? " + isPalindrome("racecar"));
        System.out.println("Is 'hello' a palindrome? " + isPalindrome("hello"));
        System.out.println("Is 'A man, a plan, a canal: Panama' a palindrome? " + isPalindrome("A man, a plan, a canal: Panama"));
    }
}