package re_coding5;

public class Count_Subsequence {
//	static int count =0;
	public static void sub(String s,String ans) {
		if(s.length()==0) {
			System.out.print(ans+"  ");
//			count++;
			return ;
		}char ch = s.charAt(0);
		sub(s.substring(1),ans);
		sub(s.substring(1),ans+ch);
	}
	public static int subCount(String s,String ans) {
		if(s.length()==0) {
			System.out.print(ans+"  ");
//			count++;
			return 1;
		}char ch = s.charAt(0);
		int a =subCount(s.substring(1),ans);
		int b =subCount(s.substring(1),ans+ch);
		return a+b;
	}

	public static void main(String[] args) {
		String s = "abc";
		sub(s,"");
		System.out.println();
//		System.out.println(count);
		System.out.println(subCount(s,""));

	}

}
