package OOPS_2.ARRAY.MULTI_DIMENSIONAL_2;

import java.util.Scanner;

public class PRO4_multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dimensions
        System.out.print("Enter rows of first matrix: ");
        int rowsA = sc.nextInt();
        System.out.print("Enter columns of first matrix: ");
        int colsA = sc.nextInt();

        System.out.print("Enter rows of second matrix: ");
        int rowsB = sc.nextInt();
        System.out.print("Enter columns of second matrix: ");
        int colsB = sc.nextInt();

        // Check if multiplication is possible
        if (colsA != rowsB) {
            System.out.println("Matrix multiplication not possible! Columns of A must equal rows of B.");
            return;
        }

        int[][] A = new int[rowsA][colsA];
        int[][] B = new int[rowsB][colsB];
        int[][] C = new int[rowsA][colsB];

        // Input first matrix
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Input second matrix
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // Multiply matrices
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                C[i][j] = 0;
                for (int k = 0; k < colsA; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Display result
        System.out.println("\nResultant Matrix (Product):");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(C[i][j] );
            }
            System.out.println();
        }
    }
}