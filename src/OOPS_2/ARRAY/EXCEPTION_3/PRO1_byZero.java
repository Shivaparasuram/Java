package OOPS_2.ARRAY.EXCEPTION_3;

public class PRO1_byZero {
    static void main(String[] args) {
        int a=1;
        int b=0;

        //ArithmeticException
        try {
            int c= a/b;
        } catch (Exception e) {
            System.out.println("Division by Zero not possible");
        }
    }
}
