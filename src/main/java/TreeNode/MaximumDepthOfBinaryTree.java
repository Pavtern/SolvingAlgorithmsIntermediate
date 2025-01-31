package TreeNode;

public class MaximumDepthOfBinaryTree {
    int maxDepth = 0;
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        recursiveDepth(root, 0);
        return maxDepth;
    }

    private void recursiveDepth(TreeNode root, int currentDepth) {
        currentDepth++;
        if (root.right != null) recursiveDepth(root.right, currentDepth);
        if (root.left != null) recursiveDepth(root.left, currentDepth);
        if (root.left == null && root.right == null && currentDepth > maxDepth) {
            maxDepth = currentDepth;
        }
    }
}
