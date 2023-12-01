import junit.framework.TestCase;

public class Sqrt_xTest extends TestCase {

    public void testMySqrt() {
        Sqrt_x sqrtX = new Sqrt_x();
        assertEquals(46340, sqrtX.mySqrt(2147483647));
    }
}