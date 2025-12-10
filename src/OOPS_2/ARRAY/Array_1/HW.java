package OOPS_2.ARRAY.Array_1;

import java.util.Scanner;

public class HW {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size ");
        int size = sc.nextInt();
        System.out.println("Enter the array elements :");
        int[] array= new int[size];
        for (int i =0;i<size;i++){
            array[i]=sc.nextInt();
        }
        int largest=-1;
        int second_largest=array[0];
        for (int i=0;i<array.length;i++)
        {
            if(array[i]>largest)
            {
            second_largest = largest;
            largest=array[i];
            }
            else if(array[i]>second_largest && array[i] != largest){
                second_largest =array[i];
            }
        }
        System.out.println("Second largest is :"+second_largest);
    }
}
