package OOPS_3.COLLECTIONS_2.QUEUE_2;

import java.util.PriorityQueue;

public class PRO1_Priority {
    public static void main(String[] args){
        PriorityQueue <Integer> Top =new PriorityQueue<>();
        Top.offer(6);
        Top.offer(3);
        Top.offer(8);
        Top.offer(0);
        Top.offer(2);
        Top.offer(5);
        System.out.println(Top);
        System.out.println(Top.poll());
        System.out.println(Top);
        System.out.println(Top.peek());
        System.out.println(Top);
        System.out.println(Top.size());


    }
}
