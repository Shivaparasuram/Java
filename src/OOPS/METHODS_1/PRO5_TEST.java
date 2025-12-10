package OOPS.METHODS_1;

class Arithmatic{
    public int add(int a ,int b)
    {
        return a+b;
    }
    public int sub(int a ,int b){
        return b-a;
    }
    public int mul(int a ,int b) {
        return b *a;
    }
    public int div(int a ,int b){
        return a/b;
    }

}


public class PRO5_TEST {
    static void main(String[] args) {

        Arithmatic obj=new Arithmatic();


        int sum = obj.add(4, 5);

        System.out.println("Addition: " + obj.add(4, 5));
        System.out.println("Subtraction: " + obj.sub(4, 5));
        System.out.println("Multiplication: " + obj.mul(4, 5));
        System.out.println("Division: " + obj.div(4, 2));
        System.out.println(sum);

    }
}

