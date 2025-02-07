package TreeNode;

public class SortedArrayToBst {
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode node = new TreeNode(nums[nums.length / 2]);
        if(nums.length > 1) dive(0, nums.length, nums, nums.length / 2, node);
        return node;
    }

    void dive(int min, int max, int[] nums, int curr, TreeNode node) {
        int left = (curr + min) / 2;
        int right = (curr + max) / 2;
        if (left > min && min != curr || left == 0) {
            node.left = new TreeNode(nums[left]);
            if (curr > 1) dive(min, curr, nums, left, node.left);
        }
        if (right < max && curr != nums.length - 2 && right != curr) {
            node.right = new TreeNode(nums[right]);
            dive(curr, max, nums, right, node.right);
        } else if (curr == nums.length - 2) {
            node.right = new TreeNode(nums[curr + 1]);
        }
    }
}
