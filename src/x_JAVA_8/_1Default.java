package x_JAVA_8;

interface A {
    void Message();
    default void java8() {
        System.out.println("Java8 Feature !");
    }
}

class Demo implements A {
    public void Message() {
        System.out.println("Before J8 !  Body of Interface in Class !");
    }
}

public class _1Default {
     static void main(String[] args) {
        Demo obj = new Demo();
        obj.Message();
        obj.java8();
    }
}