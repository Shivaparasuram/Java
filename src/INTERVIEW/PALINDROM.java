package INTERVIEW;

import java.util.Scanner;

public class PALINDROM {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int n = num;   //copy the input
        int rev=0;

        while (num!=0){

            int a= num%10;
            rev= rev*10+a;
            num =num/10;

        }
        if(n==rev){
            System.out.println("PALINDROME");
        }
        else {
            System.out.println("NOT-PALINDROME");

        }

    }
}
