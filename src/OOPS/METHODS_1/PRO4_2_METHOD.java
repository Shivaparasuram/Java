package OOPS.METHODS_1;

class Java{
    public int sub(int a , int b)
    {
        return b-a;
    }
    public int add(int a, int b)
    {
        return a+b;
    }
}

public class PRO4_2_METHOD {
    static void main(String[] args) {

        Java obj1= new Java();

        int r =obj1.add(2,4);  //using 3rd variable
        System.out.println(r);

        System.out.println(obj1.sub(2,4)); //without 3rd var



    }
}
