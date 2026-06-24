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
}
