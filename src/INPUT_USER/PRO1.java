package INPUT_USER;

import java.util.Scanner;

public class PRO1 {
    static void main() {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Name :");
        String Name = sc.nextLine();

        System.out.println("Enter the age :");
        int age=sc.nextInt();

        System.out.println("Enter the Number :");
        float num=sc.nextFloat();

        System.out.println("Enter the phone :");
        long phone=sc.nextLong();

        System.out.println("Name is "+Name+"\n Age is "+age+"\nNumber is " +num +"\nPhone" +phone);



    }
}
