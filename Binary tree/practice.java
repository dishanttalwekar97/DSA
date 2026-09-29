import java.util.*;

public class practice {
    static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Binarytree {
        static int idx = -1;

        public static Node Buildtree(int[] nodes) {
            idx++;
            // base case
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = Buildtree(nodes);
            newNode.right = Buildtree(nodes);
            return newNode;
        }

        public static void Preorder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            Preorder(root.left);
            Preorder(root.right);
        }

        public static void Postorder(Node root){
            if(root == null){
                return;
            }
            Postorder(root.left);
            Postorder(root.right);
            System.out.print(root.data);
        }

        public static void Inorder(Node root){
            if(root == null){
                return;
            }
            Inorder(root.left);
            System.out.print(root.data+ " ");
            Inorder(root.right);
        }
    }

    public static boolean isIdentical(Node node,Node subtree){
        if(node == null || subtree == null){
            return true;
        }
        else if(node == null || subtree == null || node.data != subtree.data){
            return false;
        }
        if(!isIdentical(node.left, subtree.left)){
            return false;
        }
        if(!isIdentical(node.right, subtree.right)){
            return false;
        }

        return true;
        
    }

    public static boolean isSubtree(Node root,Node subtree){
        if(root == null){
            return false;
        }
        if(root.data == subtree.data){
            if(isIdentical(root,subtree)){

                return true;
            }
        }

        return isSubtree(root.left, subtree.left) || isSubtree(root.right, subtree.right);
    }

    public static void main(String args[]) {
        // int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        // Binarytree tree = new Binarytree();
        // Node root = tree.Buildtree(nodes);

        // System.out.println("Root Node: " + root.data); // root
        // System.out.print("Preorder Traversal: ");
        // tree.Preorder(root);
        // System.out.println();
        
        // System.out.print("postorder Traversal: ");
        // tree.Postorder(root);

        // System.out.print("postorder Traversal: ");
        // tree.Inorder(root);

          Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);


        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);


        // System.out.println(Diameter(root));
        // System.out.println(info.diamneter(root).diam);

        //subtree of another 
        System.out.println(isSubtree(root, subRoot));

    }
}
