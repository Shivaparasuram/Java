package LOOPS_x_CONDITION;

import java.util.Scanner;

public class ELSE_IF_2 {
    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int a = sc.nextInt();
        System.out.println("Enter b Number:");
        int b = sc.nextInt();
        System.out.println("Enter c Number:");
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println("a is the LARGEST!");
        }
        else if(b>a && b>c) {
            System.out.println("b is the LARGEST!");
        }
        else{
            System.out.println("c is the LARGEST !");
        }
    }
}
