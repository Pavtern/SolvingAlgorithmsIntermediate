public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int result = nums.length;
        for (int i = 0; i < result; i++) {
            if(nums[i] == val){
                nums[i] = nums[result-1];
                result -= 1;
                i -= 1;
            }
        }
        return result;
    }
}
