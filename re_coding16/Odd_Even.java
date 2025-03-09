package re_coding16;

public class Odd_Even {
	public static void check(int n) {
		if ((n & 1) == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}

	public static void main(String[] args) {
		int n = 5;
		check(n);

	}

}
