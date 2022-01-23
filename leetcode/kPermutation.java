package leetcode;

import java.util.ArrayList;
import java.util.List;

public class kPermutation {
    private static int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }

    private static String solve(List<Integer> list, int n, int k, String str) {
        if (list.size() == 1) return str + list.get(0);
        int fact = factorial(n - 1);
        int index = k / fact;
        str += list.get(index);
        list.remove(index);
        return solve(list, n - 1, k % fact, str);
    }

    public static void main(String[] args) {
        System.out.println(new kPermutation().getPermutation(4, 17));
    }
    

    public String getPermutation(int n, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++)
            list.add(i);
        k -= 1;
        return solve(list, n, k, "");
    }

}
