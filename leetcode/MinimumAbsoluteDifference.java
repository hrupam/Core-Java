package leetcode;

import utility.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {

    public static void main(String[] args) {
        int[] arr = ArrayUtil.getGiantIntegerArray();
        List<List<Integer>> list = minimumAbsDifference(arr);
        System.out.println(list);
    }


    private static int getMinDiff(int[] arr) {
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i + 1 < arr.length; i++) {
            minDiff = Math.min(arr[i + 1] - arr[i], minDiff);
        }
        return minDiff;
    }

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> wrappedList = new ArrayList<>();


        Arrays.parallelSort(arr);

        int minDiff = getMinDiff(arr);

        for (int i = 0; i + 1 < arr.length; i++) {
            int diff = arr[i + 1] - arr[i];
            if (diff == minDiff)
                wrappedList.add(List.of(arr[i], arr[i + 1]));

        }

        return wrappedList;
    }
}
