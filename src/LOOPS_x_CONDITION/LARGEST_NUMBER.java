package LOOPS_x_CONDITION;

import java.util.Scanner;

public class LARGEST_NUMBER {
    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A");
        int a = sc.nextInt();
        System.out.println("Enter B");
        int b = sc.nextInt();

        if (a>b){
            System.out.println("A is the LARGEST"+a);

        }
        else{
            System.out.println("B is smallest");
        }


    }
}
