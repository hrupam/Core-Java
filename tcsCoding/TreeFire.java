package tcsCoding;

public class TreeFire {
    public static void main(String[] args) {
        int[][] d = {
                {-1, 0},
                {-1, 1},
                {0, 1},
                {1, 1},
                {1, 0},
                {1, -1},
                {0, -1},
                {-1, -1}
        };

//        char[][] forest = {{'W', 'T', 'T'},
//                {'T', 'W', 'W'},
//                {'W', 'T', 'T'}
//        };

        char[][] forest = {
                {'W', 'T', 'T', 'T', 'T', 'T'},
                {'T', 'W', 'W', 'W', 'W', 'W'},
                {'W', 'T', 'T', 'T', 'T', 'T'},
                {'W', 'W', 'W', 'W', 'W', 'T'},
                {'T', 'T', 'T', 'T', 'T', 'T'},
                {'T', 'W', 'W', 'W', 'W', 'W'}
        };

        boolean[][] isFired = new boolean[forest.length][forest[0].length];
        for (int i = 0; i < forest.length; i++) {
            for (int j = 0; j < forest[0].length; j++) {
                if (forest[i][j] == 'W') isFired[i][j] = true;
                else isFired[i][j] = false;
            }
        }

        System.out.println(f(0, 5, d, 6, 6, isFired, 1));
    }

    private static boolean isAllFired(boolean[][] isFired) {
        for (var x : isFired) {
            for (var k : x) {
                if (k == false) return false;
            }
        }
        return true;
    }

    private static int f(int i, int j, int[][] deviations, int m, int n, boolean[][] isFired, int time) {
        if (isAllFired(isFired)) {
            return time;
        }

        int min = Integer.MAX_VALUE;
        for (int[] dir : deviations) {
            int k = i + dir[0];
            int l = j + dir[1];
            if (k >= 0 && l < n && k < m && l >= 0 && !isFired[k][l]) {
                isFired[i][j] = true;
                isFired[k][l] = true;
                min = Math.min(f(k, l, deviations, m, n, isFired, time + 1), min);
                isFired[i][j] = false;
                isFired[k][l] = false;
            }
        }

        return min;

    }
}
