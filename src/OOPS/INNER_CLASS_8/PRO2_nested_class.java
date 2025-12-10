package OOPS.INNER_CLASS_8;

class out1{
    private int age =18;
    public class in1
    {
        int getValue()
        {
            return age;
        }

    }
}
public class PRO2_nested_class {
    static void main(String[] args) {
        out1 obj=new out1();
       out1.in1 obj2=obj.new in1();
       System.out.println("\nAge is "+obj2.getValue());

    }
}
