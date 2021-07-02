public class DuplicatesFromArray {
    public int removeDuplicates(int[] nums) {

        int k = nums.length;

        if(k == 1) return k;

        boolean bool = false;
        int count = 0;

        for (int i = 0; i < k - 1; i++) {
            if(nums[i] == nums[i+1]){
                bool = true;
                count += 1;
                if(i+2 < k)
                continue;
            }
            if(bool){
                k -= count;
                remove(nums, i - count + 1, count);
                bool = false;
                i -= count;
                count = 0;
            }
        }
        System.out.println("\n");

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ",");
        }

        return k;
    }

    private void remove(int[] nums, int index, int count){
        System.out.print(".");
        for (int i = index; i < nums.length - count; i++) {
            nums[i] = nums[i + count];
        }
    }
}
