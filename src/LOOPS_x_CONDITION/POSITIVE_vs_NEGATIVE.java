package LOOPS_x_CONDITION;

import java.util.Scanner;

public class POSITIVE_vs_NEGATIVE {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
         if(num>=0){
             System.out.println("POSITIVE");
         }
         else{
             System.out.println("NEGATIVE");
         }
    }
}
