package OOPS.INHERITENCE_3;

class A{
    public void  Demo(){
        System.out.println("Grand Parents !xxx");
    }
}

class B extends A{
    public void  Demo1(){
        System.out.println("Parents !xx");
    }

}
class C extends B{
    public void  Demo2(){
        System.out.println("KID !x");
    }

}

public class PRO3_multilevel {
    static void main(String[] args) {

        System.out.println("C can access both B & A !\n");
        C obj=new C();
        obj.Demo();
        obj.Demo1();
        obj.Demo2();

    }
}
