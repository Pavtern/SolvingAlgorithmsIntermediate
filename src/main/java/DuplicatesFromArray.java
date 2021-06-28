public class DuplicatesFromArray {
    public int removeDuplicates(int[] nums) {

        int k = nums.length;

        if(k == 1) return k;

        boolean bool = false;
        int count = 0;

        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] == nums[i+1]){
                bool = true;
                k -= 1;
                count += 1;
                continue;
            }
            if(bool){
                remove(nums, i - count + 1, count, k);
                bool = false;
                count = 0;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ",");
        }

        return k;
    }

    private void remove(int[] nums, int index, int count, int last){
        for (int i = index; i < last; i++) {
            nums[i] = nums[i + count];
        }
    }
}
