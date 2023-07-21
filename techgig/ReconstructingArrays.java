package techgig;

public class ReconstructingArrays {

    private static final int MOD = 1000000007;

    public static int countPossibleArrays(String str, int k) {
        int n = str.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            int count = 0;
            int num = 0;

            for (int j = i; j >= 1 && num <= k; j--) {
                int digit = str.charAt(j - 1) - '0';

                num += digit * (int) Math.pow(10, i - j);

                if (digit == 0)
                    continue;

                if (num <= k)
                    count = (count + dp[j - 1]) % MOD;
            }

            dp[i] = count;
        }

        return dp[n];
    }

    public static void main(String[] args) {
        String str = "123";
        int k = 1000;
        int possibleArrays = countPossibleArrays(str, k);
        System.out.println("Number of possible arrays: " + possibleArrays);
    }
}

