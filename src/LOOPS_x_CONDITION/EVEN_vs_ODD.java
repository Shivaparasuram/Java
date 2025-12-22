package LOOPS_x_CONDITION;

import java.util.Scanner;

public class EVEN_vs_ODD {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("EVEN BRO!");
        }
        else {
            System.out.println("ODD BUDDY!");
        }

    }
}
