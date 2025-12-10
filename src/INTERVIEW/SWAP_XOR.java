package INTERVIEW;

public class SWAP_XOR {
    static void main(String[] args) {

        int a=10;
        int b=5;

        System.out.println("BEFORE SWAP ! a "+a+" b "+b);

        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println("AFTER SWAP ! a "+a+" b "+b);
    }
}
