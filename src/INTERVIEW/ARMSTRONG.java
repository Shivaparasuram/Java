package INTERVIEW;

import java.util.Scanner;

/// number of digit to its lent power e.g. 153 and 1634  1^3+5^3+3^3 where 3 is the length

public class ARMSTRONG {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the NUmber:");
        int num = sc.nextInt();
        int n =num;
        int r =0;

        while(num!=0){

            int a=num%10;
            r=r+a*a*a;
            num=num/10;


        }
        if (r==n){
            System.out.println("ARMSTRONG");
        }else{
            System.out.println("NOT ARMSTRONG");
        }

    }
}
