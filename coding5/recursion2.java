package coding5;

public class recursion2 {
	public static int fib(int n ) {
		if(n==0 || n==1) {
			return n;
		}int fib1 = fib(n-1);
		int fib2 =fib(n-2);
		return fib1+fib2;
	}
	public static void subsequence(String str , String ans ) {
		if(str.length() ==0) {
			System.out.println(ans);
			return;
		}
		char ch= str.charAt(0);
		subsequence(str.substring(1),ans);
		subsequence(str.substring(1),ans+ch);
	}
	public static void coin(int n, String ans ) {
		if(n==0) {
			System.out.println(ans);
			return ;
		}coin(n-1,ans+"H");
		coin(n-1,ans+"T");
	}
	
	public static int countcoin(int n, String ans ) {
		if(n==0) {
			System.out.println(ans);
			return 1;
		}
		int a= countcoin(n-1,ans+"H");
		int b =countcoin(n-1,ans+"T");
		return a+b;
	}
	
//	static int count=0;
	public static void coinWithoutHH(int n,String ans) {
		if(n==0) {
			System.out.println(ans);
//			count++;
			return ;
		}if(ans.length()==0 ||ans.charAt(ans.length()-1)!='H') {
		coinWithoutHH(n-1,ans+"H");
		}
		coinWithoutHH(n-1,ans+"T");
	}
	
	public static void main(String[] args) {
		int n=3;
		String str ="abc";
//		System.out.println(fib(n));
//		coin(n,"");
//		coinWithoutHH(n,"");
		System.out.println(countcoin(n,""));
//		System.out.println(count);
//		subsequence(str,"");
		
	}

}
