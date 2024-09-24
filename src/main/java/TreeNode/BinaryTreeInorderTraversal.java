package TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public List<Integer> res = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return res;
        recursive(root);
        return res;
    }

    public void recursive(TreeNode root) {
        if (root == null) return;

        recursive(root.left);
        res.add(root.val);
        recursive(root.right);
    }
}
