public class LinkedListCycle2 {
    public class Solution {
        public ListNode detectCycle(ListNode head) {
            boolean isCycle = false;
            ListNode slow = head;
            ListNode fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) {
                    isCycle = true;
                    break;
                }
            }
            if (isCycle) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            } else {
                return null;
            }
        }
    }

    public static void main(String[] args) {
        LinkedListCycle2 llCycle2 = new LinkedListCycle2();
        Solution solution = llCycle2.new Solution();
        
        ListNode head = PredefinedLinkedList.createPredefinedList();
        System.out.println("Linked List:");
        PredefinedLinkedList.printList(head);
        
        ListNode cycleStart = solution.detectCycle(head);
        if (cycleStart != null) {
            System.out.println("\nCycle detected at node with value: " + cycleStart.val);
        } else {
            System.out.println("\nNo cycle detected in the list");
        }
    }
}
