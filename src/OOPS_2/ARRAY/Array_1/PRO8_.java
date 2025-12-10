package OOPS_2.ARRAY.Array_1;

import java.util.Scanner;

public class PRO8_ {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Size");
        int size=sc.nextInt();
        System.out.println("Enter array Elements");
        int [] array=new int[size];
        for (int j=0;j<size;j++ )
        {
            array[j]=sc.nextInt();
        }
        System.out.println("\nReverse Array elements are ");
        for (int i= array.length-1;i>=0;i--)
        {
            System.out.print(array[i]+" " );

        }
    }
}
