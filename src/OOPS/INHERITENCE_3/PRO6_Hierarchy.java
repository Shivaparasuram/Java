package OOPS.INHERITENCE_3;

import java.util.Scanner;

class car{
    String Fuel_T;
    int No_seats;
    car(String Fuel_T,int NO_seats){
        this.Fuel_T=Fuel_T;
        this.No_seats=NO_seats;
    }
    public void C_Detail(){
        System.out.println(Fuel_T+" "+No_seats);
    }
}
class Ford extends car
{
    String Color;
    int Price;
    String model;
    Ford(String Color,int Price,String model,String Fuel_T,int No_seats){
        super(Fuel_T,No_seats);
        this.Color=Color;
        this.Price=Price;
    }
    public void DFord(){
        System.out.println("Color "+Color+"\nPrice "+Price+"\nModel "+model+"\nFuel_T "+Fuel_T+"\nNo_seats "+No_seats);
}
}
class Ferrari extends car{
    String Color;
    int Price;
    String model;
    Ferrari(String Color,int Price,String model,String Fuel_T, int NO_seats) {
        super(Fuel_T, NO_seats);
        this.Color=Color;
        this.Price=Price;
    }
    public void DFerrari(){
        System.out.println("Color "+Color+"\nPrice "+Price+"\nModel "+model+"\nFuel_T "+Fuel_T+"\nNo_seats "+No_seats);
    }
}

public class PRO6_Hierarchy {
    static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Color ");
        String color=sc.nextLine();
        System.out.println("Price ");
        int Price=sc.nextInt();
        System.out.println("Model ");
        String Model=sc.next();
        System.out.println("Fuel Type ");
        String Fuel_t=sc.next();
        System.out.println("No_Seats ");
        int No_Seats=sc.nextInt();
        System.out.println();

        Ford obj=new Ford(color,Price,Model,Fuel_t,No_Seats);
        obj.DFord();

    }
}
