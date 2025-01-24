package coding22;

import java.util.HashMap;

public class Trie_Contacts {

	public class node {
		char data;
		HashMap<Character, node> child = new HashMap<>();
		boolean isTer; 
		int count=1;
	}
	private node root;
	public Trie_Contacts() {
		node nn = new node();
		nn.data= '*';
		root = nn;
	}
    public void insert(String word) {
    	node curr = root;
        for(int i=0;i<word.length();i++) {
        	char ch = word.charAt(i);
        	if(curr.child.containsKey(ch)) {
        		curr = curr.child.get(ch);
        		curr.count++;
        	}else {
        		node nn = new node();
        		nn.data=ch;
        		curr.child.put(ch, nn);
        		curr=nn;
        	}
        }curr.isTer=true;
    }
    public int find(String word) {
    	node curr = root;
        for(int i=0;i<word.length();i++) {
        	char ch = word.charAt(i);
        	if(curr.child.containsKey(ch)) {
        		curr = curr.child.get(ch);
        	}else {
        		return 0;
        	}
        }return curr.count;
    }
    public static void main(String[] args) {
		Trie_Contacts tc=new Trie_Contacts();
		tc.insert("hacker");
		tc.insert("hackerrr");
		System.out.println(tc.find("hac"));
		System.out.println();
	}
}
