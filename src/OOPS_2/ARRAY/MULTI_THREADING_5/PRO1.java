package OOPS_2.ARRAY.MULTI_THREADING_5;

class Multi extends Thread{
    public void run()
    {
        System.out.println("Thread 1 !");
    }
}
class Multi2 extends Thread{
    public void run()
    {
        System.out.println("Thread 2 !");
    }
}

public class PRO1 {
    public static void main(String[] args)
    {
        Thread t1=new Multi();
        t1.start();
        Thread t2 = new Multi2();
        t2.start();

    }
}
