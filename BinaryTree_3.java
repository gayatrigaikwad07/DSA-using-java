import java.util.*;

public class BinaryTree_3 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static boolean getPath(Node root, int n, AbstractList<Node> path) {
            if (root == null) {
                return false;
            }
            path.add(root);

            if (root.data == n) {
                return true;
            }
            boolean foundLeft = getPath(root.left, n, path);
            boolean foundRight = getPath(root.right, n, path);

            if (foundLeft || foundRight) {
                return true;
            }
            path.remove(path.size() - 1);
            return false;
        }

        public static Node lca(Node root, int n1, int n2) {
            ArrayList<Node> path1 = new ArrayList<>();
            ArrayList<Node> path2 = new ArrayList<>();

            getPath(root, n1, path1);
            getPath(root, n2, path2);

            // Find the last common ancestor
            int i = 0;
            for (i = 0; i < path1.size() && i < path2.size(); i++) {
                if (path1.get(i) != path2.get(i)) {
                    break;
                }
            }
            // The last equal node is the Lowest Common Ancestor (LCA)
            Node lca = path1.get(i - 1);
            return lca;
        }
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 3, 4, 5, 6, 7};
        Node root = BinaryTree.buildTree(nodes);
        int n1 = 4, n2 = 5;
        System.out.println(BinaryTree.lca(root, n1, n2).data);
    }
}
