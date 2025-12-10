package OOPS_3.COLLECTIONS_2.QUEUE_2;

import java.util.ArrayDeque;

public class PRO2_ArrayDeQ {
    public static void main(String[] args){
        ArrayDeque<Integer> DQ =new ArrayDeque<>();
        DQ.push(3);
        DQ.push(5);
        DQ.push(1);
        DQ.push(8);
        DQ.push(6);
        System.out.println(DQ);
        DQ.pop();
        System.out.println(DQ.peek());
        System.out.println(DQ.poll());
        System.out.println(DQ);
        DQ.addFirst(2);
        DQ.add(11);
        DQ.offer(12);
        DQ.addLast(2);
        System.out.println(DQ);
        System.out.println(DQ.reversed());

    }

}
