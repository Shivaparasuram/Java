package OOPS_2.ARRAY.MULTI_THREADING_5;

class JAVA extends Thread{
    public void run(){
        for (int i=0 ;i<5;i++) {
            System.out.println("Java Developer !");
            try {
                Thread.sleep(500);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
class PYTHON extends Thread{
    public void run(){
        for (int i =0;i<5;i++){
            System.out.println("Python Developer !");
            try {
                Thread.sleep(1000);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }

}
public class PRO3_Thread{
    static void main(String[] args) {
        Thread t1=new JAVA();
        t1.start();
        Thread t2= new PYTHON();
        t2.start();

    }
}
