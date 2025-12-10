package OOPS.INTERFACE_7;

interface o{
    void Hello();
}
interface oo extends o{
    void Guys();
}
class ooo implements oo{
    public void Guys(){
        System.out.println("Big P !");
    }

    @Override
    public void Hello() {
        System.out.println("Grand P !");
    }
}

public class PRO5_multi_level {
    static void main(String[] args) {
        ooo obj=new ooo();
        obj.Hello();
        obj.Guys();

    }
}
