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

    }
}
