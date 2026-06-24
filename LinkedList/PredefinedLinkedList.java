public class PredefinedLinkedList {

    public static ListNode createPredefinedList() {
        ListNode head = new ListNode(10);
        head.next = new ListNode(24);
        head.next.next = new ListNode(38);
        head.next.next.next = new ListNode(45);
        head.next.next.next.next = new ListNode(55);
        return head;
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
