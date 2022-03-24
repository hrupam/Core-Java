package DynamicProgramming;

public class MinSubsetSumDifference {
    public static int minSubsetSumDifference(int[] arr, int n) {
        // Write your code here.
        int sum = 0;
        for (int x : arr) sum += x;
        boolean[][] dp = getDPOfTargetSum(arr, sum, n);
        int minSubsetSumDiff = Integer.MAX_VALUE;
        for (int s1 = 0; s1 <= sum; s1++) {
            if (dp[n - 1][s1]) {
                int s2 = sum - s1;
                minSubsetSumDiff = Math.min(minSubsetSumDiff, Math.abs(s1 - s2));
            }
        }
        return minSubsetSumDiff;
    }

    private static boolean[][] getDPOfTargetSum(int[] arr, int target, int n) {
        boolean[][] dp = new boolean[n][target + 1];
        for (int i = 0; i < n; i++) dp[i][0] = true;
        if (arr[0] <= target) dp[0][arr[0]] = true;
        for (int i = 1; i < n; i++) {
            for (int tar = 1; tar <= target; tar++) {
                boolean pick = false;
                if (arr[i] <= tar) pick = dp[i - 1][tar - arr[i]];
                boolean notpick = dp[i - 1][tar];
                dp[i][tar] = pick | notpick;
            }
        }

        return dp;
    }
}
