public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (end >= start) {
            if (target > nums[end]) return end + 1;
            if (target <= nums[start]) return start;
            if (target > nums[start + (end - start) / 2]) {
                start = start + (end - start) / 2 + 1;
//                end -= 1;
            } else {
                end = start + (end - start) / 2 - 1;
            }
        }
        return 0;
    }
}
