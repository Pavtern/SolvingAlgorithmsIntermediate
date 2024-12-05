import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPositionTest {
    @Test
    void testSmallArrayTargetExists() {
        SearchInsertPosition sip = new SearchInsertPosition();
        int[] nums = {1, 3, 4, 6, 12};
        assertEquals(5, sip.searchInsert(nums, 13), "Target 1 exists at index 0");
        assertEquals(4, sip.searchInsert(nums, 12), "Target 1 exists at index 0");
        assertEquals(4, sip.searchInsert(nums, 11), "Target 1 exists at index 0");
    }

    @Test
    void testTargetExistsInArray() {
        SearchInsertPosition sip = new SearchInsertPosition();
        int[] nums = {1, 3, 5, 6};
        assertEquals(2, sip.searchInsert(nums, 5), "Target 5 exists at index 2");
    }

    @Test
    void testTargetShouldBeInsertedAtStart() {
        SearchInsertPosition sip = new SearchInsertPosition();
        int[] nums = {1, 3, 5, 6};
        assertEquals(0, sip.searchInsert(nums, 0), "Target 0 should be inserted at index 0");
    }

    @Test
    void testTargetShouldBeInsertedInMiddle() {
        SearchInsertPosition sip = new SearchInsertPosition();
        int[] nums = {1, 3, 5, 6};
        assertEquals(1, sip.searchInsert(nums, 2), "Target 2 should be inserted at index 1");
    }

    @Test
    void testTargetShouldBeInsertedAtEnd() {
        SearchInsertPosition sip = new SearchInsertPosition();
        int[] nums = {1, 3, 5, 6};
        assertEquals(4, sip.searchInsert(nums, 7), "Target 7 should be inserted at index 4");
    }

    @Test
    void testSingleElementArray() {
        SearchInsertPosition sip = new SearchInsertPosition();
        int[] nums = {10};
        assertEquals(0, sip.searchInsert(nums, 5), "Target 5 should be inserted at index 0");
        assertEquals(1, sip.searchInsert(nums, 15), "Target 15 should be inserted at index 1");
        assertEquals(0, sip.searchInsert(nums, 10), "Target 10 exists at index 0");
    }

    @Test
    void testLargeArray() {
        SearchInsertPosition sip = new SearchInsertPosition();
        int[] nums = new int[10000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i * 2; // Beispiel: [0, 2, 4, ..., 19998]
        }
        assertEquals(5000, sip.searchInsert(nums, 10000), "Target 10000 should be inserted at index 5000");
        assertEquals(0, sip.searchInsert(nums, -1), "Target -1 should be inserted at index 0");
        assertEquals(10000, sip.searchInsert(nums, 20001), "Target 20001 should be inserted at index 10000");
    }
}
