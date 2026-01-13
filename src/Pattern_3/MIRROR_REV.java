package Pattern_3;

public class MIRROR_REV
{
    static void main() {
        int n = 5;
        for (int i = n; i >= 1; i--) {

            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {


                    System.out.print("*");


            }
            System.out.println(" ");
        }
    }
}
