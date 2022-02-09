package tcsCoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SlideRange {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int k = 3;
        System.out.println(Arrays.toString(slide(arr, k)));

    }

    public static int[] slide(int[] arr, int k) {
        int[] p = Arrays.copyOfRange(arr, 0, k);
        int[] q = Arrays.copyOfRange(arr, k, arr.length);

        List<Integer> list = new ArrayList<>();
        for (int x : q)
            list.add(x);
        for (int x : p)
            list.add(x);

        return list.stream().mapToInt(i -> i).toArray();

    }
}
