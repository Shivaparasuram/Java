package OOPS_2.ARRAY.MULTI_DIMENSIONAL_2;

public class PRO1 {
    static void main(String[] args) {
        int Array[][] = {
                {2, 4, 6},
                {1, 2, 3},
                {3, 6, 9}
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(Array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
