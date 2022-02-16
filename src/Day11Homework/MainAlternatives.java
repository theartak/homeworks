package Day11Homework;

import java.util.Random;
import java.util.Scanner;

public class MainAlternatives {
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {

    }

    /**
     * Task 6
     * A method that returns the smallest natural divisor of a given number.
     * (Alternative method).
     */

    public static int smallestDivisorAlt(int a) {
        if (a % 2 == 0) {
            return 2;
        }
        for (int i = 3; i * i <= a; i += 2) {
            if (a % i == 0) {
                return i;
            }
        }
        return a;
    }

    /**
     * Task 8
     * A method that prints the count of all natural divisors of a given number.
     * (Alternative method).
     */

    public static int allDivisorsAlt(int x) {
        int count = 2;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                count += 2;
                if (x / i == 1) {
                    count--;
                }
            }
        }
        return count;
    }

    /**
     * Task 10
     * A method that accepts a binary number and converts it to decimal.
     * (Even more optimal method)
     */

    public static int binToDecOpt(long bin) {
        long dec = 0;
        long pow = 1;
        for (; bin != 0; bin /= 10) {
            dec += (pow * bin % 10);
            pow <<= 1;
        }
        return (int) dec;
    }

    /**
     * Task 14
     * A method N*N sized checkerboard.
     * (Alternative)
     */

    public static void printCheckerboardAlt(int a) {
        String row = "";
        for (int i = 0; i < a; i++) {
            row += "*";
        }
        for (int i = 0; i < a; i++) {
            System.out.println(row);
        }
    }
}
