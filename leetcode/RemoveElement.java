package leetcode;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        List<Integer> list = new ArrayList<>();
        for (int x : nums)
            list.add(x);
        for (int i = 0; i < list.size(); i++) {
            if (val == list.get(i)) {
                list.remove(i);
                i--;
            }
        }
        int k = list.size();
        for (int i = 0; i < k; i++)
            nums[i] = list.get(i);
        return k;
    }

    public static int removeElementNaive(int[] nums, int val) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] == val) {
                for (int j = i + 1; j < len; j++) {
                    nums[j - 1] = nums[j];
                }
                len -= 1;
                i--;
            }
        }
        return len;
    }

    public static void main(String[] args) {
        int nums[] = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int k = removeElementNaive(nums, val);
        for (int i = 0; i < k; i++)
            System.out.print(nums[i] + " ");


    }
}
