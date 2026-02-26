public class Main {

    // Definition for singly-linked list
    static class ListNode {
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

    // Your Solution class
    static class Solution {
        public ListNode removeElements(ListNode head, int val) {
            if(head == null){
                return head;
            }

            ListNode node = head;

            while(node.next != null){
                if(node.next.val == val){
                    node.next = node.next.next;
                } else {
                    node = node.next;
                }
            }

            if(node.val == val){
                node = null;
            }

            return head;
        }
    }

    public static void main(String[] args) {

        // Test Case 1: 1 -> 2 -> 6 -> 3 -> 6
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(6,
                                new ListNode(3,
                                        new ListNode(6)))));

        System.out.println("Original List:");
        printList(head);

        Solution sol = new Solution();
        head = sol.removeElements(head, 6);

        System.out.println("After Removing 6:");
        printList(head);

        // Additional edge case
        System.out.println("\nEdge Case: Head contains value");

        ListNode head2 = new ListNode(6,
                new ListNode(6,
                        new ListNode(1)));

        printList(head2);
        head2 = sol.removeElements(head2, 6);
        printList(head2);
    }

    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
}