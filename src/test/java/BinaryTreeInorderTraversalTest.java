import TreeNode.BinaryTreeInorderTraversal;
import TreeNode.TreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinaryTreeInorderTraversalTest {

    @Test
    public void testEmptyTree() {
        // Teste, wenn der Baum leer ist (root == null)
        BinaryTreeInorderTraversal traversal = new BinaryTreeInorderTraversal();
        TreeNode root = null;
        List<Integer> result = traversal.inorderTraversal(root);
        assertEquals(Collections.emptyList(), result);
    }

    @Test
    public void testSingleNodeTree() {
        // Teste einen Baum mit nur einem Knoten
        BinaryTreeInorderTraversal traversal = new BinaryTreeInorderTraversal();
        TreeNode root = new TreeNode(1);
        List<Integer> result = traversal.inorderTraversal(root);
        assertEquals(Collections.singletonList(1), result);
    }

    @Test
    public void testSimpleTree() {
        // Teste einen einfachen Baum
        //     1
        //    / \
        //   2   3
        BinaryTreeInorderTraversal traversal = new BinaryTreeInorderTraversal();
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        List<Integer> result = traversal.inorderTraversal(root);
        assertEquals(Arrays.asList(2, 1, 3), result);
    }

    @Test
    public void testLeftHeavyTree() {
        // Teste einen Baum, der nur linke Kinder hat
        //    3
        //   /
        //  2
        // /
        //1
        BinaryTreeInorderTraversal traversal = new BinaryTreeInorderTraversal();
        TreeNode root = new TreeNode(3, new TreeNode(2, new TreeNode(1), null), null);
        List<Integer> result = traversal.inorderTraversal(root);
        assertEquals(Arrays.asList(1, 2, 3), result);
    }

    @Test
    public void testRightHeavyTree() {
        // Teste einen Baum, der nur rechte Kinder hat
        // 1
        //  \
        //   2
        //    \
        //     3
        BinaryTreeInorderTraversal traversal = new BinaryTreeInorderTraversal();
        TreeNode root = new TreeNode(1, null, new TreeNode(2, null, new TreeNode(3)));
        List<Integer> result = traversal.inorderTraversal(root);
        assertEquals(Arrays.asList(1, 2, 3), result);
    }

    @Test
    public void testComplexTree() {
        // Teste einen komplexeren Baum
        //       4
        //      / \
        //     2   6
        //    / \ / \
        //   1  3 5  7
        BinaryTreeInorderTraversal traversal = new BinaryTreeInorderTraversal();
        TreeNode root = new TreeNode(4, 
            new TreeNode(2, new TreeNode(1), new TreeNode(3)), 
            new TreeNode(6, new TreeNode(5), new TreeNode(7))
        );
        List<Integer> result = traversal.inorderTraversal(root);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6, 7), result);
    }
}
