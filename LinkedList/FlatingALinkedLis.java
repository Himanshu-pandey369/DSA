class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;

    public Node(int val) {
        this.val = val;
        this.prev = null;
        this.next = null;
        this.child = null;
    }

    public void printList() {
        Node curr = this;

        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }

        System.out.println();
    }
}

class FlatingALinkedLis {
    public Node flatten(Node head) {
        if (head == null) {
            return head;
        }

        Node curr = head;

        while (curr != null) {
            if (curr.child != null) {

                Node next = curr.next;

                curr.next = flatten(curr.child);
                curr.next.prev = curr;

                curr.child = null;

                while (curr.next != null) {
                    curr = curr.next;
                }

                if (next != null) {
                    curr.next = next;
                    next.prev = curr;
                }
            }

            curr = curr.next;
        }

        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(3);
        head.next.next.prev = head.next;
        head.next.child = new Node(7);
        head.next.child.next = new Node(8);
        head.next.child.next.prev = head.next.child;
        FlatingALinkedLis obj = new FlatingALinkedLis();
        Node flatHead = obj.flatten(head);

        flatHead.printList();
    }
}