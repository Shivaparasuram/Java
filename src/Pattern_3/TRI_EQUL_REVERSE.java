package Pattern_3;

public class TRI_EQUL_REVERSE {
    public static void main(String[] args) {
        int n = 4;

        for (int i = n; i >= 1; i--) {
            // Print leading spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Move to next line
            System.out.println();
        }
    }
}