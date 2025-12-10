package OOPS.CONSTRUCTOR_2;

import java.util.Scanner;

class Shiva{
    String name;
    long phone;
    int reg;
    Shiva(String Name,long Phone,int Reg ){
        name=Name;
        phone=Phone;
        reg=Reg;

    }

}

public class PRO3 {
    static void main(String[] args) {


        Scanner sc =new Scanner(System.in);
        System.out.println("enter name ");
        String name= sc.next();
        System.out.println("enter phone ");
        long phone=sc.nextLong();
        System.out.println("enter reg ");
        int reg=sc.nextInt();

        Shiva obj = new Shiva(name,phone,reg);

        System.out.println("NAME " +obj.name);
        System.out.println("PHONE "+obj.phone);
        System.out.println("REG "+obj.reg);

    }
}
