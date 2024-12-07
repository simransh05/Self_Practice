package Practice5;

public class tries {
	public static class node{
		node[] children; // using array
		boolean endOfWord;
		public node() {
			children =new node[26];
			for(int i=0;i<26;i++) {
				children[i]=null;
			}endOfWord  = false;
		}
	}
	static node root = new node();
	public static void insert(String word) {
		node curr = root;
		for(int i=0;i<word.length();i++) {
			int index = word.charAt(i)-'a';
			if(curr.children[index]==null) {
				curr.children[index]=new node();
			}if(i==word.length()-1) {
				curr.children[index].endOfWord=true;
			}
			curr=curr.children[index];
		}
	}
	static boolean search(String target) {
		node curr = root;
		for(int i=0;i<target.length();i++) {
			int index = target.charAt(i)-'a';
			if(curr.children[index]==null) {
				return false;
			}if(i==target.length()-1 && curr.children[index].endOfWord==false) {
				return false;
			}curr =curr.children[index];
		}return true;
	}
	public static boolean wordBreak(String key) {
		if(key.length()==0) {
			return true;
		}for(int i=1;i<=key.length();i++) {
			String part1= key.substring(0,i);
			String part2 =key.substring(i);
			if(search(part1) && wordBreak(part2)) {
				return true;
			}
		}return false;
	}
	static boolean startWith(String prefix) {
		node curr = root;
		for(int i=0;i<prefix.length();i++) {
			int index = prefix.charAt(i)-'a';
			if(curr.children[index]==null){
				return false;
			}curr =curr.children[index];
		}return true;
	}
	static void countSub(String str) {
		for(int i=0;i<str.length();i++) {
			String suffix =str.substring(i);
			insert(suffix);
		}System.out.println(countNode(root));
	}
	static int countNode(node root) {
		int count =0;
		if(root==null) {
			return 0;
		}for(int i=0;i<26;i++) {
			if(root.children[i]!=null) {
				count+=countNode(root.children[i]);
			}
		}return count+1;
	}
	static String ans="";
	static void LongestSuffix(node root , StringBuilder temp) {
		if(root==null) {
			return;
		}
		for(int i=0;i<26;i++) {
			if(root.children[i]!=null && root.children[i].endOfWord==true) {
				temp.append((char)(i+'a'));
				if(temp.length()>ans.length()) {
					ans =temp.toString();
				}LongestSuffix(root.children[i],temp);
				temp.deleteCharAt(temp.length()-1);
			}
		}
	}
	public static void main(String[] args) {
//		String[]words = {"there","the","a","their","any"};
//		String[]words1 = {"i","like","sam","samsung","mobile"};
//		String [] words2 = {"apple","app","woman","man","mango"};
		String []words3= {"a","banana","app","appl","apply","apple","ap"};
		for(int i=0;i<words3.length;i++) {
			insert(words3[i]);
		}
//			System.out.println(search("there"));
//		System.out.println(search("thor"));
//		System.out.println(wordBreak("ilikesamsung")); // true
//		System.out.println(startWith("moon")); // false
//		String str = "ababa";
//		countSub(str);
		LongestSuffix(root,new StringBuilder(""));
		System.out.println(ans);
	}

}
