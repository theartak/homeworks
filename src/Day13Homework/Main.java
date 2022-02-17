package Day13Homework;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        int a = sc.nextInt();
        symmetricDiagonal(a);
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
     * Task 1
     * A method that lets the user input elements and print a matrix.
     */

    public static void diagonalMatrix1(int a) {
        int[][] mat = new int[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (j == a - i - 1) {
                    mat[i][j] = 1;
                } else {
                    mat[i][j] = 0;
                }
            }
        }
        printMatrix(mat);
    }

    /**
     * Task 2
     * A method that lets the user input elements and print a matrix.
     */

    public static void diagonalMatrix2(int a) {
        int[][] mat = new int[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (j == a - i - 1) {
                    mat[i][j] = 1;
                } else if (i + j < a) {
                    mat[i][j] = 0;
                } else {
                    mat[i][j] = 2;
                }
            }
        }
        printMatrix(mat);
    }

    /**
     * Task 3
     * A method that accepts a matrix from the user and
     * tells if its main diagonal is symmetric.
     */

    public static void symmetricDiagonal(int a) {
        int[][] mat = inputSquareMatrix(a);
        boolean symmetric = true;
        for (int i = 0; i < a; i++) {
            for (int j = i; j < a; j++) {
                if (mat[i][j] != mat[j][i]) {
                    symmetric = false;
                    break;
                }
            }
        }
        if (symmetric) {
            System.out.println("The main diagonal is symmetric");
        } else {
            System.out.println("The main diagonal is not symmetric");
        }
    }
}
