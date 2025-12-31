package OOPS.INTERFACE_7;

interface P1{    //  Parent 1
    void add(int a,int b);
}
interface P2{    //  Parent 2
    void sub(int a,int b);
}
class Child implements P1,P2{   //child
    public void add(int a, int b){
        System.out.println(a+"+"+b+"="+(a+b));
    }
    public void sub(int a,int b){
        System.out.println(a-b);
    }
}

public class PRO4_MULTIPLE_INHERITANCE {
    static void main(String[] args) {

        Child obj=new Child();
        obj.add(4,6);
        obj.sub(6,4);

    }
}