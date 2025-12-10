package OOPS.OBJECTS;

class car{
    String home="A";
    long price=151212456;
    String color="YELLOW";
    String model="qwe123";
    String Reg_no ="5w43e21";

}

class bike{
    String home="B";
    int price=8586758;
    String color="BLUE";
}

public class OBJ3 {
    static void main(String[] args) {

        car Detail= new car();
        bike Detail2=new bike();

        System.out.println("Home "+Detail.home+"\nPrice "+Detail.price+"\nColor "+Detail.color+"\nModel "+Detail.model+"\nRegister number "+Detail.Reg_no);
        System.out.println("\nHome "+Detail2.home+"\nPrice "+Detail2.price+"\nColor "+Detail2.color);
    }
}
