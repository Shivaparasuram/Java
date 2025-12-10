package OOPS_2.ARRAY.Array_1;

import java.util.Scanner;

public class PRO5_userInput {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter The Size Of The Array :");
        int size= sc.nextInt();
        int[] array= new int[size];
        System.out.println("Enter the Array Elements :");

        for (int i =0;i<size;i++)
        {
            array[i]=sc.nextInt();
        }
        System.out.println("Array elements are:");
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}
