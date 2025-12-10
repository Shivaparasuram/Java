package OOPS.INNER_CLASS_8;

class out7
{
    static class in7
    {
        void demo7()
        {
            System.out.println("\nStatic Nested Class !x");
        }
    }
    }
public class PRO7_static_nested
{
    static void main(String[] args)
    {
        out7 obj=new out7();
        out7.in7 obj2 = new out7.in7();
        obj2.demo7();
    }
}
