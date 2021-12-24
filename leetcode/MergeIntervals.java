package leetcode;

import utility.ArrayUtil;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MergeIntervals {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 3},
                {2, 6},
                {8, 10},
                {8, 9},
                {9, 11},
                {15, 18},
                {2, 4},
                {16, 17}
        };

        int[][] result = merge(arr);

        System.out.println(ArrayUtil.to2DList(result));
    }

    public static int[][] merge(int[][] intervals) {
        List<List<Integer>> list = new LinkedList<>();
        for (int i = 0; i < intervals.length; i++) {
            list.add(new ArrayList<>(List.of(intervals[i][0], intervals[i][1])));
        }

        list.sort((o1, o2) -> o1.get(0) - o2.get(0));

        List<List<Integer>> resultList = new ArrayList<>();

        List<Integer> tempList = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            List<Integer> listToCompare = list.get(i);
            if (listToCompare.get(0) <= tempList.get(1)) {
                // tempList.set(0,Math.min(tempList.get(0),tempList.get(0)));
                tempList.set(1, Math.max(tempList.get(1), listToCompare.get(1)));
                continue;
            } else {
                resultList.add(tempList);
                tempList = listToCompare;
            }

        }
        resultList.add(tempList);


        int[][] arr = new int[resultList.size()][2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 2; j++)
                arr[i][j] = resultList.get(i).get(j);
        }
        return arr;
    }
}
