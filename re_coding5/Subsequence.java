package re_coding5;

public class Subsequence {
	public static void sub(String s,int idx, String ans) {
		if(idx==s.length()) {
			System.out.print(ans+"  ");
			return ;
		}
		sub(s,idx+1,ans);
		sub(s,idx+1,ans+s.charAt(idx));
	}
	public static void sub(String s,String ans) {
		if(s.length()==0) {
			System.out.print(ans+"  ");
			return ;
		}char ch = s.charAt(0);
		sub(s.substring(1),ans);
		sub(s.substring(1),ans+ch);
	}

	public static void main(String[] args) {
		String s ="abc";
		sub(s,0,"");
		System.out.println();
		sub(s,"");
	}

}
