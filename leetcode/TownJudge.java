package leetcode;


import java.util.Arrays;

public class TownJudge {
    public static void main(String[] args) {
        int[][] trust = {
                {1, 2},
                {2, 3}
        };
        int n = 3;

        System.out.println(findJudge(n, trust));
        ;
    }

    public static int findJudge(int n, int[][] trust) {
        int[] trustingArr = new int[n + 1];
        int[] trustedByArr = new int[n + 1];

        Arrays.fill(trustingArr, 0);
        Arrays.fill(trustedByArr, 0);


        for (int i = 0; i < trust.length; i++) {
            int trusting = trust[i][0];
            int trusted = trust[i][1];

            trustingArr[trusting]++;
            trustedByArr[trusted]++;
        }

        for (int i = 1; i <= n; i++) {
            if (trustedByArr[i] == n - 1 && trustingArr[i] == 0) return i;
        }
        return -1;
    }
}
