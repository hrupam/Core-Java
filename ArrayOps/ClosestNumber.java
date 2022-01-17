package ArrayOps;

public class ClosestNumber {
    public static int getClosestNumber(int[] arr, int k) {
        if (arr.length == 0) return 0;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == k) return arr[mid];
            else if (k > arr[mid]) low = mid + 1;
            else high = mid - 1;
        }
        return low >= arr.length ? arr[high] : arr[low];
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 6, 8, 9};
        int k = 11;
        System.out.println(getClosestNumber(arr, k));
    }
}
