package OOPS.INHERITENCE_3;

class Parent
{
    public void A()
    {
        System.out.println("Hello Parents !");
    }
}
class Child extends Parent
{
    public void B()
    {
            System.out.println("Hello Parent and Child !");
    }
}

public class PRO1_single {
    static void main(String[] args) {

        System.out.println("only parent feature !\n");
        Parent obj=new Parent();
        obj.A();

        System.out.println();
        System.out.println("Child can access both parent and his features !\n");

        Child obj1=new Child();
        obj1.A();
        obj1.B();


    }
}
