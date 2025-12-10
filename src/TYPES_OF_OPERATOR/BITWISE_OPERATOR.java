package TYPES_OF_OPERATOR;

import java.util.Scanner;

public class BITWISE_OPERATOR {
    /// output in numeric values
    /// AND &   OR |    XOR ^    negotion(compliment) ~     L SHIFT <<      R SHIFT >>

    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter A");
        int a = sc.nextInt();
        System.out.println("enter B");
        int b = sc.nextInt();

        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(~a);    //  -(a+1) e.g. a= 10  o/p -11
        System.out.println(a<<2);
        System.out.println(a>>2);




    }
}
