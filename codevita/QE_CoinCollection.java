package codevita;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class QE_CoinCollection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] g = new char[n][n];
        boolean[][] isVisited = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            String r = sc.next().trim();
            for (int j = 0; j < n; j++) {
                char c = r.charAt(j);
                g[i][j] = c;
                if (c == 'N') isVisited[i][j] = true;
                else isVisited[i][j] = false;
            }
        }

        List<Integer> listOfNumbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!isVisited[i][j]) {
                    int res = f(i, j, isVisited, n);
                    listOfNumbers.add(res + 1);

                }
            }
        }

        Collections.sort(listOfNumbers, (a, b) -> b - a);
        int A = 0;
        int B = 0;
        for (int i = 0; i < listOfNumbers.size(); i = i + 2)
            A += listOfNumbers.get(i);
        for (int i = 1; i < listOfNumbers.size(); i = i + 2)
            B += listOfNumbers.get(i);

        System.out.println(A + " " + B);

    }

    private static int f(int i, int j, boolean[][] isVisited, int n) {


        isVisited[i][j] = true;

        //up
        int u = 0;
        if (i - 1 >= 0 && !isVisited[i - 1][j])
            u = 1 + f(i - 1, j, isVisited, n);

        //down
        int d = 0;
        if (i + 1 < n && !isVisited[i + 1][j])
            d = 1 + f(i + 1, j, isVisited, n);

        //right
        int r = 0;
        if (j + 1 < n && !isVisited[i][j + 1])
            r = 1 + f(i, j + 1, isVisited, n);

        //left
        int l = 0;
        if (j - 1 >= 0 && !isVisited[i][j - 1])
            l = 1 + f(i, j - 1, isVisited, n);


        return u + d + l + r;
    }
}
