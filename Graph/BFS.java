package Graph;

import Graph.util.GraphGenerator;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class BFS {
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
        List<Integer> bfsList = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            if (!vis[i]) bfs(i, vis, bfsList, adj);
        }
        System.out.println(bfsList);
    }

    private static void bfs(int i, boolean[] isVis, List<Integer> bfsList, List<List<Integer>> adjList) {

        Deque<Integer> queue = new ArrayDeque<>();
        queue.offerLast(i);
        isVis[i] = true;
        while (!queue.isEmpty()) {
            int node = queue.pollFirst();
            bfsList.add(node);

            for (Integer j : adjList.get(node)) {
                if (!isVis[j]) {
                    isVis[j] = true;
                    queue.offerLast(j);
                }
            }

        }
    }
}
