public class SumTree {
    int sumOfnodes(Node root) {
        if (root == null) {
            return 0;
        }
        int LeftSum = sumOfnodes(root.left);
        int RightSum = sumOfnodes(root.right);
        root.data += LeftSum + RightSum;
        return root.data;
    }
}
