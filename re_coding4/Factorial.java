package re_coding4;

public class Factorial {
	public static int fec(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		int fn =  fec(n-1);
		return fn*n;
	}
	public static int tailFac(int n ,int ans) {
		if(n==0) {
			return ans;
		}return tailFac(n-1,ans*n);
	}

	public static void main(String[] args) {
		int n =5;
		System.out.println(fec(n));
		System.out.println(tailFac(n,1));// 1 because its multiplying 

	}

}
