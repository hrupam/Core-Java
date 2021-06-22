package CP;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DistinctElementsWindow {
    public static void countDistinct(int[] a, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < k; i++)
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        System.out.println(map.size());

        for (int i = k; i < a.length; i++) {
            if (map.get(a[i - k]) == 1)
                map.remove(a[i - k]);
            else
                map.put(a[i - k], map.get(a[i - k]) - 1);

            System.out.println(map.size());

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < a.length; i++)
            a[i] = sc.nextInt();
        System.out.print("Enter window size: ");
        int k = sc.nextInt();

        countDistinct(a, k);
    }
}
