package Day13Homework;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        //int a = sc.nextInt();
        //int b = sc.nextInt();
        addTwoMatrices();
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

    /**
     * Task 4
     * A method that prints the winner's score.
     */

    public static void highestScore(int a, int b) {
        int[][] mat = inputFreeMatrix(a, b);
        int temp;
        int score = 0;
        int line = 0;
        for (int i = 0; i < a; i++) {
            temp = 0;
            for (int j = 0; j < b; j++) {
                temp += mat[i][j];
            }
            if (temp > score) {
                score = temp;
                line = i;
            }
        }
        System.out.println("Max is " + score + " Line is " + line);
    }

    /**
     * Task 5
     * A method that prints the winner's score, their row and column.
     */

    public static void highestScore2(int a, int b) {
        int[][] arr = inputFreeMatrix(a, b);
        int max = 0;
        int maxI = 0;
        int maxJ = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    maxI = i;
                    maxJ = j;
                }
            }
        }
        System.out.println("Highest score: " + max + ", row: " + maxI + ", column: " + maxJ);
    }

    /**
     * Task 6
     * A method that prints the row of the winning athlete.
     */

    public static void highestScoreRow(int a, int b) {
        int[][] matrix = inputFreeMatrix(a, b);
        int max = 0;
        int sum = 0;
        int realSum = 0;
        int row = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                realSum += matrix[i][j];
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    row = i;
                    sum = realSum;
                }
                if (matrix[i][j] == max) {
                    if (realSum > sum) {
                        row = i;
                    }
                }
            }
            realSum = 0;
        }
        System.out.println("The winner's row is " + row);
    }

    /**
     * Task 8
     * A method that adds to matrices of the same size.
     */

    public static void addTwoMatrices() {
        System.out.println("Input the size: ");
        int a = sc.nextInt();
        int[][] mat1 = inputSquareMatrix(a);
        int[][] mat2 = inputSquareMatrix(a);
        System.out.println("Result");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(mat1[i][j] + mat2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
