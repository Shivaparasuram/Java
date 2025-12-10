package OOPS.POLYMORPHISOM_4;

class Crazyy{
    public int Area(int a){
        return a*a;
    }
    public int Area(int l,int b){
        return l*b;
    }
    public double Area(double r ){
        return 3.14*r*r;
    }
}

public class PRO2_overload {
    public static void main(String[] args) {

        Crazyy obj=new Crazyy();

        System.out.println("Area of square : " + obj.Area(2));
        System.out.println("Area of rectangle : " + obj.Area(2, 4));
        System.out.println("Area of circle : " + obj.Area(3.5));

    }
}
