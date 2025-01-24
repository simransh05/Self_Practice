package coding22;

import java.util.HashMap;

public class Trie {
	public class node {
		char data;
		HashMap<Character, node> child = new HashMap<>();
		boolean isTer; // for end of word 
	}
	private node root;
	public Trie() {
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
        	}else {
        		node nn = new node();
        		nn.data=ch;
        		curr.child.put(ch, nn);
        		curr=nn;
        	}
        }curr.isTer=true;
    }
    public boolean search(String word) {
    	node curr = root;
        for(int i=0;i<word.length();i++) {
        	char ch = word.charAt(i);
        	if(curr.child.containsKey(ch)) {
        		curr= curr.child.get(ch);
        	}else {
        		return false;
        	}
        }return curr.isTer;
    }
    public boolean startsWith(String prefix) {
    	node curr = root;
        for(int i=0;i<prefix.length();i++) {
        	char ch = prefix.charAt(i);
        	if(curr.child.containsKey(ch)) {
        		curr =curr.child.get(ch);
        	}else {
        		return false;
        	}
        }
        return true;
    }
}

