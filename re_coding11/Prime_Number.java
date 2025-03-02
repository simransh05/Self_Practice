package re_coding11;

public class Prime_Number {
	public static boolean IsPrime(int n) {
		int div = 2;
		while (div * div <= n) {
			if (n % div != 0) {
				return false;
			}
			div++;
		}return true;

	}

	public static void main(String[] args) {
		int n = 79;
		System.out.println(IsPrime(n));

	}

}
