package OOPS.POLYMORPHISOM_4;

class a1{
    public void phone(){
        System.out.println("IPHONE !");
    }
}
class b1 extends a1{
    @Override
    public void phone() {
        System.out.println("PRO MAX !");
    }
}

public class PRO3_override {
    static void main(String[] args) {
        b1 obj=new b1();
        obj.phone();

    }
}
