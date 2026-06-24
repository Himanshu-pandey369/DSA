public class LinkedListCycle {
    public class Solution {
        public boolean hasCycle(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) {
                    return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        LinkedListCycle llCycle = new LinkedListCycle();
        Solution solution = llCycle.new Solution();
        
        ListNode head = PredefinedLinkedList.createPredefinedList();
        System.out.println("Linked List:");
        PredefinedLinkedList.printList(head);
        
        boolean hasCycle = solution.hasCycle(head);
        System.out.println("\nHas Cycle: " + hasCycle);
    }
}
