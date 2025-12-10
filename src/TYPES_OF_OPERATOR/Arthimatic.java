package TYPES_OF_OPERATOR;

import java.util.Scanner;

//new is keyword and also operator


public class Arthimatic {
    public static void main(String[] args) {

        // USER INPUT
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A:");
        int a= sc.nextInt();
        System.out.println("Enter B:");
        int b =sc.nextInt();



        System.out.println("ADD" + a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(a*b);
        System.out.println("PRE INCREMENT"+ ++a);

        System.out.println(a++);

        System.out.println("POST INCREMENT" + b--);

        System.out.println(--b);


    }
}
