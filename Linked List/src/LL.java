public class LL {

    private Node head;
    private Node tail;

    private int size;

    public LL(){
        this.size = 0;
    }

    public int size(){
        return size; 
    }

    public void insertAtFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void display() {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void insertAtLast(int val){
        if(tail == null){
            insertAtFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertAtIndex(int val, int index){
        int count = 0;
        Node temp = head;
        while(count < index - 1){
            temp = temp.next;
            count++;
        }
        Node newNode = new Node(val);
        Node nextPointer = temp.next;
        temp.next = newNode;
        newNode.next = nextPointer;
        size++;
    }

    int deleteFirst(){
        int value = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return value;
    }

    int deleteLast(){
        if(size<=1){
            deleteFirst();
        }

        Node secondLast = get(size - 2);
        int value = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return value;
    }

    int deleteAtIndex(int index){
        if(size<=1){
            deleteFirst();
        }

        Node previous = get(index - 1);
        int value = get(index).value;
        Node temp = get(index).next;
        previous.next = temp;
        size--;
        return value;
    }

    Node get(int index){
        Node temp = head;
        for(int i = 0; i<index; i++){
            temp = temp.next;
        }
        return temp;
    }

    class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

}
