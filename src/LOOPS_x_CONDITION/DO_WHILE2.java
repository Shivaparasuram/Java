package LOOPS_x_CONDITION;

import java.util.Scanner;

public class DO_WHILE2 {
    static void main(String[] args) {


        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number:");

        int n = sc.nextInt();
        do{
            System.out.println(n);
            n+=2;
        }while(n<100);
}
}
