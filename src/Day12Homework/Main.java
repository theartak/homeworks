package Day12Homework;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        int a = sc.nextInt();
        swapMinMax(a);
    }

    public static int[] inputArr(int a) {
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int[] inputRandomArr(int a) {
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = rand.nextInt(20);
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    /**
     * Task 1
     * A method that prints all elements of the array with even indices.
     */

    public static void printEvenIndices(int a) {
        int[] arr = inputRandomArr(a);
        for (int i = 0; i < a; i++) {
            if (i % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    /**
     * Task 2
     * A method that prints all even numbered items in the list.
     */

    public static void printEvenElements(int a) {
        int[] arr = inputRandomArr(a);
        for (int i = 0; i < a; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    /**
     * Task 3
     * A method that finds the number of positive elements in the given array.
     */

    public static void posElemsCount(int a) {
        int count = 0;
        int[] arr = inputArr(a);
        for (int i = 0; i < a; i++) {
            if (arr[i] > 0) {
                count++;
            }
        }
        System.out.println("The amount of positive elements is " + count);
    }

    /**
     * Task 4
     * A method that prints all the elements of the list that are
     * larger than the previous element.
     */

    public static void previousLarger(int a) {
        int[] arr = inputArr(a);
        for (int i = 1; i < a; i++) {
            if (arr[i - 1] < arr[i]) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    /**
     * Task 5
     * A method that checks if an array has two adjacent elements
     * of the same sign and prints them if there are any.
     */

    public static void sameSignElems(int a) {
        int[] arr = inputArr(a);
        for (int i = 0; i < a - 1; i++) {
            if ((arr[i] > 0 && arr[i + 1] > 0) ||
                    (arr[i] < 0 && arr[i + 1] < 0)) {
                System.out.print(arr[i] + " ");
                System.out.print(arr[i + 1] + "\n");
                break;
            }
        }
    }

    /**
     * Task 6
     * A method that prints the largest element of the array.
     */

    public static void largestElem(int a) {
        int[] arr = inputArr(a);
        int index = 0;
        for (int i = 0; i < a; i++) {
            if (arr[i] > arr[index]) {
                index = i;
            }
        }
        System.out.println("Largest element: " + arr[index]);
        System.out.println("Index: " + index);
    }

    /**
     * Task 7
     * A method that prints the smallest positive element of a given array.
     */

    public static void smallestPosElem(int a) {
        int min = Integer.MAX_VALUE;
        int[] arr = inputArr(a);
        for (int i = 0; i < a; i++) {
            if (min > arr[i] && arr[i] > 0) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }

    /**
     * Task 8
     * A method that prints the count of unique elements in the array.
     */

    public static void diffElemsCount(int a) {
        int count = 1;
        int[] arr = inputArr(a);
        if (a == 0) {
            System.out.println("No elements in the array");
            return;
        }
        for (int i = 1; i < a; i++) {
            if (arr[i] > arr[i - 1]) {
                count++;
            }
        }
        System.out.println(count);
    }

    /**
     * Task 9
     * A method that reverses the given array without changing
     * the values of elements and prints it.
     */

    public static void reverseArray(int a) {
        int[] arr = inputArr(a);
        for (int i = a - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    /**
     * Task 10
     * A method that reverses the given array and prints it.
     */

    public static void rearrangeArray(int a) {
        int[] arr = inputArr(a);
        for (int i = 0; i < a - i; i++) {
            int num = arr[i];
            arr[i] = arr[a - i - 1];
            arr[a - i - 1] = num;
        }
        printArray(arr);
    }

    /**
     * Task 11
     * A method that reverses adjacent elements of an array
     * and keeps the last element in place if the number of
     * elements is odd.
     */

    public static void reverseAdjacentElems(int a) {
        int[] arr = inputArr(a);
        for (int i = 1; i < a; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i - 1];
            arr[i - 1] = temp;
        }
        printArray(arr);
    }

    /**
     * Task 12
     * A method that sends the last element of an array to the beginning
     * making elements go right 1 step.
     */

    public static void arrayElemsToRight(int a) {
        int[] arr = inputArr(a);
        int dif = arr[a - 1];
        for (int i = a - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = dif;
        printArray(arr);
    }

    /**
     * Task 13
     * A method that swaps the smallest and largest elements of an array.
     */

    public static void swapMinMax(int a) {
        int[] arr = inputArr(a);
        int min = arr[0];
        int max = arr[0];
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 0; i < a; i++) {
            if (min > arr[i]) {
                min = arr[i];
                minIndex = i;
            }
            if (max < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
        }
        int swap = arr[maxIndex];
        arr[maxIndex] = arr[minIndex];
        arr[minIndex] = swap;
        printArray(arr);
    }
}
