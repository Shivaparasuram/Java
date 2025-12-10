package OOPS.INNER_CLASS_8;

class Outer
{
    private class inner
    {
        public void InnerMethod()
        {
        System.out.println("Inner Class Method !");
        }
    }
    void Detail(){
        inner obj1=new inner();
        obj1.InnerMethod();
}
}
public class PRO1_Static_inner {
    public static void main(String[] args) {

        Outer obj= new Outer();
        obj.Detail();

    }
}
