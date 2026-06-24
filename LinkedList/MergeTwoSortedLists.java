class MergeTwoSortedLists {
    class Solution {
        public ListNode mergeTwoLists(ListNode h1, ListNode h2) {
            if (h1 == null || h2 == null) {
                return h1 == null ? h2 : h1;
            }
            if (h1.val < h2.val) {
                h1.next = mergeTwoLists(h1.next, h2);
                return h1;
            } else {
                h2.next = mergeTwoLists(h2.next, h1);
                return h2;
            }
        }
    }

    public static void main(String[] args) {
        MergeTwoSortedLists merger = new MergeTwoSortedLists();
        Solution solution = merger.new Solution();
        
        ListNode list1 = PredefinedLinkedList.createPredefinedList();
        System.out.println("List 1:");
        PredefinedLinkedList.printList(list1);
        
        ListNode list2 = new ListNode(12);
        list2.next = new ListNode(26);
        list2.next.next = new ListNode(40);

        System.out.println("\nList 2:");
        
        PredefinedLinkedList.printList(list2);
        
        ListNode merged = solution.mergeTwoLists(list1, list2);
        System.out.println("\nMerged List:");
        PredefinedLinkedList.printList(merged);
    }
}