package OOPS.INTERFACE_7;

interface A1{
    int a=3;            //normal variable
    static int b=5;     //Static variable
    final int c=6;      //final variable
}

public class PRO2_constants {
    static void main(String[] args) {
        System.out.println("normal variable "+A1.a);
        System.out.println("Static variable "+A1.b);
        System.out.println("Final variable "+A1.c);
    }
}
