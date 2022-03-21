package day24;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        dupeCharsInString("aabbccd");
    }

    /**
     * Task 1
     * A method that returns false if a set contains a duplicate, else returns true.
     */
    public static boolean containsDupesSet() {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        return set.add(1);
    }

    /**
     * Task 1
     * (Alternative solution)
     */
    public static void containsDupes() {
        int[] arr = {1, 2, 3, 4, 5, 1};
        int min = -1;
        HashSet<Integer> set = new HashSet<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (set.contains(arr[i]))
                min = i;
            else {
                set.add(arr[i]);
            }
        }
        if (min != -1)
            System.out.println(arr[min] + " is a duplicate");
        else
            System.out.println("There are no duplicates");
    }

    /**
     * Task 2
     * A method that prints the unique elements of an array
     */

    public static void uniqueElements() {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int value : arr) {
            if (map.containsKey(value))
                map.put(value, 1 + map.get(value));
            else
                map.put(value, 1);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (Integer.parseInt(String.valueOf(entry.getValue())) == 1)
                System.out.print(entry.getKey() + " ");
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

    public static Character firstNonRepeatedCharacter() {
        String str = "aabbccd";
        HashMap<Character, Integer> characterHashTable = new LinkedHashMap<>();
        int length;
        Character ch;
        length = str.length();
        for (int i = 0; i < length; i++) {
            ch = str.charAt(i);
            if (characterHashTable.containsKey(ch)) {
                characterHashTable.put(ch, characterHashTable.get(ch) + 1);
            } else {
                characterHashTable.put(ch, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : characterHashTable.entrySet()) {
            if (entry.getValue() == 1)
                return entry.getKey();
        }
        return null;
    }

    /**
     * Task 5
     * A method that returns the length of the longest substring with unique characters.
     */

    public static int longestUniqueSubstring() {
        String str = "abcdaefjh";
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
