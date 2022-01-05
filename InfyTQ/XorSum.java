package InfyTQ;

import java.util.Scanner;

public class XorSum {

    private static int getXorSum(int x, int[] arr) {
        int sum = 0;
        for (int y : arr)
            sum += x ^ y;

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        int maxSum = Integer.MIN_VALUE;
        for (int x = 0; x <= k; x++) {
            maxSum = Math.max(getXorSum(x, arr), maxSum);
        }

        System.out.println(maxSum);
    }
}
