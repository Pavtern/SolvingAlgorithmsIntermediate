import junit.framework.TestCase;

public class AddBinaryTest extends TestCase {

    public void testAddBinary() {

        AddBinary AddBinary = new AddBinary();
        assertEquals("110001", AddBinary.addBinary("101111", "10"));
        assertEquals("110110", AddBinary.addBinary("100", "110010"));
        assertEquals("100", AddBinary.addBinary("11", "1"));
        assertEquals("10101", AddBinary.addBinary("1010", "1011"));


        assertEquals("0", AddBinary.addBinary("0", "0"));
        assertEquals("1", AddBinary.addBinary("0", "1"));

        assertEquals("1000", AddBinary.addBinary("111", "1"));
        assertEquals("110", AddBinary.addBinary("1", "101"));

    }
}