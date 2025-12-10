package OOPS_3.COLLECTIONS_2.LIST_1;

import java.util.LinkedList;

public class PRO3_LinkedList {
    static void main(String[] args) {
        LinkedList<String> Cars =new LinkedList<>();
        Cars.add("BMW");
        Cars.add("Safari");
        Cars.add("Benz");
        Cars.add("Bugatti");
        Cars.add("Lambo");
        System.out.println(Cars);
        System.out.println("Select 1st element "+Cars.peek());   //
        System.out.println(Cars);
        System.out.println("Poll "+Cars.poll());   // remove 1st element
        System.out.println(Cars);
        System.out.println(Cars.offerFirst("BIG TOYS"));
        System.out.println(Cars);
        Cars.clear();
        System.out.println(Cars);



    }
}
