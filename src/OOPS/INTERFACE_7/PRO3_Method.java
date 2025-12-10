package OOPS.INTERFACE_7;

interface Y{
    default int Demo(int a , int B){               //only default method can have body
        return 4+6;
    }
    static void Z(){
        System.out.println("STATIC METHOD : No need of objects to call me as Imma static !");
    }
}

public class PRO3_Method implements Y
{
    static void main(String[] args)
    {
        PRO3_Method obj=new PRO3_Method();
        System.out.println("\nReturn "+obj.Demo(5,6));
        Y.Z();

    }
}
