public class ReverseNodeinKGroups {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
        public ListNode reverseKGroup(ListNode head, int k) {
            ListNode temp = head;
            int cnt = 0;
            while (cnt < k) {
                if (temp == null) {
                    return head;
                }
                temp = temp.next;
                cnt++;
            }
            ListNode prevNode = reverseKGroup(temp, k);
            temp = head;
            cnt = 0;
            while (cnt < k) {
                ListNode Next = temp.next;
                temp.next = prevNode;
                prevNode = temp;
                temp = Next;
                cnt++;
            }
            return prevNode;
        }

    public static void main(String[] args) {
        ReverseNodeinKGroups obj = new ReverseNodeinKGroups();
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(5);
        head.next.next.next.next = new ListNode(7);
        head = obj.reverseKGroup(head, 3);
        PredefinedLinkedList.printList(head);
    }
}
