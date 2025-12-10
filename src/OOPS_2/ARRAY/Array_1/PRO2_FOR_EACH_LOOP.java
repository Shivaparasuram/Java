package OOPS_2.ARRAY.Array_1;

public class PRO2_FOR_EACH_LOOP {
    static void main(String[] args)
    {
        int array[]={7,4,2,6,8,3};

        //Replace index 5 element eith 10
        array[5]=10;
        System.out.println(array[5]);
        for (int i : array)
        {
            System.out.println(i);
        }
    }
}