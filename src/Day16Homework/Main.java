package Day16Homework;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Random;
import java.util.Scanner;

import Day13Homework.Main.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        //int n = sc.nextInt();
        spiralAsc(4, 10);
    }

    /**
     * Extra methods.
     */

    public static boolean isPalindrome(String str) {
        String reverseStr = "";
        int len = str.length();
        for (int i = len - 1; i >= 0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }
        return str.toLowerCase().equals(reverseStr.toLowerCase());
    }

    public static void printMatrix(int mat[][]) {
        for (int[] ints : mat) {
            System.out.println();
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
        }
    }

    public static void printCharMatrix(char mat[][]) {
        for (char[] ints : mat) {
            System.out.println();
            for (char anInt : ints) {
                System.out.print(anInt + " ");
            }
        }
    }

    /**
     * Task 3
     * A method that returns the N power of 2.
     */

    public static Long countPowerOfN(int n) {
        if (n < 1 || n > 15) {
            return null;
        }
        return (long) Math.pow(2, n);
    }

    /**
     * Task 4
     * A method that prints how much times passed since the start of a day in n minutes.
     * (Using LocalDateTime)
     */
    public static void howMuchTimePassedLDT(long n) {
        LocalDateTime time = LocalDateTime.of(2022, 1, 1, 0, 0);
        Duration m = Duration.ofMinutes(n);
        time = time.plus(m);
        System.out.print(time.toLocalTime().getHour() + " " + time.toLocalTime().getMinute());
    }

    public static void howMuchTimePassed(long n) {
        System.out.println(n / 60 + " " + n % 60);
    }

    /**
     * Task 5
     * A method that returns the count of loops in the given cycles.
     */
    public static int countOfLoop() {
        int count = 0;
        for (int i = 2; i <= 15; i++) {
            count++;
        }
        for (int i = 10; i <= 100; i++) {
            count++;
        }
        for (float i = 1.5f; i <= 10.3f; i++) {
            count++;
        }
        return count;
    }

    /**
     * Task 5.2
     * A method that checks if the number is prime.
     */
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    /**
     * Task 6
     * A method that checks prints all palindrome numbers in the given range.
     */
    public static void printPalindromeNums(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (!(isPalindrome(Integer.toString(i)))) {
                continue;
            }
            System.out.println(i);

        }
    }

    /**
     * Task 7
     * A method that accepts a string of letters and returns it a way
     * that the first letter is uppercase, the rest is lowercase.
     */

    public static String firstLetterUppercase(String str) {
        if (!str.toLowerCase().matches("[a-z]+")) {
            return "Only letters allowed";
        }
        return str.substring(0, 1).toUpperCase().concat(str.substring(1).toLowerCase());
    }

    /**
     * Task 8
     * A method that prints a black-white checkerboard.
     */

    public static void checkerboard(int n) {
        char[][] mat = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = (i + j) % 2 == 0 ? 'O' : 'X';
            }
        }
        printCharMatrix(mat);
    }

    /**
     * Task 9
     * A method that returns the n-th element of a geometric progression.
     * (Using a for loop).
     */

    public static double getProgFor(double start, double step, int n) {
        for (double i = 1; i <= n - 1; i++) {
            start *= step;
        }
        return start;
    }

    /**
     * Task 9
     * A method that returns the n-th element of a geometric progression.
     * (Using Math.pow).
     */

    public static double getProgMathPow(double start, double step, int n) {
        return start * (Math.pow(step, n - 1));
    }

    /**
     * Task 10
     * A method that expands the given number into prime factors.
     */

    public static void primeFactors(int n) {
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                n = n / i;
                System.out.print(i + " ");
            }
        }
    }

    public static void multTab(int n, int m) {
        int[][] mat = new int[n][m];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = (i + 1) * (j + 1);
            }
        }
        printMatrix(mat);
    }

    public static void spiralAsc(int a, int b) {
        int[][] mat = new int[a][b];
        int rowStart = 0;
        int rowEnd = mat[b].length - 1;
        int colStart = 0;
        int colEnd = mat[a].length - 1;
        int num = 0;
        while (rowStart <= rowEnd) {
            for (int j = colStart; j <= colEnd; j++) {
                mat[rowStart][j] = num;
                num++;
            }
            rowStart++;
            for (int i = rowStart; i <= rowEnd; i++) {
                mat[i][colEnd] = num;
                num++;
            }
            colEnd--;
            for (int j = colEnd; j >= colStart; j--) {
                mat[rowEnd][j] = num;
                num++;
            }
            rowEnd--;
            for (int i = rowEnd; i >= rowStart; i--) {
                mat[i][colStart] = num;
                num++;
            }
            colStart++;
        }
        printMatrix(mat);
    }
}