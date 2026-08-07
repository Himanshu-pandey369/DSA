import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

class Pair {
    Node node;
    int hd;

    Pair(Node node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}

public class TopView {

    public static ArrayList<Integer> topView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();

        if (root == null)
            return ans;

        TreeMap<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<>();

        queue.offer(new Pair(root, 0));

        while (!queue.isEmpty()) {
            Pair curr = queue.poll();

            // Store only the first node for each horizontal distance
            if (!map.containsKey(curr.hd)) {
                map.put(curr.hd, curr.node.data);
            }

            if (curr.node.left != null) {
                queue.offer(new Pair(curr.node.left, curr.hd - 1));
            }

            if (curr.node.right != null) {
                queue.offer(new Pair(curr.node.right, curr.hd + 1));
            }
        }

        for (int value : map.values()) {
            ans.add(value);
        }

        return ans;
    }
}