package TreeNode;

public class TreePrinter {
    public static void printTree(TreeNode root) {
        printTree(root, 0);
    }

    private static void printTree(TreeNode node, int depth) {
        if (node == null) {
            return;
        }
        
        printTree(node.right, depth + 1);
        
        System.out.println(" ".repeat(depth * 4) + node.val);
        
        printTree(node.left, depth + 1);
    }
}
