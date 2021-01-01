package zemian.commontasks.algorithm;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        // The quickest way to search an item in an array is to first sort it, then use binary search.

        int[] nums = new int[100_000];
        for (int i = 0; i < 100_000; i++) {
            nums[i] = 100_000 - i;
        }

        Arrays.sort(nums);
        //System.out.println(Arrays.toString(nums));

        int result = Arrays.binarySearch(nums, 999);
        System.out.println("search 999. result index=" + result);
        result = Arrays.binarySearch(nums, 999_999);
        System.out.println("search 999_999. result index= " + result);
    }
}
