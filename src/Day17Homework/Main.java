package Day17Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        int[] a = {1, 2, 3, 4, 5};
//        float[] b = {1, 2, 3, 4, 5};
//        double[] d = {1, 2, 3, 4, 5};
        //int choice = sc.nextInt();
        //float celsius = 0;
        //float fahrenheit = 64;
        System.out.println(remainder(331, 5));
    }

    /**
     * Task 1
     * 3 types of overridden methods.
     */
    public static void add(int a, int b) {
        System.out.println("int a, int b");
    }

    public static void add(float a, double b) {
        System.out.println("float a, double b");
    }

    public static void add(int a, long b) {
        System.out.println("int a, long b");
    }

    /**
     * Task 2 & 3
     * An overridden method that returns float, or int depending.
     * (Bugged version under a comment)
     */

    /*
    public static int method1(int a) {
        return a;
    }

    public static float method1(int a) {
        return a;
    }
     */
    public static int method1(int a) {
        return a;
    }

    public static float method1(float a) {
        return a;
    }

    /**
     * Task 4
     */

    public static void print(int[] a) {
        System.out.println(Arrays.toString(a));
    }

    public static void print(float[] a) {
        System.out.println(Arrays.toString(a));
    }

    public static void print(double[] a) {
        System.out.println(Arrays.toString(a));
    }

    /**
     * Task 5
     */

    public static int search(int[] array) {
        return array.length;
    }

    public static int search(int[] array, int a) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == a) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static boolean search(int[] array, int argument, int index) {
        return array[index] == argument && index < array.length;
    }

    /**
     * Task 6
     * A method that returns the perimeter of a square, square or a rectangle depending on the argument.
     */

    public static int area(int a) {
        int pi = (int) Math.PI;
        return pi * a * a;
    }

    public static float area(float a) {
        return a * a;
    }

    public static int area(int a, int b) {
        return a * b;
    }

    /**
     * Task 7
     * A method that returns the maximum of (a, b), (a, b, c), or (a, b, c, d).
     */

    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static int max(int a, int b, int c) {
        return max(a, max(b, c));
    }

    public static int max(int a, int b, int c, int d) {
        return max(a, max(b, c, d));
    }

    /**
     * Task 8
     */

    public static int distance(int x1, int x2) {
        return (int) Math.pow((Math.pow(x1, 2) + Math.pow(x2, 2)), 0.5);
    }

    //x1 - x coordinate of a
    //x2 - y coordinate of a
    //x3 - x coordinate of b
    //x4 - y coordinate of b
    public static int distance(int x1, int x2, int x3, int x4) {
        return (int) Math.sqrt((x4 - x2) * (x4 - x2) + (x3 - x1) * (x3 - x1));
    }

    /**
     * Task 9
     */

    public static void fahrenheitCelsius(float celsius, int choice) {
        if (choice == 1) {
            int fahrenheit = (int) ((celsius * 9) / 5) + 32;
            System.out.println(fahrenheit);
        } else if (choice == 2) {
            double fahrenheit = (double) ((celsius * 9) / 5) + 32;
            System.out.println(Math.round(fahrenheit));
        } else {
            System.out.println("Invalid argument");
        }
    }

    public static void fahrenheitCelsius(int choice, float fahrenheit) {
        if (choice == 1) {
            int celsius = (int) ((fahrenheit - 32) * 5 / 9);
            System.out.println(celsius);
        } else if (choice == 2) {
            double celsius = (double) ((fahrenheit - 32) * 5 / 9);
            System.out.println(Math.round(celsius));
        } else {
            System.out.println("Invalid argument");
        }
    }

    /**
     * Task 10
     * A method that.
     * a) Returns the sum of digits of a given number
     * b) Returns the remainder of the sum of digits divided by the second argument.
     */

    public static int remainder(int num) {
        int digit = 0;
        int sum = 0;
        while (num > 0) {
            digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        return sum;
    }

    public static int remainder(int num, int a) {
        return remainder(num) % a;
    }
}
