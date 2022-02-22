package Day14Homework;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        String str = sc.nextLine();
        //int index = sc.nextInt();
        //char c = sc.next().charAt(0);
        System.out.println(reverseString(str));
    }

    /**
     * Task 1
     * A method that returns the length of the given string.
     */

    public static int stringLength(String str) {
        return str.length();
    }

    /**
     * Task 2
     * A method that returns a char of a given index from the string.
     */

    public static String returnChar(String str, int index) {
        if (index > str.length()) {
            return "Index is larger than the length of the string";
        }
        return String.valueOf(str.charAt(index));
    }

    /**
     * Task 3
     * A method that checks if a given string contains a given char and returns true, or false.
     */

    public static boolean givenChar(String str, char c) {
        for (int i = 0; i < str.length(); i++) {
            if (c == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Task 4
     * A method that returns the amount of vowels in a string.
     */

    public static int amountOfVowels(String str) {
        int vowels = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'i' || ch == 'e' ||
                    ch == 'o' || ch == 'u') {
                vowels++;
            }
        }
        return vowels;
    }

    /**
     * Task 5
     * A method that reverses the given string.
     */

    public static StringBuilder reverseString(String str) {
        StringBuilder reverse = new StringBuilder("");
        char ch;
        for (int i = str.length() - 1; i >= 0; i--) {
            ch = str.charAt(i);
            reverse.append(ch);
        }
        return reverse;
    }

    /**
     * Task 6
     * A method that counts the amount of vowels and digits.
     */

    public static void countVowelsDigits(String str) {
        double vowels = 0;
        double digits = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'i' || ch == 'e' ||
                    ch == 'o' || ch == 'u') {
                vowels++;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '0' || ch == '1' || ch == '2' || ch == '3' || ch == '4'
                    || ch == '5' || ch == '6' || ch == '7' || ch == '8' || ch == '9') {
                digits++;
            }
        }
        System.out.println("Vowels: " + (double) Math.round((vowels * 100) / str.length()));
        System.out.println("Vowels: " + (double) Math.round((digits * 100) / str.length()));
    }

    /**
     * Task 7
     * A method that accepts a string and ciphers it using Caesar's cipher.
     */

    public static StringBuilder caesarsCode(String str) {
        str = str.toUpperCase();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = (char) (((int) str.charAt(i) + 3 - 65) % 26 + 65);
            res.append(ch);
        }
        return res;
    }

    /**
     * Task 8
     * A method that checks if a string is a palindrome.
     */

    public static boolean isPalindrome(String str) {
        boolean pal = false;
        String reverseStr = "";
        int len = str.length();
        for (int i = len - 1; i >= 0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }
        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            pal = true;
        }
        return pal;
    }

    /**
     * Task 9
     * A method that checks if a string is binary.
     */

    public static boolean isBinary(String str) {
        boolean bin = false;
        if (str.matches("[01]+")) {
            bin = true;
        }
        return bin;
    }

    /**
     * Task 10
     * A method that checks if a string is hexadecimal.
     */

    public static boolean isHexadecimal(String str) {
        str = str.toLowerCase();
        return str.matches("^[0-9a-fA-F]+$");
    }

    /**
     * Task 11
     * A method that converts a binary string to decimal.
     */

    public static void binaryToDecimalString(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != '0' && ch != '1') {
                System.out.println("Error: Invalid binary string " + "\"" + str + "\"");
                return;
            }
        }
        int dec = 0;
        int num = 1;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == '1') {
                dec += num;
            }
            num *= 2;
        }
        System.out.println("The equivalent decimal number for binary " + "\"" + str + "\"" + " is: " + dec);
    }

    public static int dupeChars(String str) {
        str = str.toLowerCase();
        int len = str.length();
        int count = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 1; j < len; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;

                }
            }
        }
        return count;
    }

    /**
     * Task 13
     * A method that returns the first unique character of the given string.
     */

    public static char firstNonDupeChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            boolean dupe = true;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j) && i != j) {
                    dupe = false;
                }
            }
            if (dupe) {
                return str.charAt(i);
            }
        }
        return ' ';
    }

    /**
     * Task 14
     * A method that returns the count of the given character's occurrences in the given string.
     */

    public static int givenCharInString(String str, char c) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                sum++;
            }
        }
        return sum;
    }
}