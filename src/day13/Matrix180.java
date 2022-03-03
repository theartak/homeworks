package day13;

import java.util.Random;
import java.util.Scanner;

public class Matrix180 {

    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        int a = sc.nextInt();
        rotateBy180(a);
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

    public static void rotateBy180(int a) {
        int[][] mat = inputSquareMatrix(a);
        int num;
        for (int i = 0; i < a / 2; i++) {
            for (int j = 0; j < a; j++) {
                num = mat[i][j];
                mat[i][j] = mat[a - i - 1][a - j - 1];
                mat[a - i - 1][a - j - 1] = num;
            }
        }
        if ((a & 1) == 1) {
            for (int j = 0; j < a / 2; j++) {
                num = mat[a / 2][j];
                mat[a / 2][j] = mat[a / 2][a - j - 1];
                mat[a / 2][a - j - 1] = num;
            }
        }
        printMatrix(mat);
    }

    public static void rotateBy180ACA(int a) {
        int[][] mat = inputSquareMatrix(a);
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
        printMatrix(mat);
    }

    public static void printRotateBy180(int a) {
        int[][] mat = inputSquareMatrix(a);
        for (int i = a - 1; i >= 0; i--) {
            System.out.println();
            for (int j = a - 1; j >= 0; j--) {
                System.out.print(mat[i][j] + " ");
            }
        }
    }
}
