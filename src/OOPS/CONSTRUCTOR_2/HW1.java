package OOPS.CONSTRUCTOR_2;


class vehicle{
    String name1;int reg1;int price1;

    vehicle(String name,int reg,int price){
        name1 =name;
        reg1 = reg;
        price1=price;

    }
    public void Detail(String color){
        System.out.println("Name -"+name1+"\nreg -"+reg1+"\nprice -"+price1+"\ncolor -"+color);

    }
}
public class HW1 {
    static void main(String[] args) {
         vehicle obj= new vehicle("Hero",123,56780);
         obj.Detail("yellow");

    }


}
