package day25;

import java.util.HashSet;

public class Day25Demo {
    public static void main(String[] args) {

    }

    /**
     * Task 3
     * A method that prints the count of duplicated characters in an array.
     */
    public static void countDupes() {
        int[] arr = {1, 2, 3, 2, 5, 1};
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (set.contains(arr[i]))
                count++;
            else {
                set.add(arr[i]);
            }
        }
        System.out.println(count);
    }
}
