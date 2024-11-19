package coding1;

public class basicQuestion {
	static String checkPrime(int n) {
		for(int i=2;i<(n/2);i++) {
			if(n%i==0) {
				return "not prime";
			}
		}return "prime";
	}
	static int fib(int n) {
		int a =0;
		int b =1;
		for(int i=0;i<n;i++) {
			int temp = a;
			a = a+b;
			b= temp;
		}return a;
	}
	static void gcd(int a ,int b) {
		int gcd =0;
		for(int i=1;i<=a;i++) {
			if(a%i==0 && b%i==0) {
				gcd =i;
			}
		}System.out.println(gcd);
	}
	static int sumOfDigit(int n) {
		int sum =0;
		while(n!=0) {
			int val = n%10;
			sum+=val;
			n=n/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		int n = 54; int m = 12;
		System.out.println(sumOfDigit(n));
//		gcd(n,m);
//		System.out.println(fib(n));
//		System.out.println(checkPrime(n));
	}

}
