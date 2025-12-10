package OOPS.POLYMORPHISOM_4;

public class PRO1_overload {
    static void main(String[] args) {
        class JAVA
        {
            public int add(int a,int b)
            {
                return a+b;
            }
            public int add(int a,int b,int c)
            {
                return a+b+c;
            }

        }
        JAVA obj=new JAVA();
        int r=obj.add(2,4);
        System.out.println("Sum of 2 Numbers is : "+r);

        System.out.println("Sum of 3 Numbers is : " + obj.add(2, 4, 6));

    }
}
