package DATA_TYPE_BASIC;

public class Type_cast {

    //2 types implicit (widely   1 to 5) and explicit(narrow 5 to 1)
//explicit use a friend (use the name of (datatype))
    public static void main(String[] args) {
        byte by=12;
        int ii= by;
        System.out.println(ii);

        int u=90;
        byte byz=(byte)u;   //use
        System.out.println(byz);

        float f =12.33f;
        double dd = (float)f;
        System.out.println(dd);

        char ch ='a';
        int in = (char)ch;
        System.out.println(in);


    }
}
