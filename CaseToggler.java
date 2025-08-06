public class CaseToggler {
    public static String toggleCase(String str) {
        StringBuilder toggledStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                toggledStr.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                toggledStr.append(Character.toUpperCase(ch));
            } else {
                toggledStr.append(ch);
            }
        }
        return toggledStr.toString();
    }

    public static void main(String[] args) {
        String original1 = "Hello World";
        System.out.println("Original: " + original1 + ", Toggled: " + toggleCase(original1));

        String original2 = "jAvA PrOgRaMmInG";
        System.out.println("Original: " + original2 + ", Toggled: " + toggleCase(original2));
    }
}