package OOPS.CONSTRUCTOR_2;

class A
{
    A(){                               //Constructor without parameter
        System.out.println("Hello !x");
    }
    A(int a){                         //Constructor with parameters
        System.out.println(a);
    }
    A(int b,int a){                    //Constructor with 2 parameters
        System.out.println(a+" "+b);
    }

}

public class PRO1 {
    static void main(String[] args) {
        A obj=new A();               //call default whn obj is created
        A obj1=new A(20);
        A obj2=new A(46,64);

    }
}
