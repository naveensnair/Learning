package linkedlist;

import java.util.ArrayList;

public class CustomLinkedList {
    Node head;
    public void insertBegin(int value) {
        Node temp = new Node(value);
        temp.next = head;
        head = temp;
    }

    public void printLinkedList() {
        Node current = head;
        while(current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public void insertAtEnd(int value) {
        Node temp = new Node(value);
        if(head == null) {
            head = temp;
            return;
        }
        Node current = head;
        while(current.next != null) {
            current = current.next;
        }
        current.next = temp;
        printLinkedList();

    }

    public void middleOfLinkedListNaive() {
        if(head == null) {
            return;
        }
        int count = 0;
        Node current;
        for(current=head; current != null; current=current.next) {
            count++;
        }
        current = head;
        for(int i=0; i<count/2; i++) {
            current = current.next;
        }
        System.out.println("Middle node value : " + current.data);
    }

    public void middleLinkedListBest(){
        if(head == null) {
            return;
        }
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle element is : " + slow.data);
    }

    public void printNthFromEnd(int n) {
        int length = 0;
        for(Node current = head; current != null; current=current.next) {
            length++;
        }
        if(length < n) {
            return;
        }
        Node current = head;
        for(int i=1;i<length-n+1;i++) {
            current = current.next;
        }
        System.out.println("Data from " + n + " position is :" + current.data);
    }

    public void reverseLinkedList() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if(head == null) {
            return;
        }
        for(Node current = head; current!= null; current=current.next) {
            arrayList.add(current.data);
        }
        for(Node current = head; current != null; current = current.next) {
            current.data = arrayList.remove(arrayList.size()-1);
        }
    }

    public void reverseLinkedListInOneTraversal(){
        Node current = head;
        Node previous = null;
        while (current != null) {
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        System.out.println(previous.data);
    }
}