import java.util.*;

public class Builbst{

    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    //build bst

    public static Node Insert(Node root,int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            //left subtree
            root.left = Insert(root.left, val);
        }else{
            //right subtree
            root.right = Insert(root.right, val);
        }
        return root;

    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }


    //Search in key
    public static boolean Search(Node root,int key){
        if(root == null){
            return false;
        }

        if(root.data == key){
            return true;
        }

        if(root.data > key){
            return Search(root.left, key);
        }else{
            return Search(root.right, key);
        }
    
    }


    //Deolete a node
    public static Node Delete(Node root,int val){
        if(root.data < val){
            root.right = Delete(root.right, val);
        }else if(root.data > val){
            root.left = Delete(root.left, val);
         }

         else{
            //case:1 leaf Node
            if(root.left == null && root.right == null){
                return null;
            }

            //case 2 : singal child
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }

            //case 3 : both childern
            Node IS = findInordeerSuccesser(root.right);
            root.data = IS.data;
            root.right = Delete(root.right, IS.data);

         }
         return root;

    }
    public static Node findInordeerSuccesser(Node root){
        while(root.left != null){
            root = root.left;

        }
        return root;
    }

    // Print inRange
    public static void printInRange(Node root,int k1,int k2){
        if(root == null){
           return;
        }

        if(root.data >= k1 && root.data <=k2){
           printInRange(root.left,k1,k2);
           System.out.print(root.data + " ");
           printInRange(root.right, k1, k2);
        }else if(root.data < k1){
            printInRange(root.left, k1, k2);
        }else{
            printInRange(root.right, k1, k2);
        }
    }


    // root to path
    public static void Printpath(ArrayList<Integer> path){
        for(int i=0; i<path.size();i++){
            System.out.print(path.get(i)+ "->");
        }
        System.out.println("null");
    }
    public static void Root2Path(Node root,ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right ==null) {
            Printpath(path);
        }
        Root2Path(root.left, path);
        Root2Path(root.right, path);
        path.remove(path.size()-1);


    }
    public static void main(String args[]){
        int values[] = {5,1,3,4,2,7};
        Node root = null;

        for(int i=0;i<values.length;i++){
            root = Insert(root, values[i]);

        }
        System.out.print("Buld three is = ");
        inorder(root);
        System.out.println();

        //Search key
        System.out.print("Search key found or not = ");
        if(Search(root, 17)){
            System.out.println("found");
        }else{
            System.out.println("Not found");
        }


        //delete a node
        root  = Delete(root, 1);
        System.out.print("Delete Noce 1 = ");
        inorder(root);
        System.out.println();

        // Print in Range
        System.out.print("print in range 5 to 12  = " );
         printInRange(root, 5, 12);
         System.out.println();

         //root to path
         System.out.print("root to path = ");
         Root2Path(root, new ArrayList<>());


    }
    
}