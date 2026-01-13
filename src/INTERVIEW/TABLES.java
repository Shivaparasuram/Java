package INTERVIEW;

import java.util.Scanner;

public class TABLES {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number that u want:");
        int n= sc.nextInt();
        int result=0;
        for(int i=1;i<11;i++){

            System.out.println(n+"*"+i+"="+n*i);

        }

    }
}
