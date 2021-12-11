package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public static void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int i = low; //go till mid
        int j = mid + 1; //go till high
        List<Integer> list = new ArrayList<>();
        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j])
                list.add(arr[i++]);
            else list.add(arr[j++]);
        }
        while (i <= mid)
            list.add(arr[i++]);
        while (j <= high)
            list.add(arr[j++]);

        for (int k = 0; k < list.size(); k++) {
            arr[low++] = list.get(k);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 9, 2, 1};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
