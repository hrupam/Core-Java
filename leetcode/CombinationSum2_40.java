package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum2_40 {
    private static void f(int ind, int target, int[] arr, List<Integer> ds, List<List<Integer>> ansList) {
        if (target == 0) {
            ansList.add(new ArrayList<>(ds));
            return;
        }

        int lastpick = (int) 1e9;
        for (int i = ind; i < arr.length; i++) {
            if (lastpick != arr[i] && arr[i] <= target) {
                ds.add(arr[i]);
                lastpick = arr[i];
                f(i + 1, target - arr[i], arr, ds, ansList);
                ds.remove(ds.size() - 1);
            }
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ansList = new LinkedList<>();
        f(0, target, candidates, new ArrayList<>(), ansList);
        return ansList;
    }
}
