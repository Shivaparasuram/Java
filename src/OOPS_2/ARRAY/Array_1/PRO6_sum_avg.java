package OOPS_2.ARRAY.Array_1;

import java.util.Scanner;

public class PRO6_sum_avg {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Size:" );
        int size = sc.nextInt();
        int[] array=new int[size];

        System.out.println("Enter the array Elements :");

        for (int  i=0;i<size;i++){
            array[i]=sc.nextInt();
        }

        int sum=0;
        float avg=0;

        for(int j=0;j<array.length;j++)
        {
            sum += array[j];
            avg= (float) sum /size;
        }
        System.out.println("\nSum of Array Elements is "+sum);
        System.out.println("Avg of Array Elements is "+avg);
    }
}
