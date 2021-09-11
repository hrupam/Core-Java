package ArrayOps;

import java.util.HashMap;
import java.util.Map;

public class Mode {
    public static int mode(int[] a) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : a)
            map.put(x, map.getOrDefault(x, 0) + 1);
        Map.Entry<Integer, Integer> max = map.entrySet().iterator().next();
        for (Map.Entry<Integer, Integer> entry : map.entrySet())
            if (entry.getValue() > max.getValue())
                max = entry;

        return max.getKey();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 5, 5, 4, 9};
        System.out.println(mode(arr));
    }
}
