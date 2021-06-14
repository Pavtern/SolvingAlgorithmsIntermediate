import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;


public class ShuffleTheArrayTest {

    @Test
    public void shuffle() {
        ShuffleTheArray shuffleTheArray = new ShuffleTheArray();
        int[] entered = {1,2,3,4,5,6};
        int[] expected1 = {1,4,2,5,3,6};
        Assert.assertArrayEquals(expected1, shuffleTheArray.shuffle(entered,3));
    }
}
