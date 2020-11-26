package algorithm;

import java.util.Arrays;

// The example code is modified version of https://www.geeksforgeeks.org/bubble-sort/
public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {9, 8,7 ,1, 2, 3, 6, 5, 4};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void bubbleSort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[i] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
