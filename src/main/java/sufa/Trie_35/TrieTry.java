package sufa.Trie_35;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2018-12-29 13:31
 * @Vertion 1.0
 **/
public class TrieTry {

    private TrieNode root = new TrieNode('/');

    public void insert(char[] text){
        TrieNode p = root;
        for(int i = 0; i < text.length; i ++){
            int index = text[i] - 'a';
            if(p.children[index] == null){
                TrieNode newNode = new TrieNode(text[i]);
                p.children[index] = newNode;
            }
            p = p.children[index];
        }
        p.isCharEnd = true;
    }

    public boolean find(char[] pattern){
        TrieNode p = root;
        for(int i = 0; i< pattern.length; i++){
            int index = pattern[i] - 'a';
            if(p.children[index] == null){
                return false;
            }
            p = p.children[index];
            if(p.isCharEnd == false) return false;
            else return true;
        }

        return false;
    }

    public class TrieNode{
        public char data;
        public TrieNode[] children = new TrieNode[26];
        public boolean isCharEnd = false;
        public TrieNode(char data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        String s = "ab";
        TrieTry trieTry = new TrieTry();
        trieTry.insert(s.toCharArray());
    }
}
