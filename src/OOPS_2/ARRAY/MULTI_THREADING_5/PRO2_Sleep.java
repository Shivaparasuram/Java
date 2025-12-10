package OOPS_2.ARRAY.MULTI_THREADING_5;

class A{
    public void Demo(){
        for (int i=0 ;i<5;i++) {
            System.out.println("Java Developer !");
            try {
                Thread.sleep(1000);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}

class B{
    public void Demo1(){
        for (int i =0;i<5;i++){
            System.out.println("Python Developer !");
        }
    }

}
public class PRO2_Sleep{
    static void main(String[] args) {
        A obj=new A();
        B obj1=new B();
        obj.Demo();           // delay by 1 sec

        try {Thread.sleep(2000);}
        catch (Exception e){System.out.println(e);}

        obj1.Demo1();

    }
}
