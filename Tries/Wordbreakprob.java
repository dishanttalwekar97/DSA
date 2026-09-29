public class Wordbreakprob {
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
    public static boolean Wordbreak(String key){
        if(key.length() == 0){
            return true;
        }
        for(int i=1;i<=key.length();i++){
            if(Search(key.substring( 0 ,i)) &&
            Wordbreak(key.substring(i)) ){
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]){
        String word[] = {"i","like","sam","samsung","mobile"};
        for (int i = 0; i < word.length; i++) {
            Insert(word[i]);
        }
    System.out.println(Search("ilike"));   // true
        System.out.println(Search("Theierr")); // falsS
    
    }

    }

