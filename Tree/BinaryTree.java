package Tree;

public class BinaryTree {
    public static Node getTree() {
        Node root = new Node(1);
        Node node5 = new Node(5);
        node5.left = new Node(6);
        Node node2 = new Node(2);
        node2.left = new Node(4);
        node2.right = node5;
        root.left = node2;
        Node node8 = new Node(8);
        node8.left = new Node(9);
        node8.right = new Node(10);
        Node node3 = new Node(3);
        node3.left = new Node(7);
        node3.right = node8;
        root.right = node3;

        return root;
    }
}
