package CP;

public class FrogJump_Striver_CodeStudio {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 10};
        System.out.println(solve(arr, 0, 0));
    }

    private static int solve(int[] arr, int index, int energy) {
        if (index == arr.length - 1) return energy;

        int l = solve(arr, index + 1, energy + Math.abs(arr[index + 1] - arr[index]));
        int r = Integer.MAX_VALUE;
        if (index + 2 < arr.length)
            r = solve(arr, index + 2, energy + Math.abs(arr[index + 1] - arr[index]));
        return Math.min(l, r);
    }
}
