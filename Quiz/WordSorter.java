package Quiz;

import java.util.Arrays;
import java.util.Comparator;

public class WordSorter {
    public static void main(String[] args) {
        // Examples
        System.out.println(sortWords("is2 Thi1s T4est 3a"));  // Output: "Thi1s is2 3a T4est"
        System.out.println(sortWords("4of Fo1r pe6ople g3ood th5e the2"));  // Output: "Fo1r the2 g3ood 4of th5e pe6ople"
        System.out.println(sortWords(""));  // Output: ""
    }

    public static String sortWords(String input) {
        if (input.isEmpty()) {
            return "";
        }

        // Split the input string into an array of words
        String[] words = input.split(" ");

        // Sort the array based on the number in each word
        Arrays.sort(words, Comparator.comparing(s -> Integer.parseInt(s.replaceAll("\\D", ""))));

        // Join the sorted words into a string
        return String.join(" ", words);
    }
}
