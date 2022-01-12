package CP;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Combination {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int r = 2;
        List<List<Integer>> list = new LinkedList<>();
        combination(arr, 0, r, new ArrayList<>(), list);
        System.out.println(list);

        System.out.println(countSubsequenceSumK(arr, 0, 3, 0));
    }

    public static void combination(int[] arr, int index, int r, List<Integer> sublist, List<List<Integer>> list) {
        if (sublist.size() > r) return;
        if (index == arr.length) {
            if (sublist.size() == r)
                list.add(new ArrayList<>(sublist));
            return;
        }

        sublist.add(arr[index]);
        combination(arr, index + 1, r, sublist, list);
        sublist.remove(sublist.size() - 1);
        combination(arr, index + 1, r, sublist, list);

    }

    public static int countSubsequenceSumK(int[] arr, int index, int k, int sum) {
        if (index == arr.length) {
            if (sum == k) return 1;
            return 0;
        }
        int l = countSubsequenceSumK(arr, index + 1, k, sum + arr[index]);
        int r = countSubsequenceSumK(arr, index + 1, k, sum);

        return l + r;
    }
}
