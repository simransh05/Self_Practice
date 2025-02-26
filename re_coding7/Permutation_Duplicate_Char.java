package re_coding7;

public class Permutation_Duplicate_Char {
	public static void permutation(String s,String ans) {
		if(s.length()==0) {
			System.out.print(ans+"  ");
			return ;
		}
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			boolean val =true;
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(j)==ch) {
					val=false;
					break;
				}
			}if(val==true) {
			     String s1= s.substring(0, i);
			     String s2 = s.substring(i+1);
			     permutation(s1+s2,ans+ch);
			}
		}
	}

	public static void main(String[] args) {
		String s = "abca";
		permutation(s,"");

	}

}