package ArrayOps;

public class MaximumSumSubarray {
    public static int kadane(int[] a) {
        int maxEndingHere = 0;
        int maxSoFar = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            maxEndingHere += a[i];
            if (maxEndingHere < a[i])
                maxEndingHere = a[i];
            if (maxSoFar < maxEndingHere)
                maxSoFar = maxEndingHere;
        }
        return maxSoFar;
    }

    public static int bruteForce(int[] a) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j <= a.length; j++) {
                int sum = 0;
                for (int k = i; k < j; k++) {
                    sum += a[k];
                }
                if (maxSum < sum)
                    maxSum = sum;

            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int a[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4, 1, 6, 9, 5, 4, -9, 4, -9, 8, 4, 45, 8, -2, 8, 9, -9, -10, -78};

        long bruteForceStartTime = System.nanoTime();
        int maxSumBrute = bruteForce(a);
        long bruteForceEndTime = System.nanoTime();
        System.out.println("For Brute Force, Maximum subarray sum: " + maxSumBrute + " and, Time takes = " + (bruteForceEndTime - bruteForceStartTime));

        long kadaneStartTime = System.nanoTime();
        int maxSumKadane = kadane(a);
        long kadaneEndTime = System.nanoTime();
        System.out.println("For Kadane, Maximum subarray sum: " + maxSumKadane + " and, Time takes = " + (kadaneEndTime - kadaneStartTime));

    }
}
