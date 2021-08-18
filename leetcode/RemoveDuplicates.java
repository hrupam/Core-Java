package leetcode;

import java.util.*;

class RemoveDuplicates {
    public static int[] removeDuplicatesUsingSet(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int x : nums)
            set.add(x);
        int[] temp = new int[set.size()];
        int i = 0;
        for (int x : set)
            temp[i++] = x;
        return temp;
    }

    public static int[] removeDuplicatesUsingArray(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            boolean flag = false;
            inner:
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] == nums[j]) {
                    flag = true;
                    break inner;
                }
            }
            if (!flag)
                list.add(nums[i]);
        }
        int[] temp = new int[list.size()];
        int i = 0;
        for (int x : list)
            temp[i++] = x;
        return temp;
    }

    public static void main(String[] args) {

        int[] nums = new int[100000];
        for (int i = 0; i < nums.length; i++)
            nums[i] = (int) Math.round(Math.random() * 10);

        long startArray = System.nanoTime();
        int[] uniquesArray = removeDuplicatesUsingArray(nums);
        long endArray = System.nanoTime();
        System.out.println(Arrays.toString(uniquesArray) + " ,Time (using Array) = " + (endArray - startArray));

        long startSet = System.nanoTime();
        int[] uniquesSet = removeDuplicatesUsingSet(nums);
        long endSet = System.nanoTime();
        System.out.println(Arrays.toString(uniquesSet) + " ,Time (using Set) = " + (endSet - startSet));
    }
}


