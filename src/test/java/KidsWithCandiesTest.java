import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


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
