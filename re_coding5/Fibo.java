package re_coding5;

public class Fibo {
	public static int fib(int n) {
		if(n==0 || n==1) {
			return n;
		} int fib1= fib(n-1);
		int fib2=fib(n-2);
		return fib1+fib2;
	}

	public static void main(String[] args) {
		int n =5;
		System.out.println(fib(n));

	}

}
