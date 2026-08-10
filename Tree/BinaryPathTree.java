import java.util.*;

public class BinaryPathTree {
    void allPaths(TreeNode root, String path, List<String> ans) {
        if (root.left == null && root.right == null) {
            ans.add(path);
            return;
        }
        if (root.left != null) {
            allPaths(root.left, path + "->" + root.left.val, ans);
        }
        if (root.right != null) {
            allPaths(root.right, path + "->" + root.right.val, ans);
        }
    }
}
