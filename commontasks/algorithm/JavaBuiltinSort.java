package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JavaBuiltinSort {
    public static void main(String[] args) {
        // Java uses QuickSort/TimSort/MergeSort depending on data provided

        int[] nums = {9, 8,7 ,1, 2, 3, 6, 5, 4};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        List<Integer> nums2 = new ArrayList<>(List.of(9, 8,7 ,1, 2, 3, 6, 5, 4));
        Collections.sort(nums2);
        System.out.println(nums2);
    }
}
