package Tree;

public class Height {
    public static int height(Node node) {
        if (node == null) return 0;
        int lh = height(node.left);
        int rh = height(node.right);
        return 1 + Math.max(lh, rh);
    }

    public static boolean isBalanced(Node root) {
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

    public static int diameter(Node node) {
        final int[] maxi = {0};
        class FindMax {
            int findMax(Node root) {
                if (root == null) return 0;
                int lh = findMax(root.left);
                int rh = findMax(root.right);
                maxi[0] = Math.max(maxi[0], lh + rh);
                return 1 + Math.max(lh, rh);
            }
        }
        new FindMax().findMax(node);
        return maxi[0];
    }


    public static void main(String[] args) {
        System.out.println("Height = " + height(BinaryTree.getTree()));
        System.out.println("Balanced ? " + isBalanced(BinaryTree.getUnbalancedTree()));
        System.out.println("Diameter = " + diameter(BinaryTree.getUnbalancedTree()));
    }
}
