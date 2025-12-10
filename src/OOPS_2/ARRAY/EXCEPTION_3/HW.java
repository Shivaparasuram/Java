package OOPS_2.ARRAY.EXCEPTION_3;

public class HW {
    static void main(String[] args) {
        try {
            //ArrayIndexOutOfBoundsException
            int[] array={1,2,3,4};

            //ArithmeticException
            int a=10;
            int b= 0;
            int c=a/b;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }

    }
}
