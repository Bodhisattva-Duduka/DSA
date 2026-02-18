public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertAtFirst(3);
        list.insertAtFirst(4);
        list.insertAtFirst(1);
        list.insertAtFirst(7);
        // list.deleteFirst();


        list.insertAtLast(10);
        list.insertAtLast(4);
        list.insertAtLast(20);
        list.insertAtLast(19);
        list.display();
        // list.insertAtIndex(14, 2);
        list.deleteLast();
        list.deleteLast();
        list.deleteLast();
        list.display();
    }
}
