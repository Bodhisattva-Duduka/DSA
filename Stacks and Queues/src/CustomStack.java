public class CustomStack {
    private int[] data;
    private static final int DEFAULT_SIZE = 10 ;

    private int ptr = -1;
    
    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size){
        this.data = new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is Full!!");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws StackException {
        if(isEmpty()){
            throw new StackException("Stack is empty");
        }
        int item = data[ptr];
        ptr--;
        return item;
    }

    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot peek element");
        }
        return data[ptr];
    }

    public boolean isFull(){
        return ptr == data.length - 1;
    }

    public boolean isEmpty(){
        return ptr == -1;
    }    
}
