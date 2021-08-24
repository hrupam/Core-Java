package Tree.traversal;

import Tree.BinaryTree;
import Tree.Node;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class LevelOrder {

    public static List<List<Integer>> bfs(Node root) {
        List<List<Integer>> wrapList = new ArrayList<>();
        if (root == null) return wrapList;
        Deque<Node> queue = new ArrayDeque<>();
        queue.offerLast(root);
        while (!queue.isEmpty()) {
            List<Integer> sublist = new ArrayList<>();
            int queueSize = queue.size();
            for (int i = 1; i <= queueSize; i++) {
                Node node = queue.pollFirst();
                if (node.left != null) queue.offerLast(node.left);
                if (node.right != null) queue.offerLast(node.right);
                sublist.add(node.data);
            }
            wrapList.add(sublist);
        }
        return wrapList;
    }

    public static void main(String[] args) {
        Node node = BinaryTree.getCompleteTree();
        List<List<Integer>> list = bfs(node);
        System.out.println(list);
    }
}
