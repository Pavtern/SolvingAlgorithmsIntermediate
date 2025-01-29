package TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode[]> queue = new LinkedList<>();
        queue.add(new TreeNode[]{p, q});
        while (!queue.isEmpty()) {
            TreeNode[] current = queue.poll();
            TreeNode currentP = current[0];
            TreeNode currentQ = current[1];

            if (currentP == null && currentQ == null) continue;
            if (currentP == null || currentQ == null || currentP.val != currentQ.val) return false;

            queue.add(new TreeNode[]{currentP.left, currentQ.left});
            queue.add(new TreeNode[]{currentP.right, currentQ.right});
        }
        return true;
    }
}

