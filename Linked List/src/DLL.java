public class DLL {

    private Node head;
    private Node tail;
    private int size;

    void insertAtFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        if(tail == null){
            tail = node;
        }
        head = node;
        size++;
    }

    void insertAtLast(int val) {
        Node node = new Node(val);
    
        if (tail == null) {
            head = node;
            tail = node;
            return;
        }
    
        tail.next = node;
        node.prev = tail;
        tail = node;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.val == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insert(int after, int val) {
        Node p = find(after);

        if (p == null) {
            System.out.println("does not exist");
            return;
        }

        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null) {
            node.next.prev = node;
        }
    }

    
    void display() {
        Node temp = head;
        System.out.print("BEGIN");
        while(temp != null) {
            System.out.print(" <- " + temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }

    void displayRev() {
        Node temp = tail;
        System.out.print("END");
        while(temp != null) {
            System.out.print(" <- " + temp.val + " -> ");
            temp = temp.prev;
        }
        System.out.print("BEGIN");
    }


    private class Node {
        int val;
        Node next;
        Node prev;

        Node(int val){
            this.val = val;
        }

        Node(int val, Node prev, Node next){
            this.val = val;
            this.prev = prev;
            this.next = next;
        }
    }
}
