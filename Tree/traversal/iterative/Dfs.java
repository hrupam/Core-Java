package Tree.traversal.iterative;

import Tree.BinaryTree;
import Tree.Node;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Dfs {
    public static List<Integer> preOrder(Node root) {
        List<Integer> preOrder = new ArrayList<>();
        if (root == null) return preOrder;
        Deque<Node> stack = new ArrayDeque<>();
        stack.offerFirst(root);

        while (!stack.isEmpty()) {
            Node node = stack.pollFirst();
            preOrder.add(node.data);
            if (node.right != null) stack.offerFirst(node.right);
            if (node.left != null) stack.offerFirst(node.left);
        }
        return preOrder;
    }

    public static void main(String[] args) {
        Node node = BinaryTree.getTree();
        System.out.print("Pre-order - " + preOrder(node));

    }
}
