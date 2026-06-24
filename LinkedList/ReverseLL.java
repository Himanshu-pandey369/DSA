public class ReverseLL {
    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode prev = null;
            ListNode current = head;
            while (current != null) {
                ListNode next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            return prev;
        }
    }
    public static void main(String[] args) {
        ReverseLL reverser = new ReverseLL();
        Solution solution = reverser.new Solution();
        
        ListNode head = PredefinedLinkedList.createPredefinedList();
        System.out.println("Original List:");
        PredefinedLinkedList.printList(head);
        
        ListNode reversedHead = solution.reverseList(head);
        System.out.println("\nReversed List:");
        PredefinedLinkedList.printList(reversedHead);
    }
}