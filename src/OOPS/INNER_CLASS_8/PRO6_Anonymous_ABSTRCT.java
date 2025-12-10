package OOPS.INNER_CLASS_8;

abstract class Demo46{
    abstract void add(int a,int b);
}
public class PRO6_Anonymous_ABSTRCT {
    static void main(String[] args) {
        Demo46 obj=new Demo46()
        {
            @Override
            void add(int a, int b)
            {
                System.out.println("\nAddition of \n"+a+" + "+b+ " = "+(a+b));
            }
        };
        obj.add(4,6);
    }
}
