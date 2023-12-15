// import java.util.Stack;

package stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class stack {
    public static void main(String[] args) {
        // Stack<Integer> stack = new Stack<>();
        // stack.push(844);
        // stack.push(48);
        // stack.push(48);
        // stack.push(48);
        // stack.push(96);

        // System.out.println(stack.pop());
        // System.out.println(stack);

        // Queue<Integer> queue = new LinkedList<>();
        // queue.add(40);
        // queue.add(50);
        // queue.add(60);
        // queue.add(70);
        // queue.add(80);

        // System.out.println(queue);

        // System.out.println(queue.remove());
        // System.out.println(queue.remove());
        // System.out.println(queue);
        // System.out.println(queue.peek());

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(40);
        deque.add(50);
        deque.add(60);
        deque.addLast(80646);
        deque.add(70);
        deque.add(80);
        deque.removeFirst();
        System.out.println(deque);
    }

}