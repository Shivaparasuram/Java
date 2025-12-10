package OOPS.METHODS_1;

import java.util.Scanner;

class Company{
    public void Employee(String name,int salary,String department){
        System.out.println(name+" "+salary+ " "+department);
    }
    public void Department(int ID,String Dep_name){
        System.out.println(ID+" "+Dep_name);

    }

}

public class PRO6 {
    static void main(String[] args) {
        Company obj=new Company();
        Scanner sc = new Scanner(System.in);

        System.out.println("EMPLOYEE");
        System.out.println("Employee name:");
        String name= sc.nextLine();
        System.out.println("Employee sal:");
        int salary=sc.nextInt();
        System.out.println("Employee department:");
        String department = sc.next();

        System.out.println();

        System.out.println("DEPARTMENT");
        System.out.println("department dep name");
        String  Dep_name =sc.next();
        System.out.println("department ID:");
        int ID= sc.nextInt();



        obj.Employee("Shiva",29292,"Java");
        obj.Department(12,"java");

        obj.Employee(name, salary, department);
        obj.Department(ID, Dep_name);

    }

}
