import org.junit.Assert;
import org.junit.Test;


public class ImplementStrTest {

    @Test
    public static void main(String[] args) {
        ImplementStr impl = new ImplementStr();
        String haystack = "aaaaa";
        String needle = "bba";
        Assert.assertEquals(impl.strStr(haystack, needle), -1);

        haystack = "hello";
        needle = "ll";
        Assert.assertEquals(impl.strStr(haystack, needle), 2);

    }

}
