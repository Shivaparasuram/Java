package OOPS_2.ARRAY.MULTI_DIMENSIONAL_2;

import java.util.Scanner;

public class PRO2_input {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Rows ");
        int r= sc.nextInt();
        System.out.println("Column ");
        int c= sc.nextInt();

        int[][] Array= new int[r][c];
        System.out.println("Enter the Array elements ");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                Array[i][j]=sc.nextInt();
            }
            System.out.println();
        }

        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(Array[i][j]+" ");
            }
            System.out.println();
        }

    }
}
