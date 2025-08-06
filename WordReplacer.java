public class WordReplacer {

    public static String replaceWord(String sentence, String oldWord, String newWord) {
        String escapedOldWord = oldWord.replaceAll("[.\\\\+*?\\[^\\]$(){}=!<>|:,-]", "\\\\$&");
        return sentence.replaceAll("\\b" + escapedOldWord + "\\b", newWord);
    }

    public static void main(String[] args) {
        String sentence1 = "The quick brown fox jumps over the lazy dog.";
        String oldWord1 = "fox";
        String newWord1 = "cat";
        System.out.println("Original: " + sentence1);
        System.out.println("Replaced: " + replaceWord(sentence1, oldWord1, newWord1));

        String sentence2 = "Hello world, hello Java.";
        String oldWord2 = "hello";
        String newWord2 = "hi";
        System.out.println("Original: " + sentence2);
        System.out.println("Replaced: " + replaceWord(sentence2, oldWord2, newWord2));

        String sentence3 = "Programming is fun. Program often.";
        String oldWord3 = "Program";
        String newWord3 = "Code";
        System.out.println("Original: " + sentence3);
        System.out.println("Replaced: " + replaceWord(sentence3, oldWord3, newWord3));
    }
}