package OOPS.OBJECTS;

class Person{
    String Name="Dude !";
    int Age=22;
    String Address="Bengaluru";
}

public class OBJ4 {
    static void main(String[] args) {
        Person p=new Person();
        System.out.println("Name "+p.Name+"\nAge is "+p.Age+"\nAddress is "+p.Address);
    }
}
