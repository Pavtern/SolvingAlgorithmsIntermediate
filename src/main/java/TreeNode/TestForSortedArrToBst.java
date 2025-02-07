package TreeNode;

public class TestForSortedArrToBst {
    public static void main(String[] args) {
        int[] nums1 = {0,1,2,3,4,5,6};
        int[] nums2 = {-10,-3,0,5,9};
        int[] nums3 = {-10,-3,0,5};
        int[] nums4 = {-10,-3,0};
        int[] nums5 = {-10,-3};
        int[] nums6 = {-10};
        SortedArrayToBst sab = new SortedArrayToBst();
        TreeNode node = sab.sortedArrayToBST(nums1);
//        BinaryTreeInorderTraversal bti = new BinaryTreeInorderTraversal();
//        System.out.println((bti.inorderTraversal(node)));
        TreePrinter.printTree(node);
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        node = sab.sortedArrayToBST(nums2);
        TreePrinter.printTree(node);
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        node = sab.sortedArrayToBST(nums3);
        TreePrinter.printTree(node);
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        node = sab.sortedArrayToBST(nums4);
        TreePrinter.printTree(node);
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        node = sab.sortedArrayToBST(nums5);
        TreePrinter.printTree(node);
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        node = sab.sortedArrayToBST(nums6);
        TreePrinter.printTree(node);
    }
}
