package OOPS_2.ARRAY.MULTI_DIMENSIONAL_2;

import java.util.Scanner;

public class PRO3_sum_2_array {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Rows ");
        int r= sc.nextInt();
        System.out.println("Enter Col ");
        int c= sc.nextInt();

        int[][] A =new int[r][c];
        int[][] B;
        B = new int[r][c];

        System.out.println("Enter elements of A array ");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                A[i][j]=sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("Enter elements of B array ");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                B[i][j]=sc.nextInt();
            }
            System.out.println();
        }

        // Add to Arrays
        int[][] sum=new int[r][c];
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                sum[i][j]=A[i][j]+B[i][j];
            }
            System.out.println();
        }

        // PRINT the Sum
        System.out.println("Sum of A and B Metrics ");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();

        }
    }
}
