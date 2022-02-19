package tcsCoding;

import java.util.Arrays;

public class CovidVaccination {
    public static void main(String[] args) {
        int n = 20;
        int dayNumber = 12;
        int maxVaccines = 35;

        int[] result = new int[n + 1];
        Arrays.fill(result, -1);

        int[] max = {-1};
        solve(n, dayNumber, maxVaccines, 1, -1, result, max);
        System.out.println(max[0]);
    }

    private static void solve(int n, int dayno, int vaccines, int currday, int last, int[] result, int[] currMax) {
        if (n == currday) {
            for (int i = 1; i <= vaccines; i++) {
                if (Math.abs(i - last) <= 1) {
                    if (vaccines - i == 0) {
                        result[n] = i;
                        currMax[0] = Math.max(currMax[0], result[dayno]);

                    }
                }
            }
//            System.out.println(Arrays.toString(result));
            return;
        }


        for (int i = 1; i <= vaccines; i++) {
            if (Math.abs(i - last) <= 1 || last == -1) {
                result[currday] = i;
                solve(n, dayno, vaccines - i, currday + 1, i, result, currMax);
                result[currday] = -1;
            }
        }
    }
}
