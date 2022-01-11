import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class VanEck {

    private static int[] getVanEckSequence(int n) {
        if (n == 1) return new int[]{0};
        int[] arr = new int[n + 1];
        arr[0] = arr[1] = 0;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i + 1 < arr.length; i++) {
            if (!map.containsKey(arr[i]))
                arr[i + 1] = 0;
            else
                arr[i + 1] = i - map.get(arr[i]);

            map.put(arr[i], i);
        }

        return Arrays.copyOfRange(arr, 1, arr.length);
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(getVanEckSequence(20)));
    }
}
