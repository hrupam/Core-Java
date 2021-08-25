package Tree.traversal.recursive;

import Tree.BinaryTree;
import Tree.Node;

public class Dfs {
    public static void preOrder(Node node) {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void inOrder(Node node) {
        if (node == null)
            return;
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    public static void postOrder(Node node) {
        if (node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        Node node = BinaryTree.getTree();
        System.out.print("Pre-order - ");
        Dfs.preOrder(node);
        System.out.println();
        System.out.print("In-order - ");
        Dfs.inOrder(node);
        System.out.println();
        System.out.print("Post-order - ");
        Dfs.postOrder(node);
    }
}
