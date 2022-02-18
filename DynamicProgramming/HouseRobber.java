package DynamicProgramming;

import java.util.Arrays;

public class HouseRobber {
    public static void main(String[] args) {
        int[] valueInHouse = {1, 5, 1, 2, 6};
        System.out.println(houseRobber(valueInHouse));
    }

    public static long houseRobber(int[] valueInHouse) {
        // Write your code here.
        if (valueInHouse.length == 2) return Math.max(valueInHouse[0], valueInHouse[1]);
        if (valueInHouse.length == 1) return valueInHouse[0];
        if (valueInHouse.length == 0) return 0;
        int[] t1 = Arrays.copyOfRange(valueInHouse, 0, valueInHouse.length - 1);
        int[] t2 = Arrays.copyOfRange(valueInHouse, 1, valueInHouse.length);

        long[] dp = new long[valueInHouse.length - 1];
        Arrays.fill(dp, -1);
        long l = solve(t1, t1.length - 1, dp);

        Arrays.fill(dp, -1);
        long r = solve(t2, t2.length - 1, dp);

        return Math.max(l, r);
    }

    public static long solve(int[] arr, int index, long[] dp) {
        if (index == 0) return arr[index];
        if (index < 0) return 0;
        if (dp[index] != -1) return dp[index];


        long take = arr[index] + solve(arr, index - 2, dp);

        long nontake = 0 + solve(arr, index - 1, dp);

        return dp[index] = Math.max(take, nontake);
    }
}
