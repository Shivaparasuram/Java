package OOPS.INTERFACE_7;

// Parent interface
interface Animal {
    void eat();
}

// Child interfaces extending parent
interface Dog extends Animal {
    void bark();
}

interface Cat extends Animal {
    void meow();
}

// Classes implementing child interfaces
class GermanShepherd implements Dog {
    @Override
    public void eat() {
        System.out.println("German Shepherd eats meat");
    }
    @Override
    public void bark() {
        System.out.println("German Shepherd barks loudly");
    }
}

class PersianCat implements Cat {
    @Override
    public void eat() {
        System.out.println("Persian Cat drinks milk");
    }

    @Override
    public void meow() {
        System.out.println("Persian Cat meows softly");
    }
}
public class PRO6_Hierarchy {
    static void main(String[] args) {
        Dog d = new GermanShepherd();
        d.eat();
        d.bark();

        Cat c = new PersianCat();
        c.eat();
        c.meow();
    }
}
