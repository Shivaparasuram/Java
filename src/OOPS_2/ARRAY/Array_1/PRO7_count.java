package OOPS_2.ARRAY.Array_1;

import java.util.Scanner;

public class PRO7_count {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        int size = sc.nextInt();
        System.out.println("Enter the element to find ");
        int find= sc.nextInt();
        System.out.println("Enter the array elements");
        int[] array = new int[size];
        for (int j=0;j<size;j++)
        {
            array[j]=sc.nextInt();
        }
        int count =0;
        for (int i =0;i<size;i++){
           if(array[i]==find)
           {
               count++;
           }
        }
        System.out.println(find + " appears " + count + " times !");
        
    }
}
