package LOOPS_x_CONDITION;

import java.util.Scanner;

public class ELSE_IF_3_MARKS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks (0-100): ");
        int marks = scanner.nextInt();

        if (marks > 100 || marks < 0) {
            System.out.println("Invalid marks. Please enter a value between 0 and 100.");
        } else {
            char grade;
            if (marks > 90) {
                grade = 'A';
            } else if (marks > 80) {
                grade = 'B';
            } else if (marks > 70) {
                grade = 'C';
            } else if (marks > 60) {
                grade = 'D';
            } else if (marks > 50) {
                grade = 'E';
            } else {
                grade = 'F'; // Assuming F for marks 50 or below
            }
            System.out.println("Grade: " + grade);
        }

        scanner.close();
    }
}