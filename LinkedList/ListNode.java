public class ListNode {
    int val;
    ListNode next;

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    // Constructor with just value (next defaults to null)
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
