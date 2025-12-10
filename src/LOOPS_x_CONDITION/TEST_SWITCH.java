package LOOPS_x_CONDITION;

import java.util.Scanner;


//REPETATION AUTOMATION FLEXIBILITY EFFICIENCY

public class TEST_SWITCH {

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks from 50 to 100 IN MULTI OF 10 :");
        int marks = sc.nextInt();
        switch (marks){

            case 90-100:
                System.out.println("A grade");
                break;
            case 80:
                System.out.println("B grade");
                break;
            case 70:
                System.out.println("C grade");
                break;
            case 60:
                System.out.println("D grade");
                break;
            case 50:
                System.out.println("E grade");
                break;
            default:
                System.out.println("Enter a valid number:ERROR !");


        }
    }
}
