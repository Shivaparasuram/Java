package OOPS_2.ARRAY.MULTI_THREADING_5;

class A1 implements Runnable {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Java Developer from A1!");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class B1 implements Runnable {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Python Developer from B2!");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class PRO4_Runnable {     // Runnable is an interface
    public static void main(String[] args) {
        A1 obj = new A1();
        B1 obj1 = new B1();

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);

        t1.start();
        t2.start();
    }
}