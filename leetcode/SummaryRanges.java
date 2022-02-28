package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 7, 8, 10, 13, 14};
        System.out.println(new SummaryRanges().summaryRanges(arr));
    }

    public List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) return new ArrayList<>();
        if (nums.length == 1) {
            List<String> list = new ArrayList<>();
            list.add("" + nums[0]);
            return list;
        }

        int i = 0;
        int j = 0;
        int k = 1;

        List<String> list = new ArrayList<>();

        while (k < nums.length) {
            if (nums[k] - nums[j] == 1) {
                j++;
                k++;
            } else {
                if (i != j) list.add(nums[i] + "->" + nums[j]);
                else list.add("" + nums[i]);
                i = k;
                j++;
                k++;
            }
        }
        if (i == j) list.add("" + nums[i]);
        else list.add(nums[i] + "->" + nums[j]);

        return list;

    }
}
