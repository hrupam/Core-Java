package leetcode;

import java.util.Scanner;

public class SearchInsertPos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("# elements - ");
            int n = sc.nextInt();
            int nums[] = new int[n];
            for (int i = 0; i < nums.length; i++)
                nums[i] = sc.nextInt();
            System.out.print("Target - ");
            int target = sc.nextInt();
            System.out.println("Index = " + searchInsert(nums, target));
        }
    }

    public static int searchInsert(int[] nums, int target) {
        int index = -1;
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (target > nums[mid]) {
                low = mid + 1;
            } else if (target < nums[mid]) {
                high = mid - 1;
            }
        }
        return low > high ? low : high;
    }
}
