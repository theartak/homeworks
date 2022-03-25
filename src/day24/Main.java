package day24;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        System.out.println(firstNonDupe("aabbc"));
    }

    /**
     * Task 1
     * A method that determines whether an array contains duplicates, or not.
     */
    public static boolean containsDupes(int[] arr) {
        Set<Integer> arraySet = new HashSet<Integer>();
        for (int value : arr) {
            if (!arraySet.add(value))
                return true;
        }
        return false;
    }

    /**
     * Task 2
     * A method that prints the unique elements of an array
     */

    public static void uniqueElements() {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int value : arr) {
            if (map.containsKey(value)) {
                map.put(value, 1 + map.get(value));
            } else {
                map.put(value, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (Integer.parseInt(String.valueOf(entry.getValue())) == 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }

    /**
     * Task 3
     * A method that prints the repeating characters in a given string.
     */

    public static void dupeCharsInString(String str) {
        Map<Character, Integer> map = new HashMap<>();
        char[] charArray = str.toCharArray();
        for (Character ch : charArray) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        Set<Character> keys = map.keySet();
        for (Character ch : keys) {
            if (map.get(ch) > 1) {
                System.out.println(ch + " is repeated " + map.get(ch) + " times");
            }
        }
    }

    /**
     * Task 4
     * A method that returns the first non-repeated character in a string.
     */

    public static Character firstNonDupe(String s) {
        Set<Character> charSet = new HashSet<>();
        Set<Character> dupe = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (!charSet.add(s.charAt(i))) {
                dupe.add(s.charAt(i));
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (!dupe.contains(s.charAt(i))) {
                return s.charAt(i);
            }
        }
        return null;
    }

    /**
     * Task 5
     * A method that returns the length of the longest substring with unique characters.
     */

    public static int longestUniqueSubstring(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        int length = 0;
        int start = 0;
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                start = Math.max(start, map.get(str.charAt(i)) + 1);
            }
            map.put(str.charAt(i), i);
            length = Math.max(length, i - start + 1);
        }
        return length;
    }
}
