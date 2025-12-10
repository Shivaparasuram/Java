package OOPS.OBJECTS;

class Employee{
    String Emp_name="STAR !";
    int Emp_id=123;
    int Emp_salary=678923;
}

class Department{
    int Dep_id=678;
    String Dep_name="xyz";

        }

public class OBJ5 {
    static void main(String[] args) {

        Employee E;
        E = new Employee();
        Department D=new Department();
        System.out.println("\nName is "+E.Emp_name+"\nID is " +E.Emp_id+"\nSalary is "+E.Emp_salary+"\n"+"\nDepartment ID is "+D.Dep_id+"\nDepartment name is "+D.Dep_name);

    }
}
