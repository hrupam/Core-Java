package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {5, 3, 6, 9, 8, 7, 4, 2, 6, 95};
        int target = 100;
        int[] result = twoSum(arr, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int required = target - nums[i];
            if (!map.containsKey(required))
                map.put(nums[i], i);
            else {
                result[0] = map.get(required);
                result[1] = i;
                return result;

            }
        }
        return result;
    }
}
