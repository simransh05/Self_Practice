package coding19;

public class fib {
	public static int fibo(int n) {
		if(n==0 || n==1) {
			return n;
		}int fib1 = fibo(n-1);
		int fib2=fibo(n-2);
		return fib1 +fib2;
	}
	public static int fiboTD(int n , int[] dp) {
		if(n==0 || n==1) {
			return n;
		}if(dp[n]!=0) {
			return dp[n];
		}
		int fib1 = fiboTD(n-1,dp);
		int fib2=fiboTD(n-2,dp);
		return dp[n]=fib1 +fib2;
	}
	public static int fiboBU(int n) {
		int [] dp = new int[n+1];
		dp[0]=0;
		dp[1]=1;
		for(int i=2;i<dp.length;i++) {
			dp[i]=dp[i-1]+dp[i-2];
		}return dp[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =8;
		System.out.println(fibo(n));
		System.out.println(fiboTD(n,new int[n+1]));
		System.out.println(fiboBU(n));
	}

}
