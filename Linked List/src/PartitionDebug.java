class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {

    public ListNode partition(ListNode head, int x) {
        if(head == null) {
            return null;
        }
        if(head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(0, head);
        ListNode tail = findTail(dummy);
        ListNode endNode = tail;
        ListNode temp = dummy;
        ListNode store ;
        while(temp.next != endNode){
            if(temp.next.val >= x){
                store = temp.next;
                temp.next = temp.next.next;
                insertLast(store, tail);
                tail = store;
            } else {
                temp = temp.next;
            }
        }
        if(temp.next.val >= x){
                store = temp.next;
                temp.next = temp.next.next;
                insertLast(store, tail);
                tail = store;
        }
        return dummy.next;
    }
    public void insertLast(ListNode node, ListNode tail){
        tail.next = node;
        node.next = null;
        tail = node;
    }
    public ListNode findTail(ListNode head){
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        return temp;
    }
}

public class PartitionDebug {

    public static void main(String[] args) {

        // Build test linked list
        int[] arr = {1,2};
        ListNode head = createList(arr);

        System.out.println("Original List:");
        printList(head);

        Solution sol = new Solution();

        int x = 2;

        ListNode result = sol.partition(head, x);

        System.out.println("\nAfter Partition:");
        printList(result);
    }

    public static ListNode createList(int[] arr) {

        if (arr.length == 0) return null;

        ListNode head = new ListNode(arr[0]);
        ListNode current = head;

        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }

        return head;
    }

    public static void printList(ListNode head) {

        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}