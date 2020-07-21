package queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class StackQueue {
    Queue<Integer> queue = new ArrayDeque<>();
    Queue<Integer> tempQueue = new ArrayDeque<>();

    public void push(int value) {
        while(!queue.isEmpty()) {
            tempQueue.offer(queue.peek());
            queue.poll();
        }
        queue.offer(value);
        while(!tempQueue.isEmpty()) {
            queue.offer(tempQueue.peek());
            tempQueue.poll();
        }
    }

    public int pop() {
        return !queue.isEmpty() ? queue.poll() : -1;
    }



}
