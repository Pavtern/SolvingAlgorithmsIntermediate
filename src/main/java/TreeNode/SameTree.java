package TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        Queue<TreeNode> queueP = new LinkedList<>();
        queueP.add(p);
        Queue<TreeNode> queueQ = new LinkedList<>();
        queueQ.add(q);
        while (!queueQ.isEmpty()) {
            TreeNode currentP = queueP.poll();
            TreeNode currentQ = queueQ.poll();
            if (currentP == null ^ currentQ == null)  return false;
            if (currentP != null) {
                if (currentP.val != currentQ.val) return false;

                if (currentP.left == null ^ currentQ.left == null) return false;
                if (currentP.left != null) {
                    queueP.add(currentP.left);
                    queueQ.add(currentQ.left);
                }

                if (currentP.right == null ^ currentQ.right == null) return false;
                if (currentP.right != null) {
                    queueP.add(currentP.right);
                    queueQ.add(currentQ.right);
                }
            }
        }
        return true;
    }
}
