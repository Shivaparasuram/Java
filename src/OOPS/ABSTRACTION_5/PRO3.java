package OOPS.ABSTRACTION_5;

abstract class Bird{
    String  name;
    String color;
    Bird(String name,String color){
        this.name=name;
        this.color=color;
    }
    abstract void Bird1();
    abstract void Bird2(String name,String color,int age);
    void dog(String name,String breed,String color)
    {
        System.out.println(name+"  "+breed+"  "+color);
    }
}
class BD extends Bird{
    BD(String name,String color)
    {
        super(name,color);
    }
    void Bird1()
    {
        System.out.println( name+" "+ color);
    }
    void Bird2(String name,String color,int age){
        System.out.println( name+" "+ color+" "+age);
    }

}

public class PRO3 {
    static void main(String[] args) {
        BD obj=new BD("Ab","Black");
        obj.Bird1();
        obj.Bird2("asd","Red",2);
        obj.dog("Brownii","German","Goldy");
    }
}
