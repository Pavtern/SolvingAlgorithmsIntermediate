import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import TreeNode.*;
import java.util.Queue;
import java.util.LinkedList;

public class SameTreeTest {

    @Test
    public void testIsSameTree() {
        SameTree sameTree = new SameTree();

        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);
        p.right.left = new TreeNode(4);
        p.right.right = new TreeNode(5);

        // Baum q = [1,2,3]
        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        assertFalse(sameTree.isSameTree(p, q), "Die Bäume sollten nicht gleich sein, da p eine andere Struktur als q hat.");


        TreeNode tree9 = new TreeNode(1);
        tree9.left = new TreeNode(2);

        TreeNode tree10 = new TreeNode(1);
        tree10.right = new TreeNode(2);

        assertFalse(sameTree.isSameTree(tree9, tree10), "Die Bäume sollten unterschiedlich sein aufgrund unterschiedlicher Struktur");
        // Testfall 1: Beide Bäume sind gleich
        TreeNode tree1 = new TreeNode(1);
        tree1.left = new TreeNode(2);
        tree1.right = new TreeNode(3);

        TreeNode tree2 = new TreeNode(1);
        tree2.left = new TreeNode(2);
        tree2.right = new TreeNode(3);

        assertTrue(sameTree.isSameTree(tree1, tree2), "Die Bäume sollten gleich sein");

        // Testfall 2: Beide Bäume sind unterschiedlich (unterschiedliche Werte)
        TreeNode tree3 = new TreeNode(1);
        tree3.left = new TreeNode(2);
        tree3.right = new TreeNode(1);  // Unterschiedlicher Wert

        TreeNode tree4 = new TreeNode(1);
        tree4.left = new TreeNode(2);
        tree4.right = new TreeNode(3);

        assertFalse(sameTree.isSameTree(tree3, tree4), "Die Bäume sollten unterschiedlich sein");

        // Testfall 3: Einer der Bäume ist null
        TreeNode tree5 = null;
        TreeNode tree6 = new TreeNode(1);

        assertFalse(sameTree.isSameTree(tree5, tree6), "Ein Baum ist null, sie sollten nicht gleich sein");

        // Testfall 4: Beide Bäume sind null
        TreeNode tree7 = null;
        TreeNode tree8 = null;

        assertTrue(sameTree.isSameTree(tree7, tree8), "Beide Bäume sind null, sie sollten gleich sein");

        // Testfall 5: Unterschiedliche Baumstrukturen

    }
}
