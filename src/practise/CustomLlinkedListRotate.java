package practise;

public class CustomLlinkedListRotate {

    class Node {
        Node next;
        int data;
        Node(int value) {
            this.data = value;
        }
    }

    Node head;
    public void insertBegin(int value) {
        Node temp = new Node(value);
        temp.next = head;
        head = temp;
    }

    public void printTheLinkedList() {
        Node temporaryNode = head;
        while(temporaryNode != null) {
            System.out.print(temporaryNode.data + " ");
            temporaryNode = temporaryNode.next;
        }
        System.out.println();
    }

    public void rotateNTimes(int n) { // 10,20,30,40,50 n=2
        Node current = head;
        int count = 1;
        while(count < n && current != null) {
            current = current.next;
            count++;
        }

        //store the current in temporary to cut the link
        Node temporary = current;

        //iterate the list and get to the last
        while(current.next != null) {
            current = current.next;
        }

        //cut the link and make head as next node to cut node
        current.next = head;
        head = temporary.next;
        temporary.next = null;

        Node temporaryNode = head;
        while(temporaryNode != null) {
            System.out.print(temporaryNode.data + " ");
            temporaryNode = temporaryNode.next;
        }
    }


}
