package day16;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        //long l = sc.nextLong();
        //double start = sc.nextDouble();
        //double step = sc.nextDouble();
        //int b = sc.nextInt();
        //int n = sc.nextInt();
        int a = sc.nextInt();
        //int[][] matrix = new int[4][10];
        rotateMatrix(a);
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

    public static int[][] inputSquareMatrix(int a) {
        int[][] mat = new int[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++)
                mat[i][j] = sc.nextInt();
        }
        return mat;
    }

    public static void printMatrix(int mat[][]) {
        for (int[] ints : mat) {
            System.out.println();
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
        }
    }

    public static void printMatrix(char mat[][]) {
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

    public static int countPowerOfN(int n) {
        if (n < 1 || n > 15) {
            return -1;
        }
        return (int) Math.pow(2, n);
    }

    /**
     * Task 3
     * A method that returns the N power of 2.
     * (Using Bitwise).
     */

    public static int countPowerOfNBit(int n) {
        if (n < 1 || n > 15) {
            return -1;
        }
        return 2 << n - 1;
    }

    /**
     * Task 4
     * A method that prints how much times passed since the start of a day in n minutes.
     * (Using LocalDateTime)
     */
    public static void howMuchTimePassedLDT(long l) {
        LocalDateTime time = LocalDateTime.of(2022, 1, 1, 0, 0);
        Duration m = Duration.ofMinutes(l);
        time = time.plus(m);
        System.out.print(time.toLocalTime().getHour() + " " + time.toLocalTime().getMinute());
    }

    public static void howMuchTimePassed(long l) {
        System.out.println(l / 60 + " " + l % 60);
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
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
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
        printMatrix(mat);
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

    /**
     * Task 11
     * A method that prints an n*m sized multiplication table.
     */

    public static void multiplicationTable(int n, int m) {
        int[][] table = new int[n][m];
        int row;
        int col;
        for (int i = m; i < n * m; i++) {
            row = i / m;
            col = i % m;
            table[row][col] = row * col;
        }
        printMatrix(table);
    }

    /**
     * Task 12
     * A method that fills a matrix diagonally.
     */

    public static void diagonalFillingMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int val = 0;
        int col;
        for (int j = 0; j < m; j++) {
            col = j;
            for (int row = 0; (row < n && col >= 0); row++) {
                matrix[row][col] = val;
                val++;
                col--;
            }
        }
        for (int i = 1; i < n; i++) {
            col = m - 1;
            for (int row = i; (row < n && col >= 0); row++) {
                matrix[row][col] = val;
                val++;
                col--;
            }
        }
        printMatrix(matrix);
    }

    /**
     * Task 13
     * A method that prints a spiral of ascending numbers.
     */

    public static void spiralAsc(int n, int m) {
        int[][] mat = new int[n][m];
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    mat[i][j] = i * 10 + j;
                }
            } else {
                for (int j = 0; j < m; j++) {
                    mat[i][j] = i * 10 + m - 1 - j;
                }
            }
        }
        printMatrix(mat);
    }

    /**
     * Task 14
     * A method that lets the user rotate a matrix 90, or 180 degrees.
     */

    public static void rotateMatrix(int a) {
        System.out.println("Input your matrix");
        int[][] mat = inputSquareMatrix(a);
        System.out.println("Input 1 to rotate by 90 degrees, or 2 to rotate by 180 degrees");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                printMatrix(rotateMatrix90(mat));
                break;
            case 2:
                printMatrix(rotateMatrix180(mat));
                break;
            default:
                System.out.println("Illegal choice");
        }
    }

    public static int[][] rotateMatrix90(int[][] mat) {
        int len = mat.length;
        int newLen = len - 1;
        for (int i = 0; i < len / 2; i++) {
            for (int j = i; j < newLen - i; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[newLen - j][i];
                mat[newLen - j][i] = mat[newLen - i][newLen - j];
                mat[newLen - i][newLen - j] = mat[j][newLen - i];
                mat[j][newLen - i] = temp;
            }
        }
        return mat;
    }

    public static int[][] rotateMatrix180(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int num;
        for (int i = 0; i < row / 2; i++) {
            for (int j = 0; j < col; j++) {
                num = mat[i][j];
                mat[i][j] = mat[row - i - 1][col - j - 1];
                mat[row - i - 1][col - j - 1] = num;
            }
        }
        if ((row & 1) == 1) {
            for (int j = 0; j < col / 2; j++) {
                num = mat[row / 2][j];
                mat[row / 2][j] = mat[row / 2][col - j - 1];
                mat[row / 2][col - j - 1] = num;
            }
        }
        return mat;
    }
}