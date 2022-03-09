package tcsCoding;

public class MaxSumOfSortedSubsequence {
    public static void main(String[] args) {
        int[] a = {2, 202, 3, 200, 4, 5};
        System.out.println(f(a, 0, Integer.MIN_VALUE));
    }


    private static int f(int[] a, int i, int last) {
        if (i == a.length - 1) {
            if (a[a.length - 1] > last) return a[a.length - 1];
            return 0;
        }

        int p = Integer.MIN_VALUE;
        if (a[i] > last) p = a[i] + f(a, i + 1, a[i]);
        int np = f(a, i + 1, last);

        return Math.max(p, np);
    }
}
