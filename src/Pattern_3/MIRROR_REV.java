package Pattern_3;

public class MIRROR_REV
{
    static void main() {
        int n = 4;
        for (int i = 1; i <= n; i++) {

            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {

                System.out.print("*");

            }


            System.out.println("  ");

        }
    }
}
