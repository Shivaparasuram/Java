package OOPS.INTERFACE_7;

interface Bird{
    void B1(String Name);

}
interface Parrot extends Bird{
    void B2(String color);
}
interface Budgerigar extends Bird{
    void B3(String color);
}
class C1 implements Parrot,Budgerigar{

    public void B1(String Name){
        System.out.println("Parent name "+Name);
    }
    @Override
    public void B2(String color) {
        System.out.println("Color "+color);
    }
    @Override
    public void B3(String color){
        System.out.println("Color "+color);
    }
}
public class HW {
    static void main(String[] args) {
        C1 o=new C1();
        o.B1("Bird");
        o.B2("Black");
        o.B3("Green");
    }

}
