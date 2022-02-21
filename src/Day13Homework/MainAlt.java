package Day13Homework;

import java.util.Random;
import java.util.Scanner;

public class MainAlt {
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        int a = sc.nextInt();
        //int b = sc.nextInt();
        spiralOneZeroAlt(a);
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

    /**
     * Task 9
     */

    public static void spiralOneZeroAlt(int a) {
        int[][] mat = new int[a][a];
        int count = 0;
        int count1 = 0;
        for (int j = 0; j < a / 3; j++) {
            for (int i = count1; i < a - count; i++) {                 //up-horizontal
                mat[count][i] = 1;
            }
            for (int i = count; i < a - count; i++) {                  //right-vertical
                mat[i][a - 1 - count] = 1;
            }
            for (int i = a - 1 - count; i >= count; i--) {             //down-horizontal
                mat[a - 1 - count][i] = 1;
            }
            for (int i = a - 1 - count; i > 1 + count; i--) {          //left-vertical
                mat[i][count] = 1;
            }
            count += 2;
            if (count1 == 0) count1 += 1;
            else count1 += 2;
        }
        printMatrix(mat);
    }
}