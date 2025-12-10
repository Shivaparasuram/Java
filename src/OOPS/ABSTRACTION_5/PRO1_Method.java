package OOPS.ABSTRACTION_5;

abstract class Demo {          //abstract class
    abstract void display();   //abstract method
    abstract void Show(String name,int age);

    void java() {              //normal method
        System.out.println("Normal Method !");
    }
}

class Demo1 extends Demo {
    void display() {
        System.out.println("\nAbstract method 1 !");
    }
    void Show(String name,int age){
        System.out.print("Name "+name +" ");
        System.out.println("Age "+age);
    }
}

public class PRO1_Method {
    public static void main(String[] args) {
        Demo1 obj = new Demo1();
        obj.display();
        obj.Show("Dude!",22);
        obj.java();
    }
}