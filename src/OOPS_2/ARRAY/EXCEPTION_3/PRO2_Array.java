package OOPS_2.ARRAY.EXCEPTION_3;

public class PRO2_Array {
    static void main(String[] args) {
        int [] Array ={1,2,3,4};

        //ArrayIndexOutOfBoundsException
        try {
            System.out.println(Array[5]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
