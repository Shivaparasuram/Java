package OOPS.INHERITENCE_3;

class Dog
{
    String color;
    int h;
    Dog(String color,int h)
    {
        this.color=color;
        this.h=h;
    }
    public void D_Detail(){
        System.out.println("Color "+color );
    }


}
class Puppy extends Dog
{
    String name;
    Puppy(String name,String color,int h)
    {
        this.name=name;
        super(color,h);
    }
    public void  P_Details(){
        System.out.println("Name is "+name+"\nColor is "+color+"\nHeight is "+h);
    }


}

public class PRO2_single {
    static void main(String[] args) {

        Puppy obj=new Puppy("777","Brownii",7);
        obj.P_Details();

    }

}
