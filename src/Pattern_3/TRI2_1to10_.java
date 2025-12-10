package Pattern_3;

public class TRI2_1to10_ {
    public static void main(String[] args) {
        int n = 1;

        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(n);
                n++;
            }

            System.out.println();
        }
    }
}
