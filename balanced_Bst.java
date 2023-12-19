/*import java.util.*;

public class balanced_Bst {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void getInorder(Node root, ArrayList<Integer> inorder) {
        if (root == null) {
            return;
        }

        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }

    public static Node createBst(ArrayList<Integer> inorder, int st, int end) {
        if (st > end) {
            return null;
        }
        int mid = (st + end) / 2;
        Node root = new Node(inorder.get(mid));
        root.left = createBst(inorder, st, mid - 1);
        root.right = createBst(inorder, mid + 1, end);
        return root;
    }

    public static Node balanceBst(Node root) {
        ArrayList<Integer> inorder = new ArrayList<>();
        getInorder(root, inorder);

        return createBst(inorder, 0, inorder.size() - 1);
    }
    static class Info{
        boolean isBST;
        int size;
        int min;
        int max;

        public Info(boolean isBST, int size, int max){
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }
public static int maxBST = 0;

    public static Info largestBST(Node root){
        if(root == null){
            return Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        Info leftInfo = largestBST(root.left);
        Info rightInfo = largestBST(root.right);
        int size = leftInfo.size + rightInfo.size + 1 ;
        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
        int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));

        if(root.data <= leftInfo.max || root.data >= rightInfo.min ){
            return new Info(false, size, max);
        }
        if(leftInfo.isBST && rightInfo.isBST){
            maxBST = Math.max(maxBST, size);
            new Info(true, size, max);
        }
        return new Info(false, size, max);
        

    }
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);  // Fix this line

        root.right = new Node(10);  // Fix this line
        root.right.left = new Node(11);  // Fix this line
        root.right.right = new Node(12);  // Fix this line

        /*Node balancedRoot = balanceBst(root);
        preorder(balancedRoot);

        Info info = largestBST(root);
        System.out.println("largest BST size : " + maxBST);
    }
}*/

import java.util.ArrayList;

public class balanced_Bst {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void getInorder(Node root, ArrayList<Integer> inorder) {
        if (root == null) {
            return;
        }

        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }

    public static Node createBst(ArrayList<Integer> inorder, int st, int end) {
        if (st > end) {
            return null;
        }
        int mid = (st + end) / 2;
        Node root = new Node(inorder.get(mid));
        root.left = createBst(inorder, st, mid - 1);
        root.right = createBst(inorder, mid + 1, end);
        return root;
    }

    public static Node balanceBst(Node root) {
        ArrayList<Integer> inorder = new ArrayList<>();
        getInorder(root, inorder);

        return createBst(inorder, 0, inorder.size() - 1);
    }

    static class Info {
        boolean isBST;
        int size;
        int min;
        int max;

        public Info(boolean isBST, int size, int min, int max) {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }

    public static int maxBST = 0;

    public static Info largestBST(Node root) {
        if (root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        Info leftInfo = largestBST(root.left);
        Info rightInfo = largestBST(root.right);
        int size = leftInfo.size + rightInfo.size + 1;
        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
        int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));

        if (root.data <= leftInfo.max || root.data >= rightInfo.min) {
            return new Info(false, size, max, min);
        }
        if (leftInfo.isBST && rightInfo.isBST) {
            maxBST = Math.max(maxBST, size);
            return new Info(true, size, max, min);
        }
        return new Info(false, size, max, min);
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.left = new Node(9);
        root.right.right = new Node(12);

        Info info = largestBST(root);
        System.out.println("largest BST size: " + maxBST);
    }
}


