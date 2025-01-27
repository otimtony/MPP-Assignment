package Lab8.prob4;
import java.util.List;

public class WordCounter {
    public int countWords(List<String> words, char c, char d, int len) {

        return (int) words.stream()
                .filter(word -> word.length() == len)
                .filter(word -> word.contains(String.valueOf(c)))
                .filter(word -> !word.contains(String.valueOf(d)))
                .count();

    }

    public static void main(String[] args) {

        WordCounter wordCounter = new WordCounter();

        List<String> words = List.of("banana", "grape", "lemon", "papaya",
                "starfruit", "jackfruit", "durian");

        int result = wordCounter.countWords(words, 'a', 'e', 5);

        System.out.println("Number of words: " + result);
    }
}
