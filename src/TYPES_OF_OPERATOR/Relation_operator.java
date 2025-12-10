package TYPES_OF_OPERATOR;

import java.util.Scanner;

public class Relation_operator {
    static void main(String[] args) {

        //USER INPUT
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter A ");
        int a =sc.nextInt();
        System.out.println("Enter B ");
        int b =sc.nextInt();

        //RELATIONAL OPERATOR
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);

    }
}
