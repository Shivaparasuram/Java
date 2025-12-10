package OOPS.INNER_CLASS_8;

class outer00
{
    void demo()
    {
        class inner
        {
            void demo1()
            {
                System.out.println("\nMethod local Inner Class !");
            }
        }
        inner obj1= new inner();
        obj1.demo1();
    }
}


public class PRO3_method_local_innerClass {
    static void main(String[] args) {
        outer00 obj=new outer00();
        obj.demo();
    }
}
