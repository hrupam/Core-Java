package Tree;

public class Height {
    public static int height(Node node) {
        if (node == null) return 0;
        int lh = height(node.left);
        int rh = height(node.right);
        return 1 + Math.max(lh, rh);
    }

    public static boolean checkBalanced(Node root) {
        class Check {
            int check(Node node) {
                if (node == null) return 0;
                int lh = check(node.left);
                int rh = check(node.right);
                if (Math.abs(lh - rh) > 1) return -1;
                return 1 + Math.max(lh, rh);
            }

        }
        if (new Check().check(root) == -1) return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Height = " + height(BinaryTree.getTree()));
        System.out.println("Balanced ? " + checkBalanced(BinaryTree.getUnbalancedTree()));
    }
}
