package ex1;
import java.util.HashMap;
public class TestHashMap {

	public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int maxLength = 0;
        int start = 0;
        HashMap<Character, Integer> charIndexMap = new HashMap<>();

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);

            if (charIndexMap.containsKey(currentChar)) {
                // If the current character is already in the substring, update the start index
                start = Math.max(start, charIndexMap.get(currentChar) + 1);
            }

            // Update the index of the current character in the map
            charIndexMap.put(currentChar, end);

            // Update the maximum length
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        // Example 1
        System.out.println(lengthOfLongestSubstring("abcabcbb")); // Output: 3

        // Example 2
        System.out.println(lengthOfLongestSubstring("bbbbb")); // Output: 1

        // Example 3
        System.out.println(lengthOfLongestSubstring("pwwkew")); // Output: 3
    }
}