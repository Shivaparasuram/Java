package OOPS_3.COLLECTIONS_2.SET_3;

import java.util.HashSet;
import java.util.Set;

public class PRO1_HashSet {
    static void main(String[] args) {
        Set<Integer> HashSet = new HashSet<>();
        HashSet.add(3);
        HashSet.add(46);
        HashSet.add(1);
        HashSet.add(9);
        System.out.println(HashSet);
        System.out.println(HashSet.remove(12));
        System.out.println(HashSet);
        System.out.println(HashSet.contains(1));
        HashSet.clear();
        System.out.println(HashSet);
        System.out.println(HashSet.isEmpty());

    }
}
