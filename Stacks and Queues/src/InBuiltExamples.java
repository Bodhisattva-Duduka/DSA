import java.util.*;
public class InBuiltExamples {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(29);
        stack.push(54);
        stack.push(23);
        stack.push(42);

        // System.out.println(stack.pop());
        // System.out.println(stack.pop());

        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(53);
        queue.add(23);
        queue.add(29);
        queue.add(40);

        // System.out.println(queue.remove());
        // System.out.println(queue.remove());

        // Stack like
        Deque<Integer> deque1 = new ArrayDeque<>();
        deque1.push(12);
        deque1.push(55);
        deque1.push(32);

        // System.out.println(deque1.pop());

        // Queue like
        Deque<Integer> deque2 = new ArrayDeque<>();
        deque2.offerLast(23);
        deque2.offerLast(38);
        deque2.offerFirst(93);
        deque2.offerFirst(83);

        // System.out.println(deque2.peekFirst());
        // System.out.println(deque2.peekLast());
        // System.out.println(deque2.pollLast());
        // System.out.println(deque2.pollLast());

        
    }
}
