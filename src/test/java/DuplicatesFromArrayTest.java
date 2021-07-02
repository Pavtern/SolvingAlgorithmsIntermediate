import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.rmi.activation.ActivationGroup_Stub;

import static org.junit.Assert.*;


public class DuplicatesFromArrayTest {

    @Test
    public void removeDuplicates() {
        DuplicatesFromArray duplicatesFromArray = new DuplicatesFromArray();
        int[] input = {1,1,2};
        int[] input2 = {0,0,1,1,1,2,2,3,3,4};
        int[] input3 = {1,1};
        int[] input4 = {1,1,2,3};
        int[] output = {1,2,1};
        int k = 2;
        Assert.assertEquals(duplicatesFromArray.removeDuplicates(input), 2);
        Assert.assertEquals(duplicatesFromArray.removeDuplicates(input2), 5);
        Assert.assertEquals(duplicatesFromArray.removeDuplicates(input3), 1);
        Assert.assertEquals(duplicatesFromArray.removeDuplicates(input4), 3);
        Assert.assertEquals(duplicatesFromArray.removeDuplicates(new int[] {-1,0,0,0,0,3,3}), 3);
    }
}
