
package OOPS.OBJECTS;
class animals{
    String name="Dog";
    int age = 5;
    String color ="Brownie";

}

public class OBJ1_CREATE {
    static void main(String[] args) {

        //class_name object_name =new class_name
        animals dog1= new animals();
        animals dog2= new animals();

        System.out.println("THe name is "+dog2.name+"\nThe age is "+dog1.age+"\nColor of the dog is "+dog1.color);

    }
}
