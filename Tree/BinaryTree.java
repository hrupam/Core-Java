package Tree;

public class BinaryTree {
    public static Node getCompleteTree() {
        return new Node(1, new Node(2, new Node(4), new Node(5)), new Node(3, new Node(6), new Node(7)));
    }

    public static Node getTree() {
        Node node5 = new Node(5, new Node(6), null);
        Node node2 = new Node(2, new Node(4), node5);
        Node node8 = new Node(8, new Node(9), new Node(10));

        Node node3 = new Node(3, new Node(7), node8);

        Node root = new Node(1, node2, node3);

        return root;
    }

    public static Node getUnbalancedTree() {
        Node node3 = new Node(3, new Node(5, new Node(7), new Node(6)), new Node(4));
        Node node1 = new Node(1, node3, new Node(2));
        return node1;
    }
}
