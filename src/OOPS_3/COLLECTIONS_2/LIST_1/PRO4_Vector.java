package OOPS_3.COLLECTIONS_2.LIST_1;

import java.util.Vector;

public class PRO4_Vector {
    static void main(String[] args) {
        Vector<Integer> Numbers = new Vector<>();
        Numbers.add(1);
        Numbers.add(7);
        Numbers.add(3);
        Numbers.add(5);
        Numbers.add(9);
        System.out.println(Numbers);
        System.out.println(Numbers.remove(2));
        System.out.println(Numbers);
        System.out.println(Numbers.indexOf(7));
        System.out.println(Numbers.size());
        System.out.println(Numbers.stream().count());
        

    }
}
