package queue;

public class CustomQueue {
    int size, capacity;
    int[] array;
    public CustomQueue(int c) {
        capacity = c;
        size = 0;
        array = new int[capacity];
    }

    public void enQueue(int value) {
        if(isFull()) {
            return;
        } else {
            array[size] = value;
            size++;
        }
        return;
    }

    public int deQueue() {
        if(isEmpty()) {
            return -1;
        } else {
            int temp = array[0];
            for(int i=0; i<array.length-1; i++) {
                array[i] = array[i+1];
                size--;
            }
            return temp;
        }
    }

    public int getFront() {
        if(isEmpty()) {
            return -1;
        } else {
            return array[0];
        }
    }

    public int getRear() {
        if(isEmpty()) {
            return -1;
        } else {
            return array[size];
        }
    }

    boolean isFull() {
        return size == capacity;
    }

    boolean isEmpty() {
        return size == 0;
    }
}
