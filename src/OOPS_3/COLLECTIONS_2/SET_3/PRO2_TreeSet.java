package OOPS_3.COLLECTIONS_2.SET_3;

import java.util.TreeSet;

public class PRO2_TreeSet {
    static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<>();
        t.add(4);
        t.add(5);
        t.add(2);
        t.add(1);
        t.add(9);
        System.out.println(t);
        System.out.println(t.remove(2));
        System.out.println(t);
        System.out.println(t.contains(1));
        System.out.println(t.isEmpty());

        System.out.println(t.first());   //Smallest ele
        System.out.println(t.last());   //Largest ele
        System.out.println(t);

        System.out.println( "floor "+t.floor(5));     //less than eq
        System.out.println("ceiling "+t.ceiling(6));   //greater than eq

        System.out.println("lower "+t.lower(2));     //lesser than
       System.out.println("Greater "+t.higher(4));   //Greater than

    }
}
