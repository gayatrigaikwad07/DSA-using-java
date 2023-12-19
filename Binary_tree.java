/*import java.util.*;
public class Binary_tree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        } 
        
        // Pre order Code


        public static void preOrder(Node root) {
            if(root == null){
                return ;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);

        }

        // In Order

        public static void inOrder(Node root) {
            if(root == null){
                return;
            }
            inOrder(root.left);
            System.out.print(root.data  + " ");
            inOrder(root.right);
            
        }

        // Post Order

        public static void postOrder(Node root) {
            if(root == null){
                return ;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data  + " ");
            
        }

         // BFS i.e level up

    public static void levelOrder(Node root ) {
        if(root ==  null){
            return ;
        }

        Queue<Node> q = new LinkedList();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break ;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data + " ");
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
               }
            }
        }



    }
    public static void main(String[] args) {
        int nodes [] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);

        tree.levelOrder(root);

    }
    }

    // height of tree

    static class Node {
        int data;
        Node left , right ;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root) {
        if( root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh ,rh) + 1;
    }

    public static int count(Node root) {
        if(root == null){
            return 0 ;
        }

        int leftCount = count(root.left);
        int rightCount = count(root.right);
        return leftCount + rightCount + 1;
        
    }

    public static int sum(Node root) {
        if(root == null){
            return 0;
        }
        int leftsum = sum(root.left);
        int rightsum = sum(root.right);
        return leftsum + rightsum + root.data;
        
    }

    // Diameter of a Tree

    public static int diameter2(Node root){
        if(root == null){
            return 0;
        }

        int leftDiam = diameter2(root.left);
        int leftHt = height(root.left);
        int rightDiam = diameter2(root.right);
        int rightHt = height(root.right);

        int selfDiam = leftHt = rightHt + 1;
        return Math.max(selfDiam , Math.max(leftDiam , rightDiam));
    }
    static class Info{
        int diam;
        int ht;

        public  Info(int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info diameter(Node root){
        if(root == null){
            return new Info(0, 0);
        }

        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int diam =Math.max( Math.max(leftInfo.diam, rightInfo.diam) , leftInfo.ht + rightInfo.ht + 1 );
        int ht = Math.max(leftInfo.ht , rightInfo.ht) + 1;

       return new Info(diam, ht);
    }

    /// SubTRee

    public static boolean isIdentical(Node node, Node subRoot) {
        if(node == null && subRoot == null){
            return true;
        }else if(node == null || subRoot == null){
            return false;
        }
        if(!isIdentical(node.left, subRoot.left)){
            return false;
        }
        if(!isIdentical(node.right, subRoot.right)){
            return false ;
        }
        return true;
        
    }



    public static boolean isSubtree(Node root, Node subRoot) {
        if(root == null){
            return false ;
        }

        if(root.data == subRoot .data){
            if(isIdentical(root, subRoot)){
                return true;
            }
        }

        boolean leftAns = isSubtree(root.left, subRoot);
        boolean rightAns = isSubtree(root, subRoot);

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
       
    }

    // ttttop view of tree
    static class Info {
        Node node;
        int hd ;

        public Info(Node node, int hd){
            this.node = node;
            this.hp = hp ;
        }
    }

    public static void topView(Node root){
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0, max = 0;
        q.add(new Info(root, 0));
        q.add(null);

        while(!q.isEmpty()){
            Info curr = q.remove();
            if(curr == null){
                break;
            }else{
                q.add(null);
            }
        }


    }

    public static void KLevel(Node root, int level, int k){
        if(root ==  null){
            return;
        }
        if(level == k){
            System.out.print(root.data + " ");
            return ;
        }
        KLevel(root.left, level+1, k);
        KLevel(root.right, level+1, k);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);


        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        //subRoot.right = new Node(5);

        //System.out.println(height(root));
        //System.out.println(count(root));
        //System.out.println(sum(root));
        //System.out.println(diameter(root).diam);
        //System.out.println(diameter(root).ht);
        //System.out.println(isIdentical(root, root));

        int k =2;
        KLevel(root, 2, k);
        
    }

}*/
import java.util.*;

public class Binary_tree {
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

        public static void preOrder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        public static void inOrder(Node root) {
            if (root == null) {
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

        public static void postOrder(Node root) {
            if (root == null) {
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }

        public static void levelOrder(Node root) {
            if (root == null) {
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }

    public static int count(Node root) {
        if (root == null) {
            return 0;
        }

        int leftCount = count(root.left);
        int rightCount = count(root.right);
        return leftCount + rightCount + 1;
    }

    public static int sum(Node root) {
        if (root == null) {
            return 0;
        }
        int leftSum = sum(root.left);
        int rightSum = sum(root.right);
        return leftSum + rightSum + root.data;
    }

    public static Info diameter(Node root) {
        if (root == null) {
            return new Info(0, 0);
        }

        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        return new Info(diam, ht);
    }

    public static boolean isIdentical(Node node, Node subRoot) {
        if (node == null && subRoot == null) {
            return true;
        } else if (node == null || subRoot == null) {
            return false;
        }
        if (!isIdentical(node.left, subRoot.left)) {
            return false;
        }
        if (!isIdentical(node.right, subRoot.right)) {
            return false;
        }
        return true;
    }

    public static boolean isSubtree(Node root, Node subRoot) {
        if (root == null) {
            return false;
        }

        if (root.data == subRoot.data) {
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }

        boolean leftAns = isSubtree(root.left, subRoot);
        boolean rightAns = isSubtree(root.right, subRoot);

        return leftAns || rightAns;
    }

    public static void KLevel(Node root, int level, int k) {
        if (root == null) {
            return;
        }
        if (level == k) {
            System.out.print(root.data + " ");
            return;
        }
        KLevel(root.left, level + 1, k);
        KLevel(root.right, level + 1, k);
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);

        tree.levelOrder(root);

        int k = 2;
        KLevel(root, 2, k);
    }
}

   
  
