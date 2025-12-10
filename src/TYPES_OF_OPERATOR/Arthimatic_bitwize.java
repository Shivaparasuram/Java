package TYPES_OF_OPERATOR;

import java.util.Scanner;

public class Arthimatic_bitwize {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A");
        int a =sc.nextInt();
        System.out.println("Enter B");
        int b =sc.nextInt();

        System.out.println(a&=b);
        System.out.println(a|=b);
        System.out.println(a^=b);
        System.out.println(a>>=b);
        System.out.println(a<<=b);


    }
}
