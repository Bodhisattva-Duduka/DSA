

public class QueueMain {
    public static void main(String[] args) throws Exception{
        // CustomQueue queue = new CustomQueue(4);

        // queue.insert(23);
        // queue.insert(39);
        // queue.insert(20);
        // queue.insert(37);

        // queue.display();

        // queue.remove();
        // queue.remove();

        // System.out.println(queue.remove());
        // queue.display();

        // queue.insert(48);
        // System.out.println(queue.front());

        CircularQueue queue = new CircularQueue();

        queue.insert(23);
        queue.insert(39);
        queue.insert(20);
        queue.insert(37);

        queue.display();

        queue.remove();
        queue.remove();

        System.out.println(queue.remove());
        queue.display();

        queue.insert(48);
        System.out.println(queue.front());
    }
}
