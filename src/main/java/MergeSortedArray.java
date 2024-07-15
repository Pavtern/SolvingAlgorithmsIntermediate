import java.util.Arrays;

public class MergeSortedArray {
    //https://leetcode.com/problems/merge-sorted-array/

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int lFP = nums1.length - 1; //Letzter Freier Platz im nums1 wo wir Ziffer hinschieben
        int i = m == 0 ? 0 : m - 1;
        int j = n - 1;

        while (j >= 0 && lFP >= 0 && i >= 0) {
            if (nums2[j] > nums1[i]) {
                nums1[lFP] = nums2[j];
                lFP--;
                j--;
            } else {
                nums1[lFP] = nums1[i];
                nums1[i] = nums2[j];
                if (i > 0) {
                    i--;
                } else {
                    j--;
                }
                lFP--;
            }
        }
    }
}


