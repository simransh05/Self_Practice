package coding6;

public class recursion_backtracking2 {
	public static void allPartition(String str,String ans) {
		if(str.length()==0) {
			System.out.println(ans);
			return;
		}for(int i=1;i<=str.length();i++) {
			String s = str.substring(0,i);
			if(isPalindrome(s)) {
			allPartition(str.substring(i),ans+s +"|");
			}
		}
	}
	public static boolean isPalindrome(String s) {
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}i++;
			j--;
		}return true;
	}

	public static void main(String[] args) {
		// leetcode 39
		// leetcode 131 (partition)
		String str = "nitin";
		allPartition(str,"");
	}

}
