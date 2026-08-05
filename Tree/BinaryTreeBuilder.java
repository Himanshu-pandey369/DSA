class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class BinaryTreeBuilder {
    private int index = 0;

    public TreeNode buildTree(Integer[] preorder) {
        if (index >= preorder.length || preorder[index] == null) {
            index++;
            return null;
        }

        TreeNode root = new TreeNode(preorder[index++]);
        root.left = buildTree(preorder);
        root.right = buildTree(preorder);

        return root;
    }

    int count(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftCt = count(root.left);
        int rigthCt = count(root.right);
        return leftCt + rigthCt + 1;
    }

    int sum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftSum = sum(root.left);
        int rightSum = sum(root.right);
        return leftSum + rightSum + root.val;
    }

    int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHt = height(root.left);
        int rigthHt = height(root.right);
        return Math.max(leftHt, rigthHt) + 1;
    }

    public void printPreorder(TreeNode root) {
        if (root == null) {
            System.out.print("null ");
            return;
        }

        System.out.print(root.val + " ");
        printPreorder(root.left);
        printPreorder(root.right);
    }

    public static void main(String[] args) {
        Integer[] preorder = {
                1, 2, 4, null, null, 5, null, null,
                3, null, 6, null, null
        };

        BinaryTreeBuilder builder = new BinaryTreeBuilder();
        TreeNode root = builder.buildTree(preorder);

        builder.printPreorder(root);
    }
}