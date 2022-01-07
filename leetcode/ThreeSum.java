package leetcode;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        System.out.println(new ThreeSum().threeSum(arr));
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<>();
        Set<List<Integer>> wrappedSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            map.clear();
            int sum = 0 - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int target = sum - nums[j];
                if (map.containsKey(target))
                    wrappedSet.add(List.of(nums[i], nums[j], target));
                else {
                    map.put(nums[j], j);
                }
            }
        }
        return new LinkedList<>(wrappedSet);
    }
}
