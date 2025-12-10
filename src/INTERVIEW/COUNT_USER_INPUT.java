package INTERVIEW;

import java.util.Scanner;

public class COUNT_USER_INPUT {
    static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the NUmber:");
        int num = sc.nextInt();
        int n =num;
        int r=0;
        int count=0;

        while(num!=0){

            num =num/10;
            count++;

        }
        System.out.println("Number of " +count);

    }



}
