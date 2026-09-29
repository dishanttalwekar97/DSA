public class AVLTrees {
    
    // Node class for AVL Tree
    static class Node {
        int data, height;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.height = 1; // Height of a new node is 1
        }
    }

    public static Node root;

    // Get height of a node
    public static int height(Node root) {
        if (root == null) return 0;
        return root.height;
    }

    // Right rotate subtree rooted with y
    public static Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // Perform rotation
        x.right = y;
        y.left = T2;

        // Update heights
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        // Return new root
        return x;
    }

    // Left rotate subtree rooted with x
    public static Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // Perform rotation
        y.left = x;
        x.right = T2;

        // Update heights
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        // Return new root
        return y;
    }

    // Get Balance factor of node
    public static int getBalance(Node root) {
        if (root == null) return 0;
        return height(root.left) - height(root.right);
    }

    // Insert a node in AVL Tree
    public static Node insert(Node root, int key) {
        // 1. Perform the normal BST insertion
        if (root == null) return new Node(key);

        if (key < root.data)
            root.left = insert(root.left, key);
        else if (key > root.data)
            root.right = insert(root.right, key);
        else
            return root; // Duplicate keys not allowed

        // 2. Update height of this ancestor node
        root.height = 1 + Math.max(height(root.left), height(root.right));

        // 3. Get the balance factor
        int bf = getBalance(root);

        // 4. If the node is unbalanced, then fix it with rotations

        // Left Left Case
        if (bf > 1 && key < root.left.data)
            return rightRotate(root);

        // Right Right Case
        if (bf < -1 && key > root.right.data)
            return leftRotate(root);

        // Left Right Case
        if (bf > 1 && key > root.left.data) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        // Right Left Case
        if (bf < -1 && key < root.right.data) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        // Return the unchanged node pointer
        return root;
    }

    // Preorder traversal of AVL Tree
    public static void preorder(Node root) {
        if (root == null) return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);
        root = insert(root, 50);
        root = insert(root, 25);

        /*
               AVL Tree after insertions:
                     30
                    /  \
                  20    40
                 / \      \
               10  25     50
        */

        System.out.print("Preorder Traversal of AVL Tree: ");
        preorder(root); // Output should be: 30 20 10 25 40 50
    }
}

