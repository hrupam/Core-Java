package Graph;

import Graph.util.GraphGenerator;

import java.util.LinkedList;
import java.util.List;

public class DFS {
    public static void main(String[] args) {
        int n = 7;
        int e = 6;
        int[][] edges = {
                {1, 2},
                {2, 4},
                {2, 7},
                {7, 6},
                {4, 6},
                {3, 5}
        };


        final List<List<Integer>> adj = GraphGenerator.generateAdjacencyList(n, e, edges);

        boolean[] vis = new boolean[n + 1];
        List<Integer> dfsList = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            if (!vis[i]) dfs(i, vis, adj, dfsList);
        }
        System.out.println(dfsList);
    }

    private static void dfs(int i, boolean[] vis, List<List<Integer>> adj, List<Integer> dfsList) {
        if (vis[i]) return;
        dfsList.add(i);
        vis[i] = true;
        for (var j : adj.get(i)) {
            if (!vis[j]) dfs(j, vis, adj, dfsList);
        }
    }
}
