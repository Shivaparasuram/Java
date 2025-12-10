package Pattern_3;

public class RIGHT_TRI_BLANK {
    public static void main(String[] args) {
        int n = 6;


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                if (i == j || j == 1 || i == n) {
                    System.out.print(i);


                } else {
                    System.out.print(" ");

                }

            }
            System.out.println();
        }
    }
}