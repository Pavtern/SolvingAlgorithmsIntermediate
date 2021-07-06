import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    public void lengthOfLongestSubstring() {
        LongestSubstringWithoutRepeatingCharacters len = new LongestSubstringWithoutRepeatingCharacters();
        String str1 = "aab";
        String str2 = "jbpnbwwd";
        String str3 = "tmmzuxt";
        Assert.assertEquals(len.lengthOfLongestSubstring(str1), 2);
        Assert.assertEquals(len.lengthOfLongestSubstring(str2), 4);
        Assert.assertEquals(len.lengthOfLongestSubstring(str3), 5);
    }
}