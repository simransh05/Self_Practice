package coding5;

public class recursion4 {
	public static void permutation(String ques ,String ans) {
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}for(int i=0;i<ques.length();i++) {
			char  ch = ques.charAt(i);
			String s1 = ques.substring(0,i);
			String s2 =ques.substring(i+1);
			permutation(s1+s2,ans+ch);
		}
	}
	
	public static int Countpermutation(String ques ,String ans) {
		if(ques.length()==0) {
			System.out.println(ans);
			return 1;
		}int count =0;
		for(int i=0;i<ques.length();i++) {
			char  ch = ques.charAt(i);
			String s1 = ques.substring(0,i);
			String s2 =ques.substring(i+1);
			count+=Countpermutation(s1+s2,ans+ch);
		}return count;
	}
	public static void SameCharPermutation(String ques, String ans) {
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}for(int i=0;i<ques.length();i++) {
			char  ch = ques.charAt(i);
			boolean val=true;
			for(int j=i+1;j<ques.length();j++) {
				if(ques.charAt(j)==ch) {
					val = false;
					break;
				}
			}if(val==true) {
			    String s1 = ques.substring(0,i);
			    String s2 =ques.substring(i+1);
			    SameCharPermutation(s1+s2,ans+ch);
			}
		}
	}
	static String[] map = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
	public static void keyPaid(String digits ,String ans) { 
		if(digits.length() == 0) {
			System.out.println(ans);
			return;
		}char ch = digits.charAt(0);
		int num= ch-'0';
		String press = map[num];
		for(int i=0;i<press.length();i++) {
			keyPaid(digits.substring(1),ans+press.charAt(i));
		} //combination concept
	}

	public static void main(String[] args) {
//		permutation("abc","");
//		System.out.println(Countpermutation("abc",""));
//		SameCharPermutation("abca","");
		keyPaid("23","");

	}

}
