public class LongestWordFinder {
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split("\\s+");
        String longestWord = "";

        for (String word : words) {
            String cleanedWord = word.replaceAll("[^a-zA-Z]", "");
            if (cleanedWord.length() > longestWord.length()) {
                longestWord = cleanedWord;
            }
        }
        return longestWord;
    }

    public static void main(String[] args) {
        String sentence1 = "The quick brown fox jumps over the lazy dog.";
        System.out.println("Sentence: \"" + sentence1 + "\", Longest word: " + findLongestWord(sentence1));

        String sentence2 = "Java programming is fun.";
        System.out.println("Sentence: \"" + sentence2 + "\", Longest word: " + findLongestWord(sentence2));
    }
}