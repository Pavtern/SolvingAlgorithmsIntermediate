import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        ShuffleTheArray shuffleTheArray = new ShuffleTheArray();
        int[] myArray = shuffleTheArray.shuffle(new int[]{0, 1, 2, 3, 4, 5}, 3);
        for (int el : myArray) {
            System.out.print(el);
        }
    }

    public int[] shuffle(int[] nums, int n) {
        int[] result = Arrays.copyOf(nums, nums.length);
        if (nums.length > 2) {
            int x = 1;
            for (int i = 1; i < nums.length - 2; i+=2) {
                result[i] = nums[n];
                result[i+1] = nums[x];
                n++;
                x++;
            }
        }
        return result;
    }
}
