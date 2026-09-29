public class ValidBST {
   public static class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
    }
   } 

   public static boolean isValid(Node root,Node min,Node max){
    if(root == null){
        return true;
    }
    if(min != null && root.data <= min.data){
        return false;
    }else if(max != null && root.data >= max.data){
        return false;
    }
    return isValid(root.left, min, root) &&
           isValid(root.right, root, max);
   }
   public static void main(String args[]){
    int values[] = {1,1,1};
    if(isValid(root, null, null)){
        System.out.println("valid ");
    }else{
        System.out.println("not valid ");
    }

   }
}
