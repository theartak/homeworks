package Day13Homework;

import java.util.Random;
import java.util.Scanner;

public class MainAlt {
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        int a = sc.nextInt();
        //int b = sc.nextInt();
        System.out.println(symmetricDiagonal(a));
    }

    public static int[][] inputSquareMatrix(int a) {
        int[][] mat = new int[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++)
                mat[i][j] = sc.nextInt();
        }
        return mat;
    }

    public static int[][] inputFreeMatrix(int a, int b) {
        int[][] mat = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++)
                mat[i][j] = sc.nextInt();
        }
        return mat;
    }

    public static int[][] inputRandomMatrix(int a, int b) {
        int[][] mat = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                mat[i][j] = rand.nextInt(20);
            }
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

    /**
     * Task 3
     * A method that accepts a matrix from the user and
     * tells if its main diagonal is symmetric.
     */

    public static boolean symmetricDiagonal(int a) {
        int[][] mat = inputSquareMatrix(a);
        for (int i = 0; i < a; i++) {
            for (int j = i; j + 1 < a; j++) {
                if (mat[i][j] != mat[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}