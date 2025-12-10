package LOOPS_x_CONDITION;

import java.util.Scanner;

public class ELSE_IF {
    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = sc.nextInt();

        if(num>0){
            System.out.println("Number is positive!");
        }
        else if(num<0) {
            System.out.println("Number is negative !");
        }
        else{
            System.out.println("Number is Zero!");
        }
    }
}
