package practise;

import java.util.LinkedList;

public class RotateLinkedListNTimes {
    LinkedList<Integer> linkedList = new LinkedList<>();

    public void rotate(int n) {
        linkedList.offer(10);
        linkedList.offer(20);
        linkedList.offer(30);
        linkedList.offer(40);
        linkedList.offer(50);
        for(int i=0; i<2; i++ ){
            linkedList.addLast(linkedList.pollFirst());
        }
        linkedList.forEach((temp) -> {
            System.out.println(temp);
        });
    }
}
