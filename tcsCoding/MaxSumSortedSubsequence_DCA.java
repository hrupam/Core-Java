package tcsCoding;

import java.util.ArrayList;
import java.util.List;

public class MaxSumSortedSubsequence_DCA {
    public static void main(String[] args) {
        int[] arr = {2, 202, 3, 200, 4, 5};
        System.out.println(maxSumSortedSubsequence(arr, 0, new ArrayList<>()));
    }

    private static boolean isSorted(List<Integer> list) {
        int ctr = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j + 1 < list.size(); j++) {
                if (list.get(j) > list.get(j + 1))
                    ctr++;
            }
            if (ctr == 0)
                return true;
            return false;
        }
        return false;
    }

    private static int getListSum(List<Integer> list) {
        int sum = 0;
        for (int x : list)
            sum += x;
        return sum;
    }

    public static int maxSumSortedSubsequence(int[] arr, int index, List<Integer> sublist) {

        if (index == arr.length) {
            if (isSorted(sublist))
                return getListSum(sublist);
            return Integer.MIN_VALUE;
        }
        
        sublist.add(arr[index]);
        int l = maxSumSortedSubsequence(arr, index + 1, sublist);
        sublist.remove(sublist.size() - 1);
        int r = maxSumSortedSubsequence(arr, index + 1, sublist);

        return Math.max(l, r);

    }
}
