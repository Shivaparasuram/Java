package x_JAVA_8;
interface B{
    void java8();
}

public class _2Lambda {
    static void main(String[] args) {
        B obj=()-> System.out.println("Lambda was introduced & supported from on J8 !x");
        obj.java8();
    }
}
