package TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root.left == null && root.right  == null) return true;
        Queue<TreeNode> leftNodes = new LinkedList<>();
        leftNodes.add(root.left);
        Queue<TreeNode> rightNodes = new LinkedList<>();
        rightNodes.add(root.right);
        while (!leftNodes.isEmpty()) {
            TreeNode currentLeft = leftNodes.poll();
            TreeNode currentRight = rightNodes.poll();
            if (currentRight == null && currentLeft == null) continue;
            if (currentRight == null || currentLeft == null || currentLeft.val != currentRight.val) return false;
            leftNodes.add(currentLeft.right);
            leftNodes.add(currentLeft.left);
            rightNodes.add(currentRight.left);
            rightNodes.add(currentRight.right);
        }
        return true;
    }
}
