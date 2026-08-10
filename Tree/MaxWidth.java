import java.util.*;

class MaxWidth {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;

        Queue<TreeNode> q = new LinkedList<>();
        Queue<Long> index = new LinkedList<>();

        q.add(root);
        index.add(0L);

        long ans = 0;

        while (!q.isEmpty()) {
            int n = q.size();
            long first = index.peek();
            long last = first;

            for (int i = 0; i < n; i++) {
                TreeNode node = q.poll();
                long pos = index.poll();

                last = pos;

                if (node.left != null) {
                    q.add(node.left);
                    index.add(2 * pos + 1);
                }

                if (node.right != null) {
                    q.add(node.right);
                    index.add(2 * pos + 2);
                }
            }

            ans = Math.max(ans, last - first + 1);
        }

        return (int) ans;
    }
}