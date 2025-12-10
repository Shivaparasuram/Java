package LOOPS_x_CONDITION;

import java.util.Scanner;

public class CONDTION_STATEMENT {

    //check for the condition if true execute else
    //FLEX  REPEAT AUTOMATE EFFICIENCY

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age:");
        int age= sc.nextInt();

        if(age>18){
            System.out.println("Great, Eligible for Voting !");
        }

        else{
            System.out.println("Ooops, sorry better try next YEAR !");
        }

    }

}
