public class imple {
    static class Node {
        Node children[] = new Node[26];
        boolean ewo = false;
        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        word = word.toLowerCase();
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.ewo = true;
    }

    public static boolean search(String key) {
        key = key.toLowerCase();
        Node curr = root;
        for (int level = 0; level < key.length(); level++) {
            int idx = key.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.ewo;
    }

    public static void main(String args[]) {
        String word[] = {"the", "a", "there", "their", "any", "thee"};
        for (int i = 0; i < word.length; i++) {
            insert(word[i]);
        }

        System.out.println(search("Their"));   // true
        System.out.println(search("Theierr")); // false
    }
}
