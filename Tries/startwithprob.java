public class startwithprob {
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

    public static boolean Startwith(String prefix){
        Node curr =root;
        for(int i=0;i<prefix.length();i++){
            int idx = prefix.charAt(i) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }
    public static void main(String args[]){
        String word[] = {"apple","app","amngo","man","woman"};
        String prefix = "app";
        String prefix2 = "moon";

        for(int i=0;i<word.length;i++){
            Insert(word[i]);
        }
        System.out.println(Search(prefix));
        System.out.println(Search(prefix2));

    }
}
