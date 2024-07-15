import junit.framework.TestCase;
import java.util.Arrays;

public class MergeSortedArrayTest extends TestCase {

    private MergeSortedArray mergeSortedArray;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        mergeSortedArray = new MergeSortedArray();
    }

    public void testMergeExample1() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        mergeSortedArray.merge(nums1, m, nums2, n);
        int[] expected = {1, 2, 2, 3, 5, 6};
        assertTrue(Arrays.equals(nums1, expected));
    }

    public void testMergeExample2() {
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;
        mergeSortedArray.merge(nums1, m, nums2, n);
        int[] expected = {1};
        assertTrue(Arrays.equals(nums1, expected));
    }

    public void testMergeExample3() {
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        mergeSortedArray.merge(nums1, m, nums2, n);
        int[] expected = {1};
        assertTrue(Arrays.equals(nums1, expected));
    }

    public void testMergeVariant1() {
        int[] nums1 = {1, 3, 5, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 4, 6};
        int n = 3;
        mergeSortedArray.merge(nums1, m, nums2, n);
        int[] expected = {1, 2, 3, 4, 5, 6};
        assertTrue(Arrays.equals(nums1, expected));
    }

    public void testMergeVariant2() {
        int[] nums1 = {2, 2, 3, 0, 0, 0, 0};
        int m = 3;
        int[] nums2 = {1, 5, 7, 8};
        int n = 4;
        mergeSortedArray.merge(nums1, m, nums2, n);
        int[] expected = {1, 2, 2, 3, 5, 7, 8};
        assertTrue(Arrays.equals(nums1, expected));
    }

    public void testMergeVariant3() {
        int[] nums1 = {0, 0, 0, 0, 0};
        int m = 0;
        int[] nums2 = {1, 2, 3, 4, 5};
        int n = 5;
        mergeSortedArray.merge(nums1, m, nums2, n);
        int[] expected = {1, 2, 3, 4, 5};
        assertTrue(Arrays.equals(nums1, expected));
    }

    public void testMergeVariant4() {
        int[] nums1 = {10, 20, 30, 40, 0, 0, 0};
        int m = 4;
        int[] nums2 = {15, 25, 35};
        int n = 3;
        mergeSortedArray.merge(nums1, m, nums2, n);
        int[] expected = {10, 15, 20, 25, 30, 35, 40};
        assertTrue(Arrays.equals(nums1, expected));
    }

    public void testMergeVariant5() {
        int[] nums1 = {-5, -3, -1, 0, 0, 0};
        int m = 3;
        int[] nums2 = {-4, -2, 0};
        int n = 3;
        mergeSortedArray.merge(nums1, m, nums2, n);
        int[] expected = {-5, -4, -3, -2, -1, 0};
        assertTrue(Arrays.equals(nums1, expected));
    }

    public void testMergeVariant6() {
        int[] nums1 = {1, 4, 7, 0, 0};
        int m = 3;
        int[] nums2 = {2, 6};
        int n = 2;
        mergeSortedArray.merge(nums1, m, nums2, n);
        int[] expected = {1, 2, 4, 6, 7};
        assertTrue(Arrays.equals(nums1, expected));
    }

    public void testMergeVariant7() {
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        mergeSortedArray.merge(nums1, m, nums2, n);
        int[] expected = {1};
        assertTrue(Arrays.equals(nums1, expected));
    }

    public void testMergeVariant8() {
        int[] nums1 = {3, 0, 0, 0};
        int m = 1;
        int[] nums2 = {1, 2, 4};
        int n = 3;
        mergeSortedArray.merge(nums1, m, nums2, n);
        int[] expected = {1, 2, 3, 4};
        assertTrue(Arrays.equals(nums1, expected));
    }

    public void testMergeVariant9() {
        int[] nums1 = {5, 6, 7, 8, 0, 0};
        int m = 4;
        int[] nums2 = {1, 2};
        int n = 2;
        mergeSortedArray.merge(nums1, m, nums2, n);
        int[] expected = {1, 2, 5, 6, 7, 8};
        assertTrue(Arrays.equals(nums1, expected));
    }

    public void testMergeVariant10() {
        int[] nums1 = {-3, -2, -1, 0, 0, 0};
        int m = 3;
        int[] nums2 = {-5, -4, 0};
        int n = 3;
        mergeSortedArray.merge(nums1, m, nums2, n);
        int[] expected = {-5, -4, -3, -2, -1, 0};
        assertTrue(Arrays.equals(nums1, expected));
    }
}
