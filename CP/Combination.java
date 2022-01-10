package CP;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Combination {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int r = 3;
        List<List<Integer>> list = new LinkedList<>();
        combination(arr, 0, r, new ArrayList<>(), list);
        System.out.println(list);
    }

    public static void combination(int[] arr, int index, int r, List<Integer> sublist, List<List<Integer>> list) {
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
}
