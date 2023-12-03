import junit.framework.TestCase;
import org.junit.Assert;

public class ClimbingStairsTest extends TestCase {

    public void testClimbStairs() {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        assertEquals(14930352, climbingStairs.climbStairs(35));
        assertEquals(21, climbingStairs.climbStairs(7));
        assertEquals(13, climbingStairs.climbStairs(6));
        assertEquals(8, climbingStairs.climbStairs(5));
        assertEquals(5, climbingStairs.climbStairs(4));
        assertEquals(1, climbingStairs.climbStairs(1));
    }
}