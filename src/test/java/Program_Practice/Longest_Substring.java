package Program_Practice;

import java.util.HashMap;
import java.util.Map;

public class Longest_Substring {
	
	public static String findLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        int maxLength = 0;
        int start = 0;
        int maxStart = 0;
        Map<Character, Integer> charIndexMap = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (charIndexMap.containsKey(c) && charIndexMap.get(c) >= start) {
                start = charIndexMap.get(c) + 1;
            }

            charIndexMap.put(c, i);

            if (i - start + 1 > maxLength) {
                maxLength = i - start + 1;
                maxStart = start;
            }
        }

        return s.substring(maxStart, maxStart + maxLength);
    }

    public static void main(String[] args) {
        String input = "abbcabda";
        String longestSubstring = findLongestSubstring(input);
        System.out.println("Longest Substring without Repeating Characters: " + longestSubstring);
    }
}
//Running this code with the input "abcbcabcda" will find the longest substring without repeating characters, which is "bcad."








