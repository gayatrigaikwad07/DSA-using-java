public class bal_Bst {
    

    
        static class Node {
            int data;
            Node left;
            Node right;
    
            public Node(int data) {
                this.data = data;
                this.left = this.right = null;
            }
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
            int size = 1 + leftInfo.size + rightInfo.size;
            int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
            int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));
    
            if (root.data > leftInfo.max && root.data < rightInfo.min && leftInfo.isBST && rightInfo.isBST) {
                maxBST = Math.max(maxBST, size);
                return new Info(true, size, min, max);
            }
            return new Info(false, size, min, max);
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
    
    

