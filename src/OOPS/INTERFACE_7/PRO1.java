package OOPS.INTERFACE_7;

interface A
{
    void greet();    //by default abstract and public
}
class Demos implements A
{
    public void greet(){
        System.out.println("\nInterface in Java !");
    }
}

public class PRO1 {
    static void main(String[] args) {
        Demos obj=new Demos();
        obj.greet();

    }
}
