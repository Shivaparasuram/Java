package OOPS.METHODS_1;

import java.util.Scanner;

class person{
    public void details(String name, int age)
    {
        System.out.println(name+ " "+age);
    }

}

public class PRO5_INPUT {
    static void main(String[] args) {

        person obj = new person();

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the person details");
        String name=sc.nextLine();
        System.out.println("Enter Age");
        int age =sc.nextInt();

        obj.details(name,age);
        obj.details("Shiva",20);
    }
}

