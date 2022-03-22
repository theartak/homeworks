package recursiondemo;

public class Main {
    public static void main(String[] args) {
        callFibonacci(10);
    }

    /**
     * Palindrome
     */

    public static boolean isPalRec(String str, int a, int b) {
        if (a == b) {
            return true;
        }
        if ((str.charAt(a)) != (str.charAt(b))) {
            return false;
        }
        if (a < b + 1) {
            return isPalRec(str, a + 1, b - 1);
        }
        return true;
    }

    public static boolean isPalindrome(String str) {
        int n = str.length();
        if (n == 0) {
            return true;
        }
        return isPalRec(str, 0, n - 1);
    }

    /**
     * Factorial
     */

    public static long factorial(int num) {
        if (num >= 1) {
            return num * factorial(num - 1);
        } else {
            return 1;
        }
    }

    /**
     * Fibonacci series
     */

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void callFibonacci(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
