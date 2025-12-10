package LOOPS_x_CONDITION;

import java.util.Scanner;

public class NESTED {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number:");
        int a = sc.nextInt();

        System.out.println("Enter b Number:");
        int b = sc.nextInt();

        System.out.println("Enter c Number:");
        int c = sc.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println(a + " is largest");
            } else {
                System.out.println(c + " is largest");
            }
        } else if (b > c) {
            System.out.println(b + " is largest");
        } else {
            System.out.println(c + " is largest");
        }


    }
}