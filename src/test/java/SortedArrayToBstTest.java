import static org.junit.jupiter.api.Assertions.*;

import TreeNode.SortedArrayToBst;
import TreeNode.TreeNode;
import org.junit.jupiter.api.Test;

class SortedArrayToBstTest {
    
    @Test
    void testSingleElement() {
        SortedArrayToBst converter = new SortedArrayToBst();
        TreeNode root = converter.sortedArrayToBST(new int[]{5});
        assertNotNull(root);
        assertEquals(5, root.val);
        assertNull(root.left);
        assertNull(root.right);
    }
    
    @Test
    void testTwoElements() {
        SortedArrayToBst converter = new SortedArrayToBst();
        TreeNode root = converter.sortedArrayToBST(new int[]{1, 2});
        assertNotNull(root);
        assertEquals(2, root.val);
        assertNull(root.right);
        assertNotNull(root.left);
        assertEquals(1, root.left.val);
    }
    
    @Test
    void testThreeElements() {
        SortedArrayToBst converter = new SortedArrayToBst();
        TreeNode root = converter.sortedArrayToBST(new int[]{1, 2, 3});
        assertNotNull(root);
        assertEquals(2, root.val);
        assertNotNull(root.left);
        assertNotNull(root.right);
        assertEquals(1, root.left.val);
        assertEquals(3, root.right.val);
    }
    
    @Test
    void testMultipleElements() {
        SortedArrayToBst converter = new SortedArrayToBst();
        TreeNode root = converter.sortedArrayToBST(new int[]{1, 2, 3, 4, 5, 6, 7});
        assertNotNull(root);
        assertEquals(4, root.val);
        assertNotNull(root.left);
        assertNotNull(root.right);
        assertEquals(2, root.left.val);
        assertEquals(5, root.right.val);
    }

}
