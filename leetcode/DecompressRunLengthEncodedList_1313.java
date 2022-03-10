package leetcode;

import java.util.ArrayList;
import java.util.List;

public class DecompressRunLengthEncodedList_1313 {

    public int[] decompressRLElist(int[] nums) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i + 1 < nums.length; i = i + 2) {
            int freq = nums[i];
            int val = nums[i + 1];

            while (freq-- != 0) {

                list.add(val);

            }
        }

        int[] arr = new int[list.size()];
        for (int i = 0; i < arr.length; i++) arr[i] = list.get(i);

        return arr;

    }
}
