package OOPS_2.ARRAY.Array_1;

public class PRO3_greatest {
    static void main(String[] args) {
        int[] array={6,5,9,1,2,4,43,5,21};
        int largest = array[0];
        for (int i=1;i< array.length;i++)
        {
            if(largest<array[i]){
                largest =array[i];
            }
        }
        System.out.println(largest);
    }
}
