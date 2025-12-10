package OOPS.POLYMORPHISOM_4;
class Parent{

    public void Mobile(String name,String RAM,String ROM,String model){
        System.out.println(name+" "+RAM+" "+ROM+" "+model+" ");
    }

}
class Child extends Parent {
    @Override
    public void Mobile(String name, String RAM, String ROM, String model) {
        System.out.println(name + " " + RAM + " " + ROM + " " + model + " ");
    }

    public void laptop(String name1, String Model, String RAM, String ROM, String Graphic_scard) {
        System.out.println(name1 + " " + Model + " " + RAM + " " + ROM + " " + Graphic_scard);
    }

}

public class PRO4_override {
    public static void main(String[] args) {
        Child obj=new Child();
        obj.Mobile("Realme","12 GB","128 GB","GT");


    }
}
