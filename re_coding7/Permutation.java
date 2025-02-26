package re_coding7;

public class Permutation {
	public static void permutation(String s,String ans) {
		if(s.length()==0) {
			System.out.print(ans+"  ");
			return ;
		}
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			String s1= s.substring(0, i);
			String s2 = s.substring(i+1);
			permutation(s1+s2,ans+ch);
		}
	}
	public static int permutationCount(String s,String ans) {
		if(s.length()==0) {
			System.out.print(ans+"  ");
			return 1;
		}int count =0;
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			String s1= s.substring(0, i);
			String s2 = s.substring(i+1);
			count+=permutationCount(s1+s2,ans+ch);
		}return count;
	}

	public static void main(String[] args) {
		String s ="abc";
		permutation(s,"");
		System.out.println();
		System.out.println(permutationCount(s,""));
	}

}
