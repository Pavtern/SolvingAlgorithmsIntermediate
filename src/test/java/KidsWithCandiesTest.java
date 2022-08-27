import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class KidsWithCandiesTest {


    @Test
    public void kidsWithCandies() {
        KidsWithCandies kidsWithCandies = new KidsWithCandies();
        int a = 3;
        int[] candies = {2,3,5,1,3};
        List<Boolean> expected = new ArrayList<>();
        expected.add(true);
        expected.add(true);
        expected.add(true);
        expected.add(false);
        expected.add(true);
        Assert.assertEquals(expected,kidsWithCandies.kidsWithCandies(candies,a));
    }
}
