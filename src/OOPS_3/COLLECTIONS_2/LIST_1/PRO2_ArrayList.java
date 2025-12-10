package OOPS_3.COLLECTIONS_2.LIST_1;

import java.util.ArrayList;
import java.util.List;

public class PRO2_ArrayList {
    static void main(String[] args) {
        List<String> Fruits = new ArrayList<>();
        Fruits.add("Apple");
        Fruits.add("Mango");
        Fruits.add("Orange");
        System.out.println(Fruits);
        Fruits.add(1,"Grapes");
        System.out.println(Fruits);
        System.out.println(Fruits.set(2,"kiwi"));
        System.out.println(Fruits);
        System.out.println(Fruits.get(3));
        System.out.println(Fruits);
        System.out.println(Fruits.contains("Grapes"));
        System.out.println(Fruits.isEmpty());
        System.out.println(Fruits.remove(1));
        System.out.println(Fruits);
        System.out.println(Fruits.reversed());
        System.out.println(Fruits.subList(1,2));



    }
}
