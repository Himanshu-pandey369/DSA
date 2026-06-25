import java.util.HashMap;

class Node {
    int val;
    Node next;
    Node random;

    Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }

    public static void printList(Node head) {
        Node current = head;

        while (current != null) {
            System.out.print("Node: " + current.val);

            if (current.random != null)
                System.out.print(", Random: " + current.random.val);
            else
                System.out.print(", Random: null");

            System.out.println();

            current = current.next;
        }
    }
}

class copyLLwithrandom {

    public Node copyRandomList(Node head) {

        if (head == null)
            return null;

        HashMap<Node, Node> map = new HashMap<>();

        Node curr = head;

        while (curr != null) {
            map.put(curr, new Node(curr.val));
            curr = curr.next;
        }

        curr = head;

        while (curr != null) {

            Node copy = map.get(curr);
            copy.next = map.get(curr.next);
            copy.random = map.get(curr.random);

            curr = curr.next;
        }

        return map.get(head);
    }


    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        head.random = head.next.next;       
        head.next.random = head;            
        head.next.next.random = head.next;   


        System.out.println("Original List:");
        Node.printList(head);


        copyLLwithrandom obj = new copyLLwithrandom();

        Node copiedHead = obj.copyRandomList(head);


        System.out.println("\nCopied List:");
        Node.printList(copiedHead);
    }
}