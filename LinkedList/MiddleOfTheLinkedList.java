public class MiddleOfTheLinkedList {
    class Solution {
        public ListNode middleNode(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
    }
    public static void main(String[] args) {
        MiddleOfTheLinkedList middle = new MiddleOfTheLinkedList();
        Solution solution = middle.new Solution();
        
        ListNode head = PredefinedLinkedList.createPredefinedList();
        System.out.println("Linked List:");
        PredefinedLinkedList.printList(head);
        
        ListNode middleNode = solution.middleNode(head);
        System.out.println("\nMiddle Node Value: " + middleNode.val);
        System.out.println("Middle Node and onwards:");
        PredefinedLinkedList.printList(middleNode);
    }
}
