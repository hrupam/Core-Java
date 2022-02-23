package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PartitionEqualSubsetSum {

    public static void main(String[] args) {
        int[] arr = {3, 1, 1, 2, 2, 1};
        int sum = sum(arr);
        if ((sum & 1) != 0) System.out.println("false");
        else {
            int target = sum / 2;

            int[][] dp = new int[arr.length][target + 1];
            for (int[] x : dp) Arrays.fill(x, -1);

            List<Integer> s1 = new ArrayList<>();
            f(0, arr, target, s1, dp);

            List<Integer> s2 = new ArrayList<>();
            for (int x : arr) s2.add(x);

            for (int x : s1) s2.remove((Object) x);

            System.out.println(s1);
            System.out.println(s2);
        }

    }

    private static int sum(int[] arr) {
        int s = 0;
        for (int x : arr) s = s + x;
        return s;
    }

    private static int f(int i, int[] a, int target, List<Integer> list, int[][] dp) {
        if (target < 0) return 0;
        if (target == 0) return 1;
        if (i >= a.length) {
            if (target == 0) return 1;
            return 0;
        }
        if (dp[i][target] != -1) return dp[i][target];

        list.add(a[i]);
        int take = f(i + 1, a, target - a[i], list, dp);
        if (take == 1) return dp[i][target] = 1;

        list.remove(list.size() - 1);

        int nontake = f(i + 1, a, target, list, dp);
        if (nontake == 1) return dp[i][target] = 1;

        return dp[i][target] = 0;
    }
}
