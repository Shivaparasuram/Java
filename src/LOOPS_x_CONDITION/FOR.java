package LOOPS_x_CONDITION;

import java.util.Scanner;

public class FOR {

    //entry loop
    //specific number of iterations

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();

        for(int i = 0; i<=n ; i++){
            System.out.println(i);

        }

    }
}
