package LOOPS_x_CONDITION;

import java.util.Scanner;


//LOGIC Year%4==0 && Year%100==00 || (Year%400==0)

public class LEAP_YEAR {
    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year !");
        int Year= sc.nextInt();

        if(Year%4==0 && Year%100==00 || (Year%400==0)){
            System.out.println("Leap Year BUDDY!");
        }
        else{
            System.out.println("Oops! Not a Leap Year DUDE|");
        }
            }

    public static class SWITCH {
        static void main() {


            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a Number 1 to 7:");
            int Day = sc.nextInt();

            switch (Day){
                case 1:
                    System.out.println("monday");
                    break;
                case 2:
                    System.out.println("tuesday");
                    break;
                case 3:
                    System.out.println("wednesday");
                    break;
                case 4:
                    System.out.println("thurday");
                    break;
                case 5:
                    System.out.println("friday");
                    break;
                case 6:
                    System.out.println("saturday");
                    break;
                case 7:
                    System.out.println("sunday");
                    break;

            }


        }
    }
}
