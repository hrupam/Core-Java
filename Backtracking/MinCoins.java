package Backtracking;

import java.util.Arrays;
import java.util.List;

public class MinCoins {

    public static void main(String[] args) {
        int[] choices = {1, 2, 3};
        int target = 7;
//        System.out.println(solve(choices, target, new ArrayList<>()));

        //call for approach 2
        int[][] dp = new int[choices.length][target + 1];
        for (int[] a : dp) Arrays.fill(a, -1);
        int min = f(choices.length - 1, target, choices, dp);
        if (min == Integer.MAX_VALUE || min >= (int) Math.pow(10, 9)) System.out.println("not possible");
        ;
        System.out.println(min);
    }

    private static int solve(int[] choices, int target, List<Integer> coins) {
        if (target < 0) return Integer.MAX_VALUE;
        if (target == 0) return coins.size();

        int min = Integer.MAX_VALUE;
        for (int coin : choices) {
            coins.add(coin);
            min = Math.min(solve(choices, target - coin, coins), min);
            coins.remove(coins.size() - 1);
        }

        return min;
    }

    //Approach 2
    private static int f(int i, int target, int[] num, int[][] dp) {
        if (i == 0) {
            if (target % num[0] == 0) return target / num[0];
            return (int) Math.pow(10, 9);
        }
        if (dp[i][target] != -1) return dp[i][target];


        int take = Integer.MAX_VALUE;
        if (num[i] <= target)
            take = 1 + f(i, target - num[i], num, dp);
        int nontake = 0 + f(i - 1, target, num, dp);
        return dp[i][target] = Math.min(take, nontake);
    }
}
