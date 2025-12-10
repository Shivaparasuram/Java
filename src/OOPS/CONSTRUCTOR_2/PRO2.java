package OOPS.CONSTRUCTOR_2;

import java.util.Scanner;

class person{
    String name1 ;           //instance variables
    int age1;

    person(String name,int age){      //method

        name1=name;                   //local variables
        age1=age;
    }
    public void Details()             //method
    {
        System.out.println(name1+" "+age1);
    }
}

public class PRO2 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter name ");
        String name= sc.nextLine();;
        System.out.println("Enter age");
        int age=sc.nextInt();

        person obj=new person(name,age);
        obj.Details();

    }
}
