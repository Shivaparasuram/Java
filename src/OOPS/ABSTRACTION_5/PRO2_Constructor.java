package OOPS.ABSTRACTION_5;

abstract class A{
    String name;
    A(String name){
        this.name=name;
    }
    abstract void details();

}
class B extends A{
    B(String name){
        super(name);

    }
    @Override
    void details() {
        System.out.println("Details of: " + name);
    }

}
public class PRO2_Constructor {
    static void main(String[] args) {
        B obj= new B("BOBBY");
        obj.details();

    }
}
