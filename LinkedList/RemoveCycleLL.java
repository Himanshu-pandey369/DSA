public class RemoveCycleLL {
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
                ListNode prev = null;
                while (slow != fast) {
                    slow = slow.next;
                    prev = fast;
                    fast = fast.next;
                }
                prev.next = null;
                return slow;
            } else {
                return null;
            }
        }
    }

    public static void main(String[] args) {
        RemoveCycleLL removeCycle = new RemoveCycleLL();
        Solution solution = removeCycle.new Solution();
        
        // Create a list with cycle: 10 -> 24 -> 38 -> 45 -> 55 -> 38 (cycle)
        ListNode head = new ListNode(10);
        head.next = new ListNode(24);
        head.next.next = new ListNode(38);
        head.next.next.next = new ListNode(45);
        head.next.next.next.next = new ListNode(55);
        head.next.next.next.next.next = head.next.next; // Create cycle
        
        System.out.println("Detecting and removing cycle...");
        ListNode cycleStart = solution.detectCycle(head);
        
        if (cycleStart != null) {
            System.out.println("Cycle removed at node with value: " + cycleStart.val);
        } else {
            System.out.println("No cycle was found");
        }
        
        System.out.println("\nList after removing cycle:");
        PredefinedLinkedList.printList(head);
    }
}
