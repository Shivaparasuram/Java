package OOPS.INHERITENCE_3;

class Vehicle1{
    String color;
    Vehicle1(String color){
        this.color=color;
    }
    public void Vdetails1(){
        System.out.println(color);
    }

}

class Car extends Vehicle1{

    int price;
    String reg_no;
    Car(int price,String reg_no,String color)
    {
        super(color);
        this.price=price;
        this.reg_no=reg_no;

    }
    public void Bdetails1(){
        System.out.println(price+" "+reg_no+" "+color+" ");
    }
}

class Bike extends Car{
    String name;

    Bike(String name,String reg_no,int price,String color){
        super(price,reg_no,color);
        this.name=name;
    }
    public void BDetails(){
        System.out.println("Bname -"+name+"\nReg_no -"+reg_no+"\nPrice -"+price+"\nColor -"+color);
    }

}

public class PRO4_multilevel {
    static void main(String[] args) {
        Bike obj = new Bike("ktm","KA03",12345,"Yellow");
        obj.BDetails();
    }
}
