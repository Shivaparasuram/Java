package LOOPS_x_CONDITION;

import java.util.Scanner;

public class REVERSE_NUMBER {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.println("Reversed numbers are :");
        do {
            System.out.println(n);
            n--;
        }while (n >= 1);
    }
}