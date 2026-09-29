import java.util.*;

public class implementation{

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
    static class Binarytree{
        static int idx =-1;

        public static Node Buildtree(int Nodes[]){
            idx++;
            if(Nodes[idx] == -1){
                return null;
            }
            Node newNode =new Node(Nodes[idx]);
            newNode.left = Buildtree(Nodes);
            newNode.right = Buildtree(Nodes);

            return newNode;
        }
        public static void Preeorder(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data + " ");
            Preeorder(root.left);
            Preeorder(root.right);

        }

        public static void Inorder(Node root){

            if(root == null){
                return;
            }
            Inorder(root.left);
            System.out.print(root.data + " ");
            Inorder(root.right);
        }

        public static void Postorder(Node root){
            if(root == null){
                return;
            }
            Postorder(root.left);
            Postorder(root.right);
            System.out.print(root.data + " ");
        }


        //level oreder travaersal
        public static void LeelOrder(Node root){
            if(root == null){
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);

                    }

                }else{
                    System.out.println(currNode.data+" ");
                    if(currNode.left == null){
                        q.add(currNode.left);
                    }
                    if(currNode.right == null){
                        q.add(currNode.right);
                    }
                }
            }
        }

        public static int height(Node root){
            if(root == null){
                return 0;
            }

            int lh = height(root.left);
            int rh = height(root.right);

            return Math.max(lh, rh)+1;
        }

        public static int Count(Node root){
            if(root == null){
                return 0;
            }
            int lcount  = Count(root.left);
            int rcount = Count(root.right);
            return lcount + rcount +1;
        }

        public static int Sum(Node root){
            if(root == null){
                return 0;
            }

           int leftsum = Sum(root.left);
           int rightsum = Sum(root.right);
           return leftsum + rightsum + root.data;
        }

        

    }
    public static void main(String args[]){
        // int Nodes[] ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        // Binarytree tree  = new Binarytree();
        // Node root = tree.Buildtree(Nodes);

        // System.out.println(root.data); // root
        // tree.Preeorder(root);

        
        // System.out.println();
        // tree.Inorder(root);
        
        // System.out.println();
        // tree.Postorder(root);
        
        // System.out.println();
        // tree.LeelOrder(root);


        //for hright
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left= new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("height of tree = "+Binarytree.height(root));
        System.out.println("count node in trree = "+ Binarytree.height(root));
        System.out.println("sum of Node = "+ Binarytree.Sum(root));





        
    }
}