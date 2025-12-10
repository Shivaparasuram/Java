package OOPS_3.COLLECTIONS_2.SET_3;

import java.util.LinkedHashSet;

public class PRO3_LinkedHashSet {
    static void main(String[] args) {
        LinkedHashSet<Integer> l =new LinkedHashSet<>();
        l.add(2);
        l.add(4);
        l.add(3);
        l.add(7);
        l.add(8);
        System.out.println(l);
        System.out.println(l.remove(9));
        System.out.println(l.getLast());
        System.out.println(l.reversed());
        System.out.println(l.size());
        System.out.println(l.stream().isParallel());

    }
}
