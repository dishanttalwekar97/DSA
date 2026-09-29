import java.util.*;

public class Diameter {
    public static class Node{
        int data;
        Node left;
        Node right;

      public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int ih = height(root.left);
        int rh = height(root.right);
        return Math.max(ih, rh)+1;
    }

    public static int Diameter(Node root){
        if(root == null){
            return 0;
        }
        int leftdiam = Diameter(root.left);
        int lefthei = height( root.left);
        int rightdiam = Diameter(root.right);
        int righthei = height(root.right);

        int selfdiam = lefthei + righthei +1;
        return Math.max(selfdiam, Math.max(rightdiam, leftdiam));
    }

    static class info{
        int diam;
        int ht;

        public info(int diam,int ht){
            this.diam = diam;
            this.ht = ht;
        }
        public static info diamneter(Node root){

            if(root == null){
                return new info(0, 0);
            }
            info leftinfo = diamneter(root.left);
            info rightinfo = diamneter(root.right);

            int diam = Math.max(Math.max(leftinfo.diam ,rightinfo.diam ),leftinfo.ht + rightinfo.ht +1);
            int ht = Math.max(leftinfo.ht,rightinfo.ht)+1;

            return new info(diam, ht);
        }
    }


    //subtree of another tree


    public static boolean isIdentical(Node node,Node subRoot){
        if(node == null || subRoot == null){
            return true;
        }
        else if(node == null || subRoot == null || node.data != subRoot.data){
            return false;
        }
        if(!isIdentical(node.left, subRoot.left)){
            return false;
        }
        if(!isIdentical(node.right, subRoot.right)){
            return false;
        }
        return true;

    }

    public static boolean isSubtree(Node root,Node subRoot){
        if(root == null){
            return false;
        }
        if(root.data == subRoot.data){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }

       return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }


    //top view

    static class Info{
        Node node;
        int hd;

        public Info(Node node,int hd){
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topview(Node root){

        //level ordeer
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer,Node> map = new HashMap<>();

        int min = 0;
        int max = 0;
        q.add(new Info(root, 0));
        q.add(null);

        while(!q.isEmpty()){
            Info curr = q .remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                 if(!map.containsKey(curr.hd)){//first timr my hd is occuring
                map.put(curr.hd, curr.node);

            }
            if(curr.node.left != null)
{
    q.add(new Info(curr.node.left, curr.hd-1));
    min  = Math.min(min, curr.hd-1);
}
if(curr.node.right != null){
    q.add(new Info(curr.node.right,curr.hd+1));
    max =Math.max(max,curr.hd+1);
}
            }
           
        }

        for(int i=min;i<=max;i++){
            System.out.print(map.get(i).data+" ");
        }
        System.out.println();



    }

    //k level
    public static void Klevel(Node root,int level,int k){
        if(root == null){
            return;
        }
        if(level == k){
            System.out.print(root.data + " ");
        }
        Klevel(root.left, level+1, k);
        Klevel(root.right, level+1, k);
    }

    //lowest common ancester
    public static boolean getPath(Node root,int n,ArrayList<Node>path){
   if(root == null){
    return false;
   }
   path.add(root);
   if(root.data == n){
    return true;
   }

   boolean foundleft = getPath(root.left, n, path);
   boolean foundright = getPath(root.right, n, path);

   if(foundleft || foundright){
    return false;
   }

   path.remove(path.size()-1);
   return false;
    }

    public static Node lca(Node root,int n1,int n2){
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        //last commo0n ancester
        int i=0;
        for(;i<path1.size() && i<path2.size();i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }

        //last equal node
        Node lca = path1.get(i-1);
        return lca;

    }

    //COMMAN ENSISTER APPROACH 2
    public static Node lca2(Node root,int n1,int n2){

        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }
        Node leftlca = lca2(root.left, n1, n2);
        Node rightlca = lca2(root.right, n1, n2);

        //leftlca = val  rightlca == nu;;

        if(rightlca == null){
            return leftlca;
        }
        if(leftlca == null){
            return rightlca;
        }
        return root;
    }  





    // min distance between to node
    public static int lcaDist(Node root,int n){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }

        int leftdist = lcaDist(root.left, n);
        int rightdist = lcaDist(root.right, n);

        if(leftdist == -1 && rightdist == -1){
            return -1;
        }else if(leftdist == -1){
            return rightdist+1;
        }else{
            return leftdist+1;
        }
    }
    public static int minDist(Node root,int n1,int n2){
        Node lca = lca2(root, n1, n2);
        int dist1 = lcaDist(lca, n1);
        int dist2 = lcaDist(lca, n2);

        return dist1 + dist2;

    }

    //kTh ancestor
    public static int KthAncennsester(Node root,int n,int k1){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }

        int leftdist  = KthAncennsester(root.left, n, k1);
        int rightdist = KthAncennsester(root.right, n, k1);

        if(leftdist == -1 && rightdist == -1){
            return -1;
        }
        int max = Math.max(leftdist, rightdist);
        if(max+1 == k1){
            System.out.println(root.data);
        }
        return max+1;
    }

    //tranform to sum treee
    public static int transform(Node root){
        if(root == null){
            return  0 ;
        }
        int leftchild = transform(root.left);
        int rightchild = transform(root.right);
        int data = root.data;

        int newleft = root.left == null ? 0 : root.left.data;

        int newright = root.right == null ? 0: root.right.data;

        }
        public static void preorder(Node root){
            if(root == null){
                return;
            }
            System.out.println(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }


    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int k =3 ;


        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);


        // System.out.println(Diameter(root));
        // System.out.println(info.diamneter(root).diam);

        //subtree of another 
        // System.out.println(isSubtree(root, subRoot));

        // topview(root);
        // System.out.println();

        // Klevel(root, 1, k);

    //     int n1 = 4;
    //     int n2 = 5;
    //    System.out.println("LCA using path method: " + lca(root, n1, n2).data);
    //    System.out.println("LCA using recursive method: " + lca2(root, n1, n2).data);
    

int n1 = 4;
int n2 = 6;

System.out.println("Min distance between " + n1 + " and " + n2 + " = " + minDist(root, n1, n2));
int n = 5;
int k1 = 1;
KthAncennsester(root, n2, k1);
System.out.println();
transform(root);
preorder(root);

    }
}
