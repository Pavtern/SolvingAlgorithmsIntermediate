import org.junit.Assert;
import org.junit.Test;


public class ImplementStrTest {

    @Test
    public static void main(String[] args) {
        ImplementStr impl = new ImplementStr();
        String haystack;
        String needle;

        haystack = "helollo";
        needle = "ll";
        Assert.assertEquals(impl.strStr(haystack, needle), 4);

        haystack = "helollolll";
        needle = "lll";
        Assert.assertEquals(impl.strStr(haystack, needle), 7);

        haystack = "mississippi";
        needle = "issip";
        Assert.assertEquals(impl.strStr(haystack, needle), 4);

        haystack = "aaaaa";
        needle = "bba";
        Assert.assertEquals(impl.strStr(haystack, needle), -1);


        haystack = "mississippi";
        needle = "mississippi";
        Assert.assertEquals(impl.strStr(haystack, needle), 0);

    }

}
