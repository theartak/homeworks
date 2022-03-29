package day25;

public class Main {
    public static void main(String[] args) {
        System.out.println(cutSymEms("abcdvbaK"));
    }

    /**
     * Task 1
     * a) A method that prints the sum of a given array's elements.
     * b) A method that prints the factorial of a given number.
     */
    //a)
    public static int sumRec(int[] arr, int n) {
        if (n <= 0) {
            return 0;
        }
        return (sumRec(arr, n - 1) + arr[n - 1]);
    }

    //b)
    public static long factorial(int n) {
        if (n >= 1) {
            return n * factorial(n - 1);
        } else {
            return 1;
        }
    }

    /**
     * Task 2
     * A method that returns the n'th element of a Fibonacci series.
     */
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    /**
     * Task 3
     * A method that computes the number of blocks given the amount of rows of a triangle.
     */
    public static int triangle(int row) {
        if (row == 0) return 0;
        return row + triangle(row - 1);
    }

    /**
     * Task 4
     * A method that returns the sum of a given number.
     */
    public static int sumOfDigits(int n) {
        if (n <= 0) {
            return 0;
        }
        return (n % 10 + sumOfDigits(n / 10));
    }

    /**
     * Task 5
     * A method that counts the occurrences of a given digit in a given number.
     */

    public static int digitCount(int num, int digit) {
        if (num <= 0) {
            return 0;
        }
        int temp = num % 10;
        if (temp == digit) {
            return 1 + digitCount(num / 10, digit);
        }
        return digitCount(num / 10, digit);
    }

    /**
     * Task 6
     * A method that counts the occurrences of a given character in a given string.
     */

    public static int countChar(String str, String c) {
        if (str.length() == 0) {
            return 0;
        }
        if ((str.substring(0, 1).equals(c))) {
            return 1 + countChar(str.substring(1), c);
        }
        return countChar(str.substring(1), c);
    }

    /**
     * Task 7
     */
    public static String removeChar(String str, char c) {
        if (str.length() == 0) {
            return str;
        } else {
            if (str.charAt(0) == c) {
                return removeChar(str.substring(1), c);
            } else {
                return str.charAt(0) + removeChar(str.substring(1), c);
            }
        }
    }

    /**
     * Task 8
     * A method that reverses the given string.
     */
    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    /**
     * Task 9
     * A method that moves the given characters to the end of a string.
     */
    public static String moveCharToEnd(String str, char ch) {
        if (str.length() == 0) {
            return "";
        }
        String newString = str.substring(1);
        if (str.indexOf(ch) == 0) {
            return moveCharToEnd(newString, ch) + ch;
        } else {
            return str.charAt(0) + moveCharToEnd(newString, ch);
        }
    }

    /**
     * Task 10
     * A method that "cleans" a given string.
     */
    public static String cleanString(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        if (str.length() == 1) {
            return str;
        }
        if (str.charAt(0) == str.charAt(1)) {
            return cleanString(str.substring(1));
        } else {
            return str.charAt(0) + cleanString(str.substring(1));
        }
    }

    /**
     * Task 11
     * A method that checks if a number is prime.
     */
    public static boolean isPrime(int n, int i) {
        if (n <= 2) {
            return n == 2;
        }
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }
        return isPrime(n, i + 1);
    }

    /**
     * Task 12
     * A method that returns the largest digit in a decimal string.
     */
    public static int largestDigit(String str) {
        if (str.length() == 1)
            return Integer.parseInt(str);
        if (str.charAt(0) > str.charAt(1))
            return largestDigit(str.substring(1) + str.charAt(0));
        return largestDigit(str.substring(1));
    }

    /**
     * Task 13
     * A method that returns the number of digits in a String
     * consisting of letters and numbers.
     */
    public static int numberOfDigits(String str) {
        if (str.length() == 0)
            return 0;
        try {
            Integer.parseInt(str.substring(0, 1));
            return 1 + numberOfDigits(str.substring(1));
        } catch (NumberFormatException e) {
            return numberOfDigits(str.substring(1));
        }
    }

    /**
     * Task 14
     * A method that adds an asterisk between inch characters of a string.
     */
    public static String addAsterisk(String str, int length) {
        if (length == str.length() - 1) {
            return str.charAt(length) + "";
        }
        return str.charAt(length) + "*" + addAsterisk(str, length + 1);
    }

    /**
     * Task 15
     * A method that adds parentheses in a string in the following way:
     * "example" -> "(e (x (a (m) p) l) e)"
     */
    public static String addParentheses(String str, int n) {
        if (str.length() == 0)
            return ")";

        if (str.length() > n / 2) {
            return '(' + "" + str.charAt(0) + " " + addParentheses(str.substring(1), n);
        }

        if (str.length() == n / 2 && n % 2 == 0) {
            return str.charAt(0) + addParentheses(str.substring(1), n);
        }
        return ')' + " " + str.charAt(0) + addParentheses(str.substring(1), n);
    }

    /**
     * Task 16
     * A method that adds a "mirror" to the given string.
     */
    public static String mirroredString(String str) {
        return str + mirrorString(str);
    }

    private static String mirrorString(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        return mirrorString(str.substring(1)) + str.charAt(0);
    }

    /**
     * Task 17
     * A method that cuts symmetric identical elements from a given string.
     */
    public static String cutSymEms(String str) {
        if (str.length() == 1)
            return str;
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return cutSymEms(str.substring(1, str.length() - 1));
        }
        return str.charAt(0) + cutSymEms(str.substring(1, str.length() - 1)) + str.charAt(str.length() - 1);
    }
}