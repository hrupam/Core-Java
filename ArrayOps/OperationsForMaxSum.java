package ArrayOps;

public class OperationsForMaxSum {
    public static void main(String[] args) {
        int[] arr = {-1, -2, 5, 9, 6, -2, -10, 6, 2, 4, 7, 8, -50};
        System.out.println(maxSum(arr, 0, 0));
    }

    private static int maxSum(int[] arr, int index, int sum) {
        if (index == arr.length)
            return sum;
        int l = maxSum(arr, index + 1, sum + arr[index]);
        int r = maxSum(arr, index + 1, sum - arr[index]);
        return Math.max(l, r);
    }
}
