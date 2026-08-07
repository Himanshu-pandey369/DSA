class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class diameterOfBinaryTree {
    int ans = 0;

    int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHt = height(root.left);
        int rigthHt = height(root.right);
        ans = Math.max(ans, leftHt + rigthHt);
        return Math.max(leftHt, rigthHt) + 1;
    }

    int diameterOfbinaryTree(TreeNode root) {
        height(root);
        return ans;
    }
}