package relevel;

import java.util.Scanner;

public class MaximumPeaks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();


        int res = f(arr, 0, n - 1);
        System.out.println(res);
    }

    static int f(int[] arr, int l, int r) {
        if (l == r) {
            return getPeaks(arr);
        }
        int maxi = 0;
        for (int i = l; i <= r; i++) {
            swap(arr, l, i);
            maxi = Math.max(maxi, f(arr, l + 1, r));
            swap(arr, l, i);
        }
        return maxi;
    }

    private static int getPeaks(int[] arr) {
        int n = arr.length;
        int ctr = 0;
        for (int i = 1; i < n - 1; i++)
            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) ctr++;

        return ctr;

    }

    private static void swap(int[] arr, int l, int r) {
        int t = arr[l];
        arr[l] = arr[r];
        arr[r] = t;
    }
}
