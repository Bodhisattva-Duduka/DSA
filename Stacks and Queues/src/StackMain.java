public class StackMain {
    public static void main(String[] args) throws StackException {
        CustomStack stack = new CustomStack(5);
        
        stack.push(24);
        stack.push(72);
        stack.push(58);
        stack.push(93);

        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());

        // System.out.println(stack.peek());


        DynamicStack dStack = new DynamicStack(4);
        
        dStack.push(23);
        dStack.push(23);
        dStack.push(23);
        dStack.push(23);
        dStack.push(23);
        dStack.push(23);
        dStack.push(23);

        System.out.println(dStack.pop());
        System.out.println(dStack.pop());
        System.out.println(dStack.pop());
        System.out.println(dStack.pop());
    }
}
