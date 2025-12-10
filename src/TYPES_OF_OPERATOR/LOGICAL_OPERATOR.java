package TYPES_OF_OPERATOR;

import java.util.Scanner;

public class LOGICAL_OPERATOR {
    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A");
        int a =sc.nextInt();
        System.out.println("Enter B");
        int b =sc.nextInt();


        System.out.println(a<1 && b>a);    //AND
        System.out.println(a>b || b==1 ); //OR
        System.out.println(!(a>1 && b>a)); //NOT


    }
}
