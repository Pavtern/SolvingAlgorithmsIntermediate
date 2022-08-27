
import org.junit.Assert;
import org.junit.Test;


public class ShuffleTheArrayTest {

    @Test
    public void shuffle() {
        ShuffleTheArray shuffleTheArray = new ShuffleTheArray();
        int[] entered = {1,2,3,4,5,6};
        int[] expected1 = {1,4,2,5,3,6};
        Assert.assertArrayEquals(expected1, shuffleTheArray.shuffle(entered,3));
    }
}
