package leetcode;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum_39 {
    private static void f(int i, int target, int[] arr, List<Integer> ds, List<List<Integer>> ansList, int n) {
        if (target == 0) {
            ansList.add(new ArrayList<>(ds));
            return;
        }
        if (i == n - 1) {

            if (target % arr[n - 1] == 0) {
                int t = target / arr[n - 1];
                List<Integer> l = new ArrayList<>(ds);
                while (t-- != 0) l.add(arr[n - 1]);
                ansList.add(new ArrayList<>(l));


            }
            return;
        }


        //pick
        if (arr[i] <= target) {
            ds.add(arr[i]);
            f(i, target - arr[i], arr, ds, ansList, n);
            ds.remove(ds.size() - 1);
        }

        //not pick
        f(i + 1, target, arr, ds, ansList, n);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ansList = new ArrayList<>();
        f(0, target, candidates, new ArrayList<>(), ansList, candidates.length);
        return ansList;
    }
}
