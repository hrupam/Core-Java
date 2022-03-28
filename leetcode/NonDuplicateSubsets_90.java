package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class NonDuplicateSubsets_90 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3}; //arr must be sorted
        Arrays.sort(arr);
        List<List<Integer>> ansList = new LinkedList<>();
        f(0, arr, arr.length, new ArrayList<>(), ansList);
        System.out.println(ansList);
    }


    private static void f(int ind, int[] arr, int n, List<Integer> ds, List<List<Integer>> ansList) {
        ansList.add(new ArrayList<>(ds));
        int lastpick = Integer.MAX_VALUE;
        for (int i = ind; i < n; i++) {
            if (arr[i] != lastpick) {
                ds.add(arr[i]);
                lastpick = arr[i];
                f(i + 1, arr, n, ds, ansList);
                ds.remove(ds.size() - 1);
            }
        }
    }
}
