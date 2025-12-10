package OOPS_3.COLLECTIONS_2.LIST_1;

import java.util.Stack;

public class PRO5_STACK {
    static void main(String[] args) {
        Stack<Integer> stack= new Stack<Integer>();
        stack.push(5);
        stack.push(7);
        stack.push(3);
        stack.push(9);
        stack.push(1);
        stack.add(2);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack.capacity());
        System.out.println(stack.indexOf(9));

    }
}
