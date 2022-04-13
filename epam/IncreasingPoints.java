package epam;

import java.util.Arrays;

public class IncreasingPoints {

    public static void main(String[] args) {
        int startx = 3;
        int starty = 3;
        int[][] arr = {
                {2, 4},
                {8, 7},
                {5, 6},
                {8, 6}
        };

        int[][] clonedArr = arr.clone();

        Arrays.sort(arr, (int[] x, int[] y) -> {
            if (x[0] < y[0]) return -1;
            else if (x[0] > y[0]) return 1;
            else {
                if (x[1] < y[1]) return -1;
                else if (x[1] > y[1]) return 1;
            }
            return 0;
        });

        int maxPathLen = f(startx, starty, arr);

        String[] pathtrace = new String[1];
        getPath(startx, starty, clonedArr, maxPathLen, "", pathtrace);

        System.out.println(maxPathLen);
        System.out.println(pathtrace[0].trim());

    }

    private static int f(int sx, int sy, int[][] arr) {
        int maxi = 0;
        for (int[] point : arr) {
            int dx = point[0];
            int dy = point[1];
            if (dx > sx && dy > sy)
                maxi = Math.max(maxi, 1 + f(dx, dy, arr));
        }
        return maxi;
    }

    private static void getPath(int sx, int sy, int[][] arr, int len, String path, String[] pathTrace) {
        if (len == 0) pathTrace[0] = path;

        for (int i = 0; i < arr.length; i++) {
            int[] point = arr[i];
            int dx = point[0];
            int dy = point[1];
            if (dx > sx && dy > sy) getPath(dx, dy, arr, len - 1, path + (i + 1) + " ", pathTrace);
        }
    }
}
