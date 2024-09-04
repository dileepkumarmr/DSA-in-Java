package LEETCODE;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LinkedListCycle {



        public static boolean hasCycle(ListNode head) {
            if(head == null)
                return false;

            ListNode slow = head;
            ListNode fast = head.next;

            while(fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;

                if(slow == fast)
                    return true;
            }
            return false;
        }

    public static void main(String[] args) {
        // Create a linked list with a cycle
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = head.next; // Creating a cycle


        boolean result = hasCycle(head);
        System.out.println("Has cycle: " + result);  // Expected output: true

        // Create a linked list without a cycle
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);

        result = hasCycle(head2);
        System.out.println("Has cycle: " + result);  // Expected output: false
    }
}
