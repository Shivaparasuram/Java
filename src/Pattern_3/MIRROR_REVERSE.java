package Pattern_3;

public class MIRROR_REVERSE {
    static void main() {

        int n = 6;
        for (int i = n; i >= 1; i--) {

            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {

                if (k == 1 || k == i || i == n) {
                    System.out.print(k);
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println("  ");
        }
    }
}
