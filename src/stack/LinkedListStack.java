package stack;

import java.util.Stack;

public class LinkedListStack {
    LinkedListNode head;

    public void push(int value) {
        LinkedListNode current = new LinkedListNode(value);
        current.next = head;
        head = current;
    }

    public void pop() {
        if(head == null) {
            return;
        }
        int result = head.data;
        head = head.next;
        System.out.println("Popped element from linked list : " + result);
    }

}
