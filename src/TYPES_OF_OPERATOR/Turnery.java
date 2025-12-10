package TYPES_OF_OPERATOR;

import java.util.Scanner;

public class Turnery {

    //if true op expression else op statement between ? and :


    public static void main() {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A");
        int a =sc.nextInt();
        System.out.println("Enter B");
        int b =sc.nextInt();


        int r= (a<b)?a:b;
        System.out.println(r);


    }
}
