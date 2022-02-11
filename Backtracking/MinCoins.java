package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class MinCoins {

    public static void main(String[] args) {
        int[] choices = {1, 2, 3};
        int target = 7;
        System.out.println(solve(choices, target, new ArrayList<>()));
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
}
