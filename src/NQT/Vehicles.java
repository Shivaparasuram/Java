package NQT;
import java.util.Scanner;

public class Vehicles
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vehicles: ");
        int v = sc.nextInt();
        System.out.println("Wheels: ");
        int w = sc.nextInt();

        if (w % 2 != 0 || w < 2 * v || w > 4 * v)
        {
            System.out.println(-1);
            return;
        }

        int fourWheeler = (w - 2 * v) / 2;
        int twoWheeler = v - fourWheeler;

        System.out.println("4-Wheelers: " + fourWheeler + ", 2-Wheelers: " + twoWheeler);
    }
}






/*

Problem Statement

You are given two integers:
- v → the total number of vehicles (consisting only of 2‑wheelers and 4‑wheelers)
- w → the total number of wheels
You need to determine how many of the vehicles are 2‑wheelers and how many are 4‑wheelers.
Conditions
- If the number of wheels is odd, or less than 2*v, or greater than 4*v, print -1.
- Otherwise, calculate and print the number of 4‑wheelers and 2‑wheelers.
Input Format
- First line: integer v (number of vehicles)
- Second line: integer w (number of wheels)
Output Format
- Print two integers separated by a space:
- First → number of 4‑wheelers
- Second → number of 2‑wheelers
- If input is invalid, print -1.

 */