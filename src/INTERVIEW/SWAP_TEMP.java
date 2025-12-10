package INTERVIEW;

public class SWAP_TEMP {
    static void main(String[] args) {
        int a=10;
        int b =5;
        int temp;
        System.out.println("BEFORE swap a "+a+" b "+b);

        temp=a;
        a=b;
        b=temp;


        System.out.println("AFTER swap a"+a+" b "+b);

    }
}
