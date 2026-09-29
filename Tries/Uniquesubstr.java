import java.net.SocketPermission;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Uniquesubstr {
    static class Node{
        Node children[] = new Node[26];
        boolean ewo = false;

        public Node(){
            for(int i=0;i<26;i++){
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();

    public static void Insert(String word){
        word = word.toLowerCase();
        Node curr = root;
        for(int level = 0;level < word.length();level++){
            int idx = word.charAt(level) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.ewo = true;
    }

    public static boolean Search(String key){
        key = key.toLowerCase();
        Node curr = root;
        for(int level = 0; level <key.length();level++){
            int idx = key.charAt(level) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }

        return curr.ewo;

    }

    public static int countNode(Node root){
        if(root == null){
            return 0;
        }
        int count = 0;
        for(int i=0;i<26;i++){
            if(root.children[i] != null){
                count += countNode(root.children[i]);

            }
        }
        return count+1;

    }
    public static void main(String args[]){
        String str = "apple";
        String str2 = "ababa";

        //suffix
        for(int i=0;i<str.length();i++){
            String suffix = str2.substring(i);
            Insert(suffix);
        }
        System.out.println(countNode(root));
    }
}
