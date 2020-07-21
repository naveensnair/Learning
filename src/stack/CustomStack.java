package stack;

import java.util.ArrayDeque;
import java.util.Stack;

public class CustomStack {
    /*public void createStack(){
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top element now is : " + stack.peek() );
        stack.pop();
        System.out.println("After pop top element is : " + stack.peek());

    }*/

    int[] stack = new int[5];
    int top = -1;

    public void push(int value) {
        if(top == stack.length-1) {
            return;
        } else {
            top++;
            stack[top] = value;
        }
    }

    public int pop() {
        if(top == -1) {
            return -1;
        } else {
            int result = stack[top];
            top--;
            return result;
        }
    }

    private boolean matchingCharacters(char a, char b) {
        return ((a == '{' && b == '}') ||
                (a == '(' && b == ')') ||
                (a == '[' && b == ']'));
    }

    public boolean balancedParanthesisWithAString(String value) {
        Stack<Character> stack = new Stack<>();
        for(char c : value.toCharArray()) {
            if(c == '{' || c == '(' || c == '[') {
                stack.push(c);
            } else {
                if(stack.isEmpty() || !matchingCharacters(stack.peek(), c)) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }

    public void stockSpan(int[] array) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for(int i=1; i<array.length; i++) {
            while(!stack.isEmpty() && array[stack.peek()] <= array[i]) {
                stack.pop();
            }
            int span = stack.isEmpty() ? (i+1) : (i-stack.peek());
            stack.push(i);
        }
    }
}
