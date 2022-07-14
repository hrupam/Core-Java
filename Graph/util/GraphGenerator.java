package Graph.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GraphGenerator {
    public static List<List<Integer>> generateAdjacencyList(int V, int E, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= V; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < E; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        for (List<Integer> list : adj) Collections.sort(list);
        return adj;
    }
}
