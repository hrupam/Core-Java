package leetcode;

import java.util.Arrays;

public class FrogJump {
    public static void main(String[] args) {
        int[] stones = {0, 1, 3, 5, 6, 8, 12, 17};
        System.out.println(new FrogJump().canCross(stones));
    }

    private static boolean solve(int[] stones, int index, int jump) {
        if (index == stones.length - 1) return true;

        int[] dev = {jump - 1, jump, jump + 1};
        for (int x : dev) {
            if (x > 0) {
                int pos = Arrays.binarySearch(stones, stones[index] + x);
                if (pos >= 0) {
                    if (solve(stones, pos, x)) return true;

                }
            }
        }
        return false;
    }

    public boolean canCross(int[] stones) {
        return solve(stones, 0, 0);
    }
}
